package org.example.bakery_api.exceptions;

// La clase CustomerNotFoundException eredará de RuntimeException
//lo que significa que es una excepción no verificada. Esto es útil para indicar
//que un cliente no se encontró en la base de datos o en el sistema,
// y puede ser lanzada en métodos que buscan clientes por ID u otros criterios.
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
