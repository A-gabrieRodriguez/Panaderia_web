package org.example.bakery_api.models.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CustomerResponse {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
}
