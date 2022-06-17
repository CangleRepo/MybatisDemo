package com.cangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author raorui
 * @date 2022/6/16 16:06
 */
@SpringBootApplication
public class HappinessMeeting {
    private static final Logger logger = LoggerFactory.getLogger(HappinessMeeting.class);
    public static void main(String[] args) {
        SpringApplication.run(HappinessMeeting.class, args);
        logger.info("HappinessMeeting service start success!");
    }
}
