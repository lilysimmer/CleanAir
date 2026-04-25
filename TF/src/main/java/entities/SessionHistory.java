package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "SessionHistory")
public class SessionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSessionHistory;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "auth_token", length = 255)
    private String authToken;

    @Column(name = "device_info", length = 255)
    private String deviceInfo;

    @Column(name = "browser_info", length = 255)
    private String browserInfo;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    public SessionHistory() {
    }

    public SessionHistory(Long idSessionHistory, User user, String authToken, String deviceInfo, String browserInfo, LocalDateTime startDate) {
        this.idSessionHistory = idSessionHistory;
        this.user = user;
        this.authToken = authToken;
        this.deviceInfo = deviceInfo;
        this.browserInfo = browserInfo;
        this.startDate = startDate;
    }

    public Long getIdSessionHistory() {
        return idSessionHistory;
    }

    public void setIdSessionHistory(Long idSessionHistory) {
        this.idSessionHistory = idSessionHistory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBrowserInfo() {
        return browserInfo;
    }

    public void setBrowserInfo(String browserInfo) {
        this.browserInfo = browserInfo;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
