package inc.nimbuspay.proaccountrest.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Util {

    private static Environment environment;

    public Util(Environment environment) {
        Util.environment = environment;
    }

    public static String convertObjToString(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {

            json = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static LocalDateTime getTimestamp() {
        ZoneId zoneId = ZoneId.of(environment.getProperty("timezone"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime timestamp = LocalDateTime.now(zoneId);
        String formattedDateTime = timestamp.format(formatter);
        return LocalDateTime.parse(formattedDateTime, formatter);
    }
}
