package org.example.bakery_api.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales_details")
public class SalesDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idSalesDetails;

    private String productName;
    private Integer quantity;
    private Float unitPrice;
    private Float totalPrice;//we going to store the total price for this item (quantity * unitPrice)

    //many sales details can belong to one product
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id") // FK in sales_details table
    private Product product;

    //many sales details can belong to one sale
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_id") // FK in sales_details table
    private Sales sales;
}
