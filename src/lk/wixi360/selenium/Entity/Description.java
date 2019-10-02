package lk.wixi360.selenium.Entity;

public class Description {
    private int id;
    private String descNumber;
    private String position;
    private String description;



    public Description(String descNumber, String position, String description) {
        this.descNumber = descNumber;
        this.position = position;
        this.description = description;
    }

    public Description(int id, String descNumber, String position, String description) {
        this.id = id;
        this.descNumber = descNumber;
        this.position = position;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
