package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "InformativeContent")
public class InformativeContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInformativeContent;

    @Column(name = "category", length = 50)
    private String category;

    @Column(name = "id_author_admin")
    private Long idAuthorAdmin;

    @Column(name = "title", length = 200)
    private String title;

    @Column(name = "body_text", columnDefinition = "TEXT")
    private String bodyText;

    public InformativeContent() {
    }

    public InformativeContent(Long idInformativeContent, String category, Long idAuthorAdmin, String title, String bodyText) {
        this.idInformativeContent = idInformativeContent;
        this.category = category;
        this.idAuthorAdmin = idAuthorAdmin;
        this.title = title;
        this.bodyText = bodyText;
    }

    public Long getIdInformativeContent() {
        return idInformativeContent;
    }

    public void setIdInformativeContent(Long idInformativeContent) {
        this.idInformativeContent = idInformativeContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getIdAuthorAdmin() {
        return idAuthorAdmin;
    }

    public void setIdAuthorAdmin(Long idAuthorAdmin) {
        this.idAuthorAdmin = idAuthorAdmin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }
}
