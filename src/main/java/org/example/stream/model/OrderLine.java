package org.example.stream.model;

import org.example.stream.FilterEx;

import java.math.BigDecimal;

public class OrderLine {
    private long id;
    private OrderLineType type;
    private long productId;
    private int quantitiy;
    private BigDecimal amout;

    public enum OrderLineType {
        PURCHASE,
        DISCOUNT
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderLineType getType() {
        return type;
    }

    public void setType(OrderLineType type) {
        this.type = type;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public void setAmout(BigDecimal amout) {
        this.amout = amout;
    }
}
