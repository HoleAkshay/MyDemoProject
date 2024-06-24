package inc.nimbuspay.proaccountrest.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inc.nimbuspay.proaccountrest.entity.TransactionLog;
import inc.nimbuspay.proaccountrest.repository.TransactionLogRepositoy;
import inc.nimbuspay.proaccountrest.util.Util;

@Service
public class TransactionLogService {

    @Autowired
    private TransactionLogRepositoy transactionLogRepositoy;

    public void insertFinancialInitiationRequestInTransactionLog(String responseJson) {
        TransactionLog transactionLog = new TransactionLog();
        LocalDateTime timestamp = Util.getTimestamp();
        transactionLog.setRequestType("Financial");
        transactionLog.setResponseBody(responseJson);
        transactionLog.setTimestamp(timestamp);
        transactionLogRepositoy.save(transactionLog);
    }

    public void insertReversalRequestInTransactionLog(String responseJson) {
        TransactionLog transactionLog = new TransactionLog();
        LocalDateTime timestamp = Util.getTimestamp();
        transactionLog.setRequestType("Reversal");
        transactionLog.setResponseBody(responseJson);
        transactionLog.setTimestamp(timestamp);
        transactionLogRepositoy.save(transactionLog);
    }
}
