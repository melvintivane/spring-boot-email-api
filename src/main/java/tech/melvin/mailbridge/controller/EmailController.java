package tech.melvin.mailbridge.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.melvin.mailbridge.dto.EmailRequestDTO;
import tech.melvin.mailbridge.service.EmailService;

@RestController
public class EmailController {

   private final EmailService emailService;

   public EmailController(EmailService emailService) {
      this.emailService = emailService;
   }

   @PostMapping("/send-email")
   public String sendEmail(@RequestBody EmailRequestDTO request) {
      emailService.sendEmail(
           request.to(),
           request.subject(),
           request.text()
      );
      return "E-mail enviado com sucesso!";
   }
}
