package inc.nimbuspay.proaccountrest.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import inc.nimbuspay.proaccountrest.financialrequest.FinancialIntializationRequest;
import inc.nimbuspay.proaccountrest.financialresponse.FinancialResponse;

import inc.nimbuspay.proaccountrest.responsebuilder.FinancialResponseBuilderUtil;
import inc.nimbuspay.proaccountrest.responsebuilder.ReversalResponseBuilder;
import inc.nimbuspay.proaccountrest.reversalrequest.ReversalInitiationRequest;

import inc.nimbuspay.proaccountrest.reversalresponse.RevesalResponse;
import inc.nimbuspay.proaccountrest.service.DebugLogService;
import inc.nimbuspay.proaccountrest.service.TransactionLogService;
import inc.nimbuspay.proaccountrest.util.Util;

@RestController
@RequestMapping("/acquirer-to-issuer-card-transactions")
public class AcquirerToIssuerCardTransactionsController {
    private static final Logger logger = LoggerFactory
            .getLogger(AcquirerToIssuerCardTransactionsController.class);

    @Autowired
    private DebugLogService debugLogService;

    @Autowired
    private TransactionLogService transactionLogService;

   

    @PostMapping("/financial")
    public FinancialResponse financial(
            @RequestBody FinancialIntializationRequest financialIntializationRequest) {

        String jsonRequest = Util.convertObjToString(financialIntializationRequest);
        debugLogService.insertFinancialInitiationRequestInDebugLog(jsonRequest);
        logger.info("Financial Initialization Request  {}:", jsonRequest);
        FinancialResponse financialResponse = new FinancialResponse();
        financialResponse.setDocument(FinancialResponseBuilderUtil.setDocumentResponse(financialIntializationRequest));
        String responseJson = Util.convertObjToString(financialResponse);
        logger.info("Financial Initialization Response  {}:", responseJson);
        transactionLogService.insertFinancialInitiationRequestInTransactionLog(responseJson);
        return financialResponse;
    }

    @PostMapping("/reversal")
    public RevesalResponse reversal(@RequestBody ReversalInitiationRequest reversalInitiationRequest) {

        String jsonRequest = Util.convertObjToString(reversalInitiationRequest);
        debugLogService.insertReversalRequestInDebugLog(jsonRequest);
        logger.info("Reversal Initialization Request  {}:", jsonRequest);
        RevesalResponse reversalResponse = new RevesalResponse();
        reversalResponse.setDocument(ReversalResponseBuilder.setDocumentResponse(reversalInitiationRequest));
        String responseJson = Util.convertObjToString(reversalResponse);
        logger.info("Reversal Initialization Response  {}:", responseJson);
        transactionLogService.insertReversalRequestInTransactionLog(responseJson);
        return reversalResponse;

    }

}
