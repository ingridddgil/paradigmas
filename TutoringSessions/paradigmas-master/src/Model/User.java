package Model;

public class User {
    private String name;
    private String email;
    private String telephoneNumber;

    public User(String n, String e, String telephone){
        this.name = n;
        this.email = e;
        this.telephoneNumber = telephone;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Personal information\nName: " + this.name + "\nEmail: " + this.email + "\nTelephone: " + this.telephoneNumber;
    }


}
