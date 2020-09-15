package br.com.smiles.vo;

public class MemberVO {

    private String firstName;
    private String lastName;
    private boolean isClub;
    private boolean isCobranded;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isClub() {
        return isClub;
    }

    public void setClub(boolean club) {
        isClub = club;
    }

    public boolean isCobranded() {
        return isCobranded;
    }

    public void setCobranded(boolean cobranded) {
        isCobranded = cobranded;
    }
}
