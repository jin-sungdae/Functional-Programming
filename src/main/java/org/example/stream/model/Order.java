package org.example.stream.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private LocalDateTime createdAt;
    private long createdByUserId;
    private OrderStatus status;
    private BigDecimal amount;
    private List<OrderLine> orderLines;

    enum OrderStatus {
        CRETED,
        IN_PROGRESS,
        ERROR,
        PROCESSED
    }
}