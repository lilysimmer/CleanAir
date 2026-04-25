package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ContaminantType")
public class ContaminantType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContaminantType;

    @Column(name = "contaminant_name", length = 100, nullable = false)
    private String contaminantName;

    @Column(name = "acronym", length = 20)
    private String acronym;

    @Column(name = "standard_unit", length = 50)
    private String standardUnit;

    @Column(name = "critical_threshold")
    private Double criticalThreshold;

    public ContaminantType() {
    }

    public ContaminantType(Long idContaminantType, String contaminantName, String acronym, String standardUnit, Double criticalThreshold) {
        this.idContaminantType = idContaminantType;
        this.contaminantName = contaminantName;
        this.acronym = acronym;
        this.standardUnit = standardUnit;
        this.criticalThreshold = criticalThreshold;
    }

    public Long getIdContaminantType() {
        return idContaminantType;
    }

    public void setIdContaminantType(Long idContaminantType) {
        this.idContaminantType = idContaminantType;
    }

    public String getContaminantName() {
        return contaminantName;
    }

    public void setContaminantName(String contaminantName) {
        this.contaminantName = contaminantName;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getStandardUnit() {
        return standardUnit;
    }

    public void setStandardUnit(String standardUnit) {
        this.standardUnit = standardUnit;
    }

    public Double getCriticalThreshold() {
        return criticalThreshold;
    }

    public void setCriticalThreshold(Double criticalThreshold) {
        this.criticalThreshold = criticalThreshold;
    }
}
