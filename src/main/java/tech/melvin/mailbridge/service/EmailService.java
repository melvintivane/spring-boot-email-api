package tech.melvin.mailbridge.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

   private final JavaMailSender mailSender;

   public EmailService(JavaMailSender mailSender) {
      this.mailSender = mailSender;
   }

   public void sendEmail(String to, String subject, String text) {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom("lolice5198@gamebcs.com");
      message.setTo(to);
      message.setSubject(subject);
      message.setText(text);
      mailSender.send(message);
   }
}
