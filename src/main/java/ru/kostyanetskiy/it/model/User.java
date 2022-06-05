package ru.kostyanetskiy.it.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String title;
    private String phone;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "user_code", updatable = false)
    private String userCode;
    private boolean verified;
    private boolean locked;
    @Column(name = "ACC_CRED_EXPIRED")
    private boolean accountCredentialsExpired;

    public User() {
    }

    public User(Long id, String username, String password, String email, String title, String phone, String imageUrl, String userCode, boolean verified, boolean locked, boolean accountCredentialsExpired) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.title = title;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.userCode = userCode;
        this.verified = verified;
        this.locked = locked;
        this.accountCredentialsExpired = accountCredentialsExpired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isAccountCredentialsExpired() {
        return accountCredentialsExpired;
    }

    public void setAccountCredentialsExpired(boolean accountCredentialsExpired) {
        this.accountCredentialsExpired = accountCredentialsExpired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return verified == user.verified &&
                locked == user.locked &&
                accountCredentialsExpired == user.accountCredentialsExpired &&
                Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(title, user.title) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(imageUrl, user.imageUrl) &&
                Objects.equals(userCode, user.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, title, phone, imageUrl, userCode, verified, locked, accountCredentialsExpired);
    }
}

