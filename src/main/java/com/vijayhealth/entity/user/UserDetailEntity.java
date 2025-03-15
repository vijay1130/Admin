package com.vijayhealth.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_detail")
public class UserDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "res_id")
    private Long resId;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mediaPath")
    private String mediaPath;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "res_published_at")
    private LocalDateTime resPublishedAt;

    @Column(name = "res_updated_at")
    private LocalDateTime resUpdatedAt;

    @Column(name = "res_deleted_at")
    private LocalDateTime resDeletedAt;

    @Column(name = "res_deleted")
    private Boolean resDeleted;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public @NotBlank String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank String lastName) {
        this.lastName = lastName;
    }

    public String getMediaPath() {
        return mediaPath;
    }

    public void setMediaPath(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    public @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank String email) {
        this.email = email;
    }

    public @NotBlank String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank String password) {
        this.password = password;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
}
