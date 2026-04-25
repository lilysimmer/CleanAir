package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "AirQualityRange")
public class AirQualityRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAirQualityRange;

    @ManyToOne
    @JoinColumn(name = "id_contaminant_type", nullable = false)
    private ContaminantType contaminantType;

    @Column(name = "min_value", nullable = false)
    private Double minValue;

    @Column(name = "max_value", nullable = false)
    private Double maxValue;

    @Column(name = "aqi_label", length = 50)
    private String aqiLabel;

    @Column(name = "hex_color", length = 20)
    private String hexColor;

    @Column(name = "health_message", length = 255)
    private String healthMessage;

    @Column(name = "activity_message", length = 255)
    private String activityMessage;

    public AirQualityRange() {
    }

    public AirQualityRange(Long idAirQualityRange, ContaminantType contaminantType, Double minValue, Double maxValue, String aqiLabel, String hexColor, String healthMessage, String activityMessage) {
        this.idAirQualityRange = idAirQualityRange;
        this.contaminantType = contaminantType;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.aqiLabel = aqiLabel;
        this.hexColor = hexColor;
        this.healthMessage = healthMessage;
        this.activityMessage = activityMessage;
    }

    public Long getIdAirQualityRange() {
        return idAirQualityRange;
    }

    public void setIdAirQualityRange(Long idAirQualityRange) {
        this.idAirQualityRange = idAirQualityRange;
    }

    public String getActivityMessage() {
        return activityMessage;
    }

    public void setActivityMessage(String activityMessage) {
        this.activityMessage = activityMessage;
    }

    public String getHealthMessage() {
        return healthMessage;
    }

    public void setHealthMessage(String healthMessage) {
        this.healthMessage = healthMessage;
    }

    public String getHexColor() {
        return hexColor;
    }

    public void setHexColor(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getAqiLabel() {
        return aqiLabel;
    }

    public void setAqiLabel(String aqiLabel) {
        this.aqiLabel = aqiLabel;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public ContaminantType getContaminantType() {
        return contaminantType;
    }

    public void setContaminantType(ContaminantType contaminantType) {
        this.contaminantType = contaminantType;
    }
}
