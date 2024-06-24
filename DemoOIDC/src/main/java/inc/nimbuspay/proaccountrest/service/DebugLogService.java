package inc.nimbuspay.proaccountrest.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inc.nimbuspay.proaccountrest.entity.DebugLog;
import inc.nimbuspay.proaccountrest.repository.DebugLogRepository;
import inc.nimbuspay.proaccountrest.util.Util;

@Service
public class DebugLogService {

    @Autowired
    private DebugLogRepository debugLogRepository;

    public void insertFinancialInitiationRequestInDebugLog(String jsonRequest) {
        DebugLog debugLog = new DebugLog();
        LocalDateTime timestamp = Util.getTimestamp();
        debugLog.setRequestType("Financial");
        debugLog.setTimestamp(timestamp);
        debugLog.setRequest(jsonRequest);
        debugLogRepository.save(debugLog);
    }

    public void insertReversalRequestInDebugLog(String jsonRequest) {
        DebugLog debugLog = new DebugLog();
        LocalDateTime timestamp = Util.getTimestamp();
        debugLog.setRequestType("Reversal");
        debugLog.setTimestamp(timestamp);
        debugLog.setRequest(jsonRequest);
        debugLogRepository.save(debugLog);
    }
}
