package ru.kostyanetskiy.it;

import ch.qos.logback.classic.Logger;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ItBuilderApplication {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ItBuilderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ItBuilderApplication.class, args);
        testLog();
    }

    private static void testLog() {
        Map<String, String> user = new HashMap<String, String>();
        user.put("user_id", "87656");
        user.put("SSN", "786445563");
        user.put("address", "22 Street");
        user.put("city", "Chicago");
        user.put("Country", "U.S.");
        user.put("ip_address", "192.168.1.1");
        user.put("email_id", "spring@baeldung.com");
        user.put("uid", "e6504f1c-5473-4455-954d-73c5c8867027");
        JSONObject userDetails = new JSONObject(user);

        logger.info("User JSON: {}", userDetails);
        logger.info("User JSON: {}", userDetails);
    }

}
