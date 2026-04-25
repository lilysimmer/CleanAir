package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "GeneratedAlert")
public class GeneratedAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGeneratedAlert;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_location", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "id_contaminant", nullable = false)
    private ContaminantType contaminant;

    @Column(name = "trigger_value", nullable = false)
    private Double triggerValue;

    @Column(name = "sent_date", nullable = false)
    private LocalDateTime sentDate;

    public GeneratedAlert() {
    }

    public GeneratedAlert(Long idGeneratedAlert, User user, Location location, ContaminantType contaminant, Double triggerValue, LocalDateTime sentDate) {
        this.idGeneratedAlert = idGeneratedAlert;
        this.user = user;
        this.location = location;
        this.contaminant = contaminant;
        this.triggerValue = triggerValue;
        this.sentDate = sentDate;
    }

    public Long getIdGeneratedAlert() {
        return idGeneratedAlert;
    }

    public void setIdGeneratedAlert(Long idGeneratedAlert) {
        this.idGeneratedAlert = idGeneratedAlert;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ContaminantType getContaminant() {
        return contaminant;
    }

    public void setContaminant(ContaminantType contaminant) {
        this.contaminant = contaminant;
    }

    public Double getTriggerValue() {
        return triggerValue;
    }

    public void setTriggerValue(Double triggerValue) {
        this.triggerValue = triggerValue;
    }

    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }
}
