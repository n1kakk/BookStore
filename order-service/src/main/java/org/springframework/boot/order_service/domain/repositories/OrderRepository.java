package org.springframework.boot.order_service.domain.repositories;

import org.springframework.boot.order_service.domain.models.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {}
