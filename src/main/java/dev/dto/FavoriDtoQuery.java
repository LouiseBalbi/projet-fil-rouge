package dev.dto;


public class FavoriDtoQuery {

    private Boolean showMeteo;
    private Boolean showAir;
    private String polluant;
    private Long userId;
    private Long villeId;

    public Boolean getShowMeteo() {
        return showMeteo;
    }

    public void setShowMeteo(Boolean showMeteo) {
        this.showMeteo = showMeteo;
    }

    public Boolean getShowAir() {
        return showAir;
    }

    public void setShowAir(Boolean showAir) {
        this.showAir = showAir;
    }

    public String getPolluant() {
        return polluant;
    }

    public void setPolluant(String polluant) {
        this.polluant = polluant;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVilleId() {
        return villeId;
    }

    public void setVilleId(Long villeId) {
        this.villeId = villeId;
    }
}
