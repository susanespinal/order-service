package dev.sespinal.orderservice.mapper;

import dev.sespinal.orderservice.dto.OrderRequest;
import dev.sespinal.orderservice.dto.OrderResponse;
import dev.sespinal.orderservice.model.entity.Order;

public final class OrderMapper {

  private OrderMapper() {
    throw new AssertionError("Utility class, no debe instanciarse");
  }

  public static OrderResponse toResponse(Order order) {
    return new OrderResponse(
        order.getId(),
        order.getProductId(),
        order.getQuantity(),
        order.getCustomerName(),
        order.getCustomerEmail(),
        order.getTotalAmount(),
        order.getStatus(),
        order.getCreatedAt()
    );
  }

  public static Order toEntity(OrderRequest request, Order entity) {

        entity.setProductId(request.getProductId());
        entity.setQuantity(request.getQuantity());
        entity.setCustomerName(request.getCustomerName());
        entity.setCustomerEmail(request.getCustomerEmail());
        entity.setTotalAmount(request.getTotalAmount());
        return entity;
  }

  public static Order toEntity(OrderRequest request) {
    Order o = new Order();
    return toEntity(request, o);
  }

}