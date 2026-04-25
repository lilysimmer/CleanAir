package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "full_name", length = 150, nullable = false)
    private String fullName;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", length = 255, nullable = false)
    private String passwordHash;

    @Column(name = "reset_token", length = 255)
    private String resetToken;

    @Column(name = "role", length = 50)
    private String role;

    @Column(name = "dark_mode")
    private Boolean darkMode = false;

    @Column(name = "measurement_unit", length = 20)
    private String measurementUnit;

    @Column(name = "default_payment_method", length = 50)
    private String defaultPaymentMethod;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "is_active")
    private Boolean isActive = true;

    public User() {
    }

    public User(Long idUser, String fullName, String email, String passwordHash, String resetToken, String role, Boolean darkMode, String measurementUnit, String defaultPaymentMethod, LocalDateTime registrationDate, Boolean isActive) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.resetToken = resetToken;
        this.role = role;
        this.darkMode = darkMode;
        this.measurementUnit = measurementUnit;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.registrationDate = registrationDate;
        this.isActive = isActive;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
