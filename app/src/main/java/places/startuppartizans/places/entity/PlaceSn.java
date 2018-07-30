package places.startuppartizans.places.entity;

public class PlaceSn {

    private String snName;
    private String snNumber;

    public PlaceSn(String snName, String snNumber) {
        this.snName = snName;
        this.snNumber = snNumber;
    }

    public String getSnName() {
        return snName;
    }

    public void setSnName(String snName) {
        this.snName = snName;
    }

    public String getSnNumber() {
        return snNumber;
    }

    public void setSnNumber(String snNumber) {
        this.snNumber = snNumber;
    }
}
