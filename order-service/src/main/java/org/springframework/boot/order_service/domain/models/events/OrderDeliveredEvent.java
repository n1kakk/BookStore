package org.springframework.boot.order_service.domain.models.events;

import java.time.LocalDateTime;
import java.util.Set;
import org.springframework.boot.order_service.domain.models.dto.OrderItem;
import org.springframework.boot.order_service.domain.models.entity.Address;
import org.springframework.boot.order_service.domain.models.entity.Customer;

public record OrderDeliveredEvent(
        String eventId,
        String orderNumber,
        Set<OrderItem> items,
        Customer customer,
        Address deliveryAddress,
        LocalDateTime createdAt) {}
