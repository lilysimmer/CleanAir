package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MedicalCondition")
public class MedicalCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicalCondition;

    @Column(name = "condition_name", length = 100, nullable = false)
    private String conditionName;

    @Column(name = "description", length = 255)
    private String description;

    public MedicalCondition() {
    }

    public MedicalCondition(Long idMedicalCondition, String description, String conditionName) {
        this.idMedicalCondition = idMedicalCondition;
        this.description = description;
        this.conditionName = conditionName;
    }

    public Long getIdMedicalCondition() {
        return idMedicalCondition;
    }

    public void setIdMedicalCondition(Long idMedicalCondition) {
        this.idMedicalCondition = idMedicalCondition;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
