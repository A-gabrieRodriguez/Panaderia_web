package org.example.bakery_api.utils.mappers;

import org.example.bakery_api.models.dtos.request.customer.CustomerCreateRequest;
import org.example.bakery_api.models.dtos.response.CustomerResponse;
import org.example.bakery_api.models.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring") //@Mapper es usado para indicar que esta clase es un mapper y se implementará
// como un bean de Spring.
public interface CustomerMappers { //Usamos una interfaz para definir los métodos de mapeo
    // entre DTOs y entidades por que MapStruct genera automáticamente la implementación de esta interfaz en
    // tiempo de compilación DTO -> Entity


    @Mapping(target = "id", ignore = true)// Ignora el campo "id" al mapear de CustomerCreateRequest a Customer,
        // ya que el ID se generará automáticamente.
    Customer toEntity(CustomerCreateRequest request);

    // Entity -> ResponseDTO
    //Resive una entidad Customer y devuelve un DTO CustomerResponse
    CustomerResponse toResponseDto(Customer customer);

    // Lista de entidades -> Lista de DTOs
    // Resive una lista de entidades Customer y devuelve una lista de DTOs CustomerResponse
    List<CustomerResponse> toResponseList(List<Customer> customers);

    // Update parcial
    // Actualiza una entidad Customer existente con los datos de un DTO CustomerCreateRequest.
    // El campo "id" se ignora durante la actualización.
    @Mapping(target = "id", ignore = true)
    void updateCustomer(CustomerCreateRequest request, @MappingTarget Customer customer);

}
