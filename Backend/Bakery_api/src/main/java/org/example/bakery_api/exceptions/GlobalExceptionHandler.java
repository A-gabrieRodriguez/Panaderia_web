package org.example.bakery_api.exceptions;

import org.example.bakery_api.models.dtos.response.ErrorResponse;
import org.example.bakery_api.utils.ResponseBuilderUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Esta anotación se utiliza para manejar excepciones de manera global
// en una aplicación Spring Boot. Permite definir métodos que se ejecutarán cuando
// se produzcan excepciones específicas, proporcionando una forma centralizada de
// gestionar errores y enviar respuestas adecuadas al cliente.
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleCustomerNotFound(CustomerNotFoundException e) {
        return ResponseBuilderUtil.buildErrorResponse(e, HttpStatus.NOT_FOUND, e.getMessage());
    }
}
