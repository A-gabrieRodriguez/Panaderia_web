package org.example.bakery_api.services.implement;

import lombok.AllArgsConstructor;
import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.request.customer.CustomerUpdateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;
import org.example.bakery_api.models.entities.Customer;
import org.example.bakery_api.repository.CustomerRespository;
import org.example.bakery_api.services.CustomerService;
import org.example.bakery_api.utils.mappers.CustomerMappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor

//Usarmos implment enves de extends porque estamos implementando desde una interface
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRespository customerRespository;
    private final CustomerMappers customerMapper;

    @Override
    public CustomerResponse createCustomer(CustomerCreateRequest request) {

        // Convertir el DTO de solicitud a una entidad Customer utilizando el mapper
        Customer customer = customerMapper.toEntity(request);

        // Guardar la entidad Customer en la base de datos
        Customer savedCustomer = customerRespository.save(customer);

        return customerMapper.toResponseDto(savedCustomer);
    }

    @Override
    public CustomerResponse getbyId(UUID id) {
        // Buscar el cliente por su ID
        Customer customer = customerRespository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
        return customerMapper.toResponseDto(customer);
    }

    @Override
    public CustomerResponse updateCustomer(CustomerUpdateRequest request) {
        return null;
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return customerRespository.findAll().stream()
                .map(customerMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
