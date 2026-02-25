package org.example.bakery_api.models.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {
    //Clase para manejar los errores de la API, con campos para la hora del error, el estado HTTP, el mensaje de error y la ruta que causó el error.
    private LocalDate time;
    private int status;
    private Object message;
    private String path;
}
