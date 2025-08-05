package com.imc.webhook.dto;

import java.math.BigDecimal;

public record PaymentRequest(
        String transactionId,
        String userId,
        BigDecimal amount
) {
}
