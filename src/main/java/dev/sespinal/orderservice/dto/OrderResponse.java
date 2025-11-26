package dev.sespinal.orderservice.dto;

import dev.sespinal.orderservice.model.entity.OrderStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
  private Long id;
  private Long productId;
  private Integer quantity;
  private String customerName;
  private String customerEmail;
  private BigDecimal totalAmount;
  private OrderStatus status;
  private LocalDateTime createdAt;
}