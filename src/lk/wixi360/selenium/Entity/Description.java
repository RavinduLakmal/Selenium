package lk.wixi360.selenium.Entity;

public class Description {
    private Long id;
    private String descNumber;
    private String position;
    private String description;

    public Long getId() {
        return id;
    }

    public Description(String descNumber, String position, String description) {
        this.descNumber = descNumber;
        this.position = position;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescNumber() {
        return descNumber;
    }

    public void setDescNumber(String descNumber) {
        this.descNumber = descNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
