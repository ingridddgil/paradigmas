package Model;

public class Secretary extends User {
    private String shift;
    private String SecretaryID;

    public Secretary(String id, String name, String email, String shift, String telephone) {
        super(id, name, telephone);
        this.shift = shift;
        this.SecretaryID = id;
    }
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getSecretaryID() {
        return SecretaryID;
    }

    public void setSecretaryID(String secretaryID) {
        SecretaryID = secretaryID;
    }

}
