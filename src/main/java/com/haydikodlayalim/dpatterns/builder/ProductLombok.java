package com.haydikodlayalim.dpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public class ProductLombok {

    private Long id;
    private String name;
    private LocalDateTime date;
    private Boolean inStock;
    private String description;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductLombok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
