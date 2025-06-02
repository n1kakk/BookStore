package org.springframework.boot.catalog_service.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_generator")
    @SequenceGenerator(name = "product_id_generator", sequenceName = "product_id_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Product code is required") private String code;

    @Column(nullable = false)
    @NotEmpty(message = "Product name is required") private String name;

    private String description;
    private String imageUrl;

    @Column(nullable = false)
    @NotNull(message = "Product price is required") @DecimalMin("0.1") private BigDecimal price;
}
