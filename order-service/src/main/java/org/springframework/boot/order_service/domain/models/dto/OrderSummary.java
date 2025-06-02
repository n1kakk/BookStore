package org.springframework.boot.order_service.domain.models.dto;

import org.springframework.boot.order_service.domain.models.enums.OrderStatus;

public record OrderSummary(String orderNumber, OrderStatus status) {}
