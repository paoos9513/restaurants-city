package model;

public class Client {
    public String fullClientName;
    public String idType;
    public String numberId;
    public String telephone;
    public String address;

    public Client(String fullClientName, String idType, String numberId, String telephone, String address) {
        this.fullClientName = fullClientName;
        this.idType = idType;
        this.numberId = numberId;
        this.telephone = telephone;
        this.address = address;
    }

    public String getFullClientName() {
        return fullClientName;
    }

    public void setFullClientName(String fullClientName) {
        this.fullClientName = fullClientName;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
