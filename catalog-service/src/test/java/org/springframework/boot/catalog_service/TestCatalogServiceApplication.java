package org.springframework.boot.catalog_service;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class TestCatalogServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CatalogServiceApplication.class)
                .sources(TestcontainersConfiguration.class)
                .profiles("test")
                .run(args);
    }
}
