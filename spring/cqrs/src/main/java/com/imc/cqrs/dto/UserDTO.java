package com.imc.cqrs.dto;

import java.time.LocalDateTime;

public record UserDTO(
        Long id,
        String name,
        LocalDateTime createdAt
) {
}
