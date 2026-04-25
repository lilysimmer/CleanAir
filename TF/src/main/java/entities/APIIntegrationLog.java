package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "APIIntegrationLog")
public class APIIntegrationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAPIIntegrationLog;

    @ManyToOne
    @JoinColumn(name = "id_related_sensor")
    private Sensor relatedSensor;

    @Column(name = "event_date", nullable = false)
    private LocalDateTime eventDate;

    @Column(name = "response_status", length = 50)
    private String responseStatus;

    @Column(name = "detail_message", length = 500)
    private String detailMessage;

    public APIIntegrationLog() {
    }

    public APIIntegrationLog(Long idAPIIntegrationLog, Sensor relatedSensor, LocalDateTime eventDate, String responseStatus, String detailMessage) {
        this.idAPIIntegrationLog = idAPIIntegrationLog;
        this.relatedSensor = relatedSensor;
        this.eventDate = eventDate;
        this.responseStatus = responseStatus;
        this.detailMessage = detailMessage;
    }

    public Long getIdAPIIntegrationLog() {
        return idAPIIntegrationLog;
    }

    public void setIdAPIIntegrationLog(Long idAPIIntegrationLog) {
        this.idAPIIntegrationLog = idAPIIntegrationLog;
    }

    public Sensor getRelatedSensor() {
        return relatedSensor;
    }

    public void setRelatedSensor(Sensor relatedSensor) {
        this.relatedSensor = relatedSensor;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }
}
