package com.common.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Launcher {
    private final static Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
        logger.info("Project Version: {}", SpringBootVersion.getVersion());
    }
}
