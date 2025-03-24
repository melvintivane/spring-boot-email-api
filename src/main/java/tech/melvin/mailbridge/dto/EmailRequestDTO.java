package tech.melvin.mailbridge.dto;

public record EmailRequestDTO(String to, String subject, String text) {
}
