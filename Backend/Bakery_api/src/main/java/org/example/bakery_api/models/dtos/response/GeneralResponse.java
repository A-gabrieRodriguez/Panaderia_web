package org.example.bakery_api.models.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class GeneralResponse {
    private LocalDate time;
    private int status;
    private String message;
    private String path;
    private Object data;
}
