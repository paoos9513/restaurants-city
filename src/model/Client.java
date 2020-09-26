package model;

import java.io.Serializable;

public class Client implements Serializable {

    private static final long serialVersionUID = 2;

    public String clientName;
    public String clientLastName;
    public String idType;
    public String numberId;
    public String telephone;
    public String address;

    public Client(String clientName,String clientLastName, String idType, String numberId, String telephone, String address) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.idType = idType;
        this.numberId = numberId;
        this.telephone = telephone;
        this.address = address;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public int compareTo(Client o) {
        return 0;
    }

}
