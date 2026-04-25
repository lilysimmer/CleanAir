package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Sensor")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSensor;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_location", nullable = false)
    private Location location;

    @Column(name = "iot_model", length = 100)
    private String iotModel;

    @Column(name = "is_personal")
    private Boolean isPersonal = false;

    @Column(name = "sync_status", length = 50)
    private String syncStatus;

    public Sensor() {
    }

    public Sensor(Long idSensor, User user, Location location, String iotModel, Boolean isPersonal, String syncStatus) {
        this.idSensor = idSensor;
        this.user = user;
        this.location = location;
        this.iotModel = iotModel;
        this.isPersonal = isPersonal;
        this.syncStatus = syncStatus;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Boolean getPersonal() {
        return isPersonal;
    }

    public void setPersonal(Boolean personal) {
        isPersonal = personal;
    }

    public String getIotModel() {
        return iotModel;
    }

    public void setIotModel(String iotModel) {
        this.iotModel = iotModel;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
