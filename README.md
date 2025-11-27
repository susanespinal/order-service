# order-service
## Aquitectura 
```
orders/
 ├── controller/
 |    └── OrdersController.java
 ├── dto/
 │    ├── ErrorResponse.java
 │    ├── OrdersRequest.java
 │    └── OrdersResponse.java
 ├── exceptions/
 │    ├── GlobalExceptionHandler.java
 │    └── ResourceNotFoundException.java
 ├── kafka/
 |    └── consumer/
 |         └── OrderEventConsumer.java
 |    └── event/
 │         ├── OrderCancelledEvent.java
 │         ├── OrderConfirmedEvent.java
 │         └── OrderPlacedEvent.java
 |    └── producer/
 |         └── OrderEventProducer
 ├── mapper/
 │    └── OrderMapper.java
 ├── model/
 │    └── Entity /
 │         ├── Order.java
 │         └── OrderStatusItem.java
 ├── repository/
 │    └── OrderRepository.java
 ├── service/
 │    └── OrderService.java
 └── OrderServiceApplication.java
```
