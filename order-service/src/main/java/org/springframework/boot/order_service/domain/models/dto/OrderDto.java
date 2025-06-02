package org.springframework.boot.order_service.domain.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import org.springframework.boot.order_service.domain.models.entity.Address;
import org.springframework.boot.order_service.domain.models.entity.Customer;
import org.springframework.boot.order_service.domain.models.enums.OrderStatus;

public record OrderDto(
        String orderNumber,
        String user,
        Set<OrderItem> items,
        Customer customer,
        Address deliveryAddress,
        OrderStatus status,
        String comments,
        LocalDateTime createdAt) {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public BigDecimal getTotalAmount() {
        return items.stream()
                .map(item -> item.price().multiply(BigDecimal.valueOf(item.quantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
