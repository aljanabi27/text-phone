package org.example;

public class PhoneNumber {
    private String firstName,lastName,number;

    public PhoneNumber(String firstName,String lastName,String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName(){
        return this.firstName+" "+this.lastName;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
