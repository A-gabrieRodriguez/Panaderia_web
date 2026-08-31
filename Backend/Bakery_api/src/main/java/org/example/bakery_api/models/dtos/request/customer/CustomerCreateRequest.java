package org.example.bakery_api.models.dtos.request.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreateRequest {

    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

}
