package dev.dto;

import java.time.LocalDate;
import java.util.List;

public class MessageDtoQuery {
    private Long id;
    private LocalDate dateAjout;
    private Long discussionId;
    private List<Long> reponsesId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(LocalDate dateAjout) {
        this.dateAjout = dateAjout;
    }

    public Long getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
    }

    public List<Long> getReponsesId() {
        return reponsesId;
    }

    public void setReponsesId(List<Long> reponsesId) {
        this.reponsesId = reponsesId;
    }
}
