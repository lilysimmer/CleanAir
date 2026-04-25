package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserCondition")
public class UserCondition {
    @EmbeddedId
    private UserConditionId id;

    @MapsId("idUser")
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @MapsId("idMedicalCondition")
    @ManyToOne
    @JoinColumn(name = "id_medical_condition", nullable = false)
    private MedicalCondition medicalCondition;

    public UserCondition() {
    }

    public UserCondition(UserConditionId id, User user, MedicalCondition medicalCondition) {
        this.id = id;
        this.user = user;
        this.medicalCondition = medicalCondition;
    }

    public UserConditionId getId() {
        return id;
    }

    public void setId(UserConditionId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MedicalCondition getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(MedicalCondition medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
