package com.imc.model_attribute.dto;


import org.springframework.web.bind.annotation.BindParam;

public record StudentSearchDTO(
        @BindParam("class")
        String className,
        String section,
        String branch,
        String state,
        String country
) {
}
