package org.example.bakery_api.services;

import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.request.customer.CustomerUpdateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
    CustomerResponse createCustomer(CustomerCreateRequest request);
    CustomerResponse getbyId(UUID id);
    CustomerResponse updateCustomer(CustomerUpdateRequest request);
    List<CustomerResponse> getAllCustomers();

}
