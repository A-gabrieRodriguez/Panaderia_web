package org.example.bakery_api.utils;

import org.example.bakery_api.models.dtos.response.ErrorResponse;
import org.example.bakery_api.models.dtos.response.GeneralResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;

public class ResponseBuilderUtil {

    // Este metodo se encarga de construir una respuesta de error personalizada
    // Recibe una excepción, un estado HTTP y un mensaje personalizado para incluir en la respuesta
    public static ResponseEntity<ErrorResponse> buildErrorResponse(Exception e, HttpStatus status, Object data) {
        String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().build().getPath();
        return ResponseEntity.status(status).body(ErrorResponse.builder()
                .message(data) //campo message de ErrorResponse
                .status(status.value())//codigo de estado HTTP, ejemplo 404, 500, etc.,campo status de ErrorResponse
                .time(LocalDate.now())//fecha del error, campo time de ErrorResponse
                .path(uri)//ruta del endpoint que genero el error, campo path de ErrorResponse
                .build());//Construccion del objeto ErrorResponse usando el patron builder
    }

     public static ResponseEntity<GeneralResponse> buildErrorResponse(String message, HttpStatus status, Object data) {
        String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().build().getPath();
        return ResponseEntity.status(status).body(GeneralResponse.builder()
                .message(message) //campo message de ErrorResponse
                .status(status.value())//codigo de estado HTTP, ejemplo 404, 500, etc.,campo status de ErrorResponse
                .data(data)
                .time(LocalDate.now())//fecha del error, campo time de ErrorResponse
                .path(uri)//ruta del endpoint que genero el error, campo path de ErrorResponse
                .build());//Construccion del objeto ErrorResponse usando el patron builder
         }
}
