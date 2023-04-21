package org.example.optional.model;

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

    public OrderLineType getType() {
        return type;
    }

    public long getProductId() {
        return productId;
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public OrderLine setId(long id) {
        this.id = id;
        return this;
    }

    public OrderLine setType(OrderLineType type) {
        this.type = type;
        return this;
    }

    public OrderLine setProductId(long productId) {
        this.productId = productId;
        return this;
    }

    public OrderLine setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
        return this;
    }

    public OrderLine setAmout(BigDecimal amout) {
        this.amout = amout;
        return this;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", type=" + type +
                ", productId=" + productId +
                ", quantitiy=" + quantitiy +
                ", amout=" + amout +
                '}';
    }
}
