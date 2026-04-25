package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reading")
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReading;

    @ManyToOne
    @JoinColumn(name = "id_sensor", nullable = false)
    private Sensor sensor;

    @ManyToOne
    @JoinColumn(name = "id_contaminant_type", nullable = false)
    private ContaminantType contaminantType;

    @Column(name = "raw_value", nullable = false)
    private Double rawValue;

    @Column(name = "calculated_aqi_value")
    private Double calculatedAqiValue;

    @Column(name = "is_forecast")
    private Boolean isForecast = false;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    public Reading() {
    }

    public Reading(Long idReading, LocalDateTime dateTime, Sensor sensor, ContaminantType contaminantType, Double rawValue, Double calculatedAqiValue, Boolean isForecast) {
        this.idReading = idReading;
        this.dateTime = dateTime;
        this.sensor = sensor;
        this.contaminantType = contaminantType;
        this.rawValue = rawValue;
        this.calculatedAqiValue = calculatedAqiValue;
        this.isForecast = isForecast;
    }

    public Long getIdReading() {
        return idReading;
    }

    public void setIdReading(Long idReading) {
        this.idReading = idReading;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public ContaminantType getContaminantType() {
        return contaminantType;
    }

    public void setContaminantType(ContaminantType contaminantType) {
        this.contaminantType = contaminantType;
    }

    public Double getRawValue() {
        return rawValue;
    }

    public void setRawValue(Double rawValue) {
        this.rawValue = rawValue;
    }

    public Double getCalculatedAqiValue() {
        return calculatedAqiValue;
    }

    public void setCalculatedAqiValue(Double calculatedAqiValue) {
        this.calculatedAqiValue = calculatedAqiValue;
    }

    public Boolean getForecast() {
        return isForecast;
    }

    public void setForecast(Boolean forecast) {
        isForecast = forecast;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
