package com.example.email.utils;

import com.example.email.model.EmailMessage;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import static javax.mail.Message.RecipientType;

public class EmailUtils {

    public static void sendEmail(EmailMessage email) {

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", email.getHost());
        properties.setProperty("mail.smtp.port","2525");

        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(email.getFrom()));

            // Set To: header field of the header.
            message.addRecipient(RecipientType.TO, new InternetAddress(email.getTo()));

            // Set Subject: header field
            message.setSubject(email.getSubject());

            // Send the actual HTML message, as big as you like
            message.setContent(email.getContent(), email.getType());

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException exception) {
            exception.printStackTrace();
        }
    }
}
