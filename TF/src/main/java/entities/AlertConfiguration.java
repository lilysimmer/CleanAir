package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "AlertConfiguration")
public class AlertConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlertConfiguration;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "threshold_sensitivity")
    private Double thresholdSensitivity;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    public AlertConfiguration() {
    }

    public AlertConfiguration(Long idAlertConfiguration, User user, Double thresholdSensitivity, String startTime, String endTime) {
        this.idAlertConfiguration = idAlertConfiguration;
        this.user = user;
        this.thresholdSensitivity = thresholdSensitivity;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getIdAlertConfiguration() {
        return idAlertConfiguration;
    }

    public void setIdAlertConfiguration(Long idAlertConfiguration) {
        this.idAlertConfiguration = idAlertConfiguration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getThresholdSensitivity() {
        return thresholdSensitivity;
    }

    public void setThresholdSensitivity(Double thresholdSensitivity) {
        this.thresholdSensitivity = thresholdSensitivity;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
