package com.example.email;

import com.example.email.model.EmailMessage;
import com.example.email.utils.EmailUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SendEmail {

    private static final Logger logger = LogManager.getLogger(SendEmail.class);


    public static void main(String[] args) {

        EmailMessage email = new EmailMessage();

        email.setHost("localhost");
        email.setType("text/html");

        email.setFrom("no-reply@phoenixinc.com");
        email.setTo("chetanns@gmail.com");
        email.setSubject("Test Email");
        email.setContent("<H1>Sending the Sample Email</H2");

        EmailUtils.sendEmail(email);

        System.out.println("Testing my app");
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }
}
