package com.imc.payment.dto;

import java.math.BigDecimal;

public record PaymentRequest(
        String transactionId,
        String userId,
        BigDecimal amount
) {
}
