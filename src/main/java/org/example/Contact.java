package org.example;

import java.util.ArrayList;

public class Contact {
    private ArrayList<PhoneNumber> listPhoneNumber;

    public Contact(ArrayList<PhoneNumber> listPhoneNumber){
        this.listPhoneNumber = listPhoneNumber;
    }

    public void add(PhoneNumber newPhoneNumber){
        this.listPhoneNumber.add(newPhoneNumber);
    }

    public void remove(int index){
        listPhoneNumber.remove(index-1);
    }

}
