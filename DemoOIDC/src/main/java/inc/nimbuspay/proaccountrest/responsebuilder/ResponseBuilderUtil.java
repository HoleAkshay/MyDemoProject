package inc.nimbuspay.proaccountrest.responsebuilder;

import inc.nimbuspay.proaccountrest.financialrequest.FinancialInitializationBody;
import inc.nimbuspay.proaccountrest.financialrequest.FinancialInitializationHeader;
import inc.nimbuspay.proaccountrest.financialrequest.FinancialIntializationRequest;
import inc.nimbuspay.proaccountrest.financialresponse.Acquirer;
import inc.nimbuspay.proaccountrest.financialresponse.Body;
import inc.nimbuspay.proaccountrest.financialresponse.Document;
import inc.nimbuspay.proaccountrest.financialresponse.Environment;
import inc.nimbuspay.proaccountrest.financialresponse.FinancialResponseV03;
import inc.nimbuspay.proaccountrest.financialresponse.Header;
import inc.nimbuspay.proaccountrest.financialresponse.InitiatingParty;
import inc.nimbuspay.proaccountrest.financialresponse.ProcessingResult;
import inc.nimbuspay.proaccountrest.financialresponse.ResultData;
import inc.nimbuspay.proaccountrest.financialresponse.Transaction;
import inc.nimbuspay.proaccountrest.financialresponse.TransactionAmount;
import inc.nimbuspay.proaccountrest.financialresponse.TransactionAmounts;
import inc.nimbuspay.proaccountrest.financialresponse.TransactionIdentification;

public class ResponseBuilderUtil {

    public static Header setHeaders(FinancialInitializationHeader financialInitializationHeader) {

        return Header.builder()
                .msgFctn(financialInitializationHeader.getMsgFctn())
                .prtcolVrsn(financialInitializationHeader.getPrtcolVrsn())
                .creDtTm(financialInitializationHeader.getCreDtTm())
                .initgPty(InitiatingParty.builder().id(financialInitializationHeader.getInitgPty().getId()).build())
                .build();
    }

    public static Body setBodyPart(FinancialInitializationBody financialInitializationBody) {

        ResultData resultData = new ResultData();
        resultData.setRsltDtls("Approved");
        ProcessingResult processingResult = new ProcessingResult();
        processingResult.setRsltData(resultData);

        Acquirer acquirer = new Acquirer();
        acquirer.setId(financialInitializationBody.getEnvt().getAcqrr().getId());
        Environment environment = new Environment();
        environment.setAcqrr(acquirer);

        TransactionAmount txamt = new TransactionAmount();
        txamt.setAmt(financialInitializationBody.getTx().getTxAmts().getTxAmt().getAmt());
        txamt.setCcy(financialInitializationBody.getTx().getTxAmts().getTxAmt().getCcy());

        TransactionAmounts transactionAmounts = new TransactionAmounts();
        transactionAmounts.setTxAmt(txamt);

        TransactionIdentification identification = new TransactionIdentification();
        identification.setRtrvlRefNb("dummy");
        identification.setSysTracAudtNb("dummy");

        Transaction transaction = new Transaction();
        transaction.setTxTp(financialInitializationBody.getTx().getTxTp());
        transaction.setTxId(identification);
        transaction.setDsptData(null);
        transaction.setTxAmts(transactionAmounts);

        Body body = new Body();
        body.setEnvt(environment);
        body.setTx(transaction);
        body.setPrcgRslt(processingResult);

        return body;
    }

    public static FinancialResponseV03 setFinResponse(FinancialIntializationRequest financialIntializationRequest) {
        FinancialResponseV03 financialResponseV03 = new FinancialResponseV03();
        financialResponseV03.setHdr(setHeaders(financialIntializationRequest.getDocument().getFinInitn().getHdr()));
        financialResponseV03.setBody(setBodyPart(financialIntializationRequest.getDocument().getFinInitn().getBody()));

        return financialResponseV03;
    }

    public static Document setDocumentResponse(FinancialIntializationRequest financialIntializationRequest) {
        Document document = new Document();
        document.setFinRspn(setFinResponse(financialIntializationRequest));
        return document;
    }

}
