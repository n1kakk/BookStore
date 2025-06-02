package org.springframework.boot.catalog_service.domain;

public class ProductMapper {
    static Product toProduct(ProductEntity entity) {
        return new Product(
                entity.getName(), entity.getCode(), entity.getDescription(), entity.getImageUrl(), entity.getPrice());
    }
}
