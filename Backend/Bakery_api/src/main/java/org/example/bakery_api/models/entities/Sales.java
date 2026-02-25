package org.example.bakery_api.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idSales;

    private Float priceTotal;
    private String dateSales;
    private String product;
    private String costumer;

    //many sales can belong to one customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id") // FK in sales table
    private Customer customer;

    //many sales can belong to one employee_bakery
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_bakery_id") // FK in sales table
    private EmployeeBakery employeeBakery;

    //Sales can have many SalesDetails
    @OneToMany(mappedBy = "sales", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SalesDetails> salesDetails;
}
