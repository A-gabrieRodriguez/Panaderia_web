package org.example.bakery_api.utils.mappers;

import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;
import org.example.bakery_api.models.entities.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMappers {

    public static Customer ToEntityCreate(CustomerCreateRequest request) {
        return Customer.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();
    }

    // Converting Customer to CustomerResponse
    public static CustomerResponse ToDTO(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .phone(customer.getPhone())
                .address(customer.getAddress())
                .build();
    }

    public static Customer ToEntityUpdate(CustomerResponse updatedCustomer) {
        return Customer.builder()
                .id(updatedCustomer.getId())
                .name(updatedCustomer.getName())
                .email(updatedCustomer.getEmail())
                .phone(updatedCustomer.getPhone())
                .address(updatedCustomer.getAddress())
                .build();
    }

    public static List<CustomerResponse> ToDTOList(List<Customer> allCustomers) {
        return allCustomers.stream().map(CustomerMappers::ToDTO).collect(Collectors.toList());
    }

}
