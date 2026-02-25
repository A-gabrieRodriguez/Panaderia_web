package org.example.bakery_api.services.implement;

import lombok.AllArgsConstructor;
import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.request.customer.CustomerUpdateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;
import org.example.bakery_api.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@AllArgsConstructor

//Usarmos implment enves de extends porque estamos implementando desde una interface
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerResponse createCustomer(CustomerCreateRequest request) {
        return null;
    }

    @Override
    public CustomerResponse getbyId(UUID id) {
        return null;
    }

    @Override
    public CustomerResponse updateCustomer(CustomerUpdateRequest request) {
        return null;
    }

    @Override
    public List<CustomerResponse> getallCustomers() {
        return List.of();
    }
}
