package com.vijayhealth.entity.book;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "res_id")
    private Long resid;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "res_published_at")
    private LocalDateTime resPublishedAt;

    @Column(name = "res_updated_at")
    private LocalDateTime resUpdatedAt;

    @Column(name = "res_deleted_at")
    private LocalDateTime resDeletedAt;

    @Column(name = "res_deleted")
    private Boolean resDeleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getResPublishedAt() {
        return resPublishedAt;
    }

    public void setResPublishedAt(LocalDateTime resPublishedAt) {
        this.resPublishedAt = resPublishedAt;
    }

    public LocalDateTime getResUpdatedAt() {
        return resUpdatedAt;
    }

    public void setResUpdatedAt(LocalDateTime resUpdatedAt) {
        this.resUpdatedAt = resUpdatedAt;
    }

    public LocalDateTime getResDeletedAt() {
        return resDeletedAt;
    }

    public void setResDeletedAt(LocalDateTime resDeletedAt) {
        this.resDeletedAt = resDeletedAt;
    }

    public Boolean getResDeleted() {
        return resDeleted;
    }

    public void setResDeleted(Boolean resDeleted) {
        this.resDeleted = resDeleted;
    }

    public Long getResid() {return resid;}

    public void setResid(Long resid) {this.resid = resid;}


}
