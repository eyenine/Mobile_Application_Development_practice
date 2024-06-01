

public class ListItem {

    private String name;
    private String designation;
    private String location;

    // Constructor for initializing all fields
    public ListItem(String name, String designation, String location) {
        this.name = name;
        this.designation = designation;
        this.location = location;
    }

    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation != null ? designation : "";
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location != null ? location : "";
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
