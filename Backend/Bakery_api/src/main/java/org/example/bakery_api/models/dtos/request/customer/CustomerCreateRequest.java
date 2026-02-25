package org.example.bakery_api.models.dtos.request.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerCreateRequest {

    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

}
