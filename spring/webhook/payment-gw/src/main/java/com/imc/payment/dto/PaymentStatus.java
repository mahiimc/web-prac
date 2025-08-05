package com.imc.payment.dto;

public record PaymentStatus(
        String transactionId,
        String status
) {
}
