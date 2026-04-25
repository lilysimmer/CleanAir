package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ExportedReport")
public class ExportedReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExportedReport;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "format_type", length = 20, nullable = false)
    private String formatType;

    @Column(name = "download_url", length = 500)
    private String downloadUrl;

    @Column(name = "generation_date", nullable = false)
    private LocalDateTime generationDate;

    public ExportedReport() {
    }

    public ExportedReport(Long idExportedReport, User user, String formatType, String downloadUrl, LocalDateTime generationDate) {
        this.idExportedReport = idExportedReport;
        this.user = user;
        this.formatType = formatType;
        this.downloadUrl = downloadUrl;
        this.generationDate = generationDate;
    }

    public Long getIdExportedReport() {
        return idExportedReport;
    }

    public void setIdExportedReport(Long idExportedReport) {
        this.idExportedReport = idExportedReport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public LocalDateTime getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(LocalDateTime generationDate) {
        this.generationDate = generationDate;
    }
}
