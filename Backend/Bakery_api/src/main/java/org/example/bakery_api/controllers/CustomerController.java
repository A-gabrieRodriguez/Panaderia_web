package org.example.bakery_api.controllers;

import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;
import org.example.bakery_api.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    //Creamos un constructor para inyectar el servicio de CustomerService
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/new-customer")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerCreateRequest request) {
        CustomerResponse customerResponse = customerService.createCustomer(request);
        return ResponseEntity.ok(customerResponse);

        /*
        * Una prueva de postman para probar el endpoint de crear un nuevo cliente sería la siguiente:
        * URL: http://localhost:8080/api/customers/new-customer
        * Method: POST
        * Headers: Content-Type: application/json
        * Body:
        * {
        *   "name": "John Doe",
        *   "email": "john.doe@example.com",
        *   "phone": "1234567890",
        *   "address": "123 Main St, City, Country"
        *   "password": "password123"
        * }
        *
        *
        * */

    }

    @GetMapping("/get-all-customers")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

}
