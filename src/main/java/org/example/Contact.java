package org.example;

import java.util.ArrayList;

public class Contact {
    private ArrayList<PhoneNumber> listPhoneNumber;
    private int size;
    public Contact(ArrayList<PhoneNumber> listPhoneNumber){
        this.listPhoneNumber = listPhoneNumber;
        this.size = listPhoneNumber.size();
    }

    public int getSize() {
        return size;
    }

    public void add(PhoneNumber newPhoneNumber){
        this.listPhoneNumber.add(newPhoneNumber);
        this.size++;
    }

    public void remove(int index){
        listPhoneNumber.remove(index-1);
        this.size--;
    }

    public void removeAll(){
        this.listPhoneNumber = new ArrayList<PhoneNumber>();
        this.size = 0;
    }

    public ArrayList<PhoneNumber> getInformation(){
        return listPhoneNumber;
    }

}
