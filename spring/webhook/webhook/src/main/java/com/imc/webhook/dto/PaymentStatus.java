package com.imc.webhook.dto;

public record PaymentStatus(
        String transactionId,
        String status
) {
}
