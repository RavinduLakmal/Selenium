package lk.wixi360.selenium.tm;

public class DescriptionTM {
    private String number;
    private String postion;
    private String description;

    public DescriptionTM(String number, String postion, String description) {
        this.number = number;
        this.postion = postion;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
