package inc.nimbuspay.proaccountrest.responsebuilder;

import inc.nimbuspay.proaccountrest.reversalrequest.ReversalInitiationBody;
import inc.nimbuspay.proaccountrest.reversalrequest.ReversalInitiationHeader;
import inc.nimbuspay.proaccountrest.reversalrequest.ReversalInitiationRequest;
import inc.nimbuspay.proaccountrest.reversalresponse.Acquirer;
import inc.nimbuspay.proaccountrest.reversalresponse.Body;
import inc.nimbuspay.proaccountrest.reversalresponse.Document;
import inc.nimbuspay.proaccountrest.reversalresponse.Enviroment;
import inc.nimbuspay.proaccountrest.reversalresponse.Header;
import inc.nimbuspay.proaccountrest.reversalresponse.InitialParty;
import inc.nimbuspay.proaccountrest.reversalresponse.ProcessingResult;
import inc.nimbuspay.proaccountrest.reversalresponse.ResultData;
import inc.nimbuspay.proaccountrest.reversalresponse.ReversalResponsev03;
import inc.nimbuspay.proaccountrest.reversalresponse.Transaction;
import inc.nimbuspay.proaccountrest.reversalresponse.TransactionAmount;
import inc.nimbuspay.proaccountrest.reversalresponse.TransactionAmounts;
import inc.nimbuspay.proaccountrest.reversalresponse.TransactionIdentification;

public class ReversalResponseBuilder {

    public static Header setHeaders(
            ReversalInitiationHeader reversalInitiationHeader) {

        return Header.builder()
                .msgFctn(reversalInitiationHeader.getMsgFctn())
                .prtcolVrsn(reversalInitiationHeader.getPrtcolVrsn())
                .creDtTm(reversalInitiationHeader.getCreDtTm())
                .initgPty(InitialParty.builder().id(reversalInitiationHeader.getInitgPty().getId()).build())
                .build();
    }

    public static Body setBodyPart(ReversalInitiationBody reversalInitiationBody) {

        ResultData resultData = new ResultData();
        resultData.setRsltDtls("Approved");
        ProcessingResult processingResult = new ProcessingResult();
        processingResult.setRsltData(resultData);

        Acquirer acquirer = new Acquirer();
        acquirer.setId(reversalInitiationBody.getEnvt().getAcqrr().getId());
        Enviroment enviroment = new Enviroment();
        enviroment.setAcqrr(acquirer);

        TransactionAmount txamt = new TransactionAmount();
        txamt.setAmt(reversalInitiationBody.getTx().getTxAmts().getTxAmt().getAmt());
        txamt.setCcy(reversalInitiationBody.getTx().getTxAmts().getTxAmt().getCcy());

        TransactionAmounts transactionAmounts = new TransactionAmounts();
        transactionAmounts.setTxAmt(txamt);

        TransactionIdentification identification = new TransactionIdentification();
        identification.setRtrvlRefNb(reversalInitiationBody.getTx().getTxId().getRtrvlRefNb());
        identification.setSysTracAudtNb(reversalInitiationBody.getTx().getTxId().getSysTracAudtNb());

        Transaction transaction = new Transaction();
        transaction.setTxTp(reversalInitiationBody.getTx().getTxTp());
        transaction.setTxId(identification);
        transaction.setTxAmts(transactionAmounts);

        Body body = new Body();
        body.setEnvt(enviroment);
        body.setTx(transaction);
        body.setPrcgRslt(processingResult);

        return body;
    }

    public static ReversalResponsev03 setReversalResponse(ReversalInitiationRequest reversalInitiationRequest) {
        ReversalResponsev03 reversalResponsev03 = new ReversalResponsev03();
        reversalResponsev03.setHdr(setHeaders(reversalInitiationRequest.getDocument().getRvslInitn().getHdr()));
        reversalResponsev03.setBody(setBodyPart(reversalInitiationRequest.getDocument().getRvslInitn().getBody()));

        return reversalResponsev03;
    }

    public static Document setDocumentResponse(ReversalInitiationRequest reversalInitiationRequest) {
        Document document = new Document();
        document.setRvslRspn(setReversalResponse(reversalInitiationRequest));
        return document;
    }

}
