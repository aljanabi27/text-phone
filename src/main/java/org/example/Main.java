package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static void add(){

    }
    static void remove(){

    }
    static void clear(){

    }
    static void printPhoneNumber(){

    }
    static void Exit(){

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("storge.txt");
//      create file to storge object if it is not found
        if(!file.exists()){
            file.createNewFile();
        }
//      create connection to file purpose read information and store in array list
        PhoneReader phoneReader = new PhoneReader(file);
//      create instane of contact object store text Phones and mainpulate them
        Contact contact = new Contact(phoneReader.getPhoneNumber(0));
//      ------------------------------------------- code ------------------------------------------------

//      ------------------------------------------- code ------------------------------------------------
//      write information in the storge file
        PhoneWriter phoneWriter = new PhoneWriter(contact.getInformation(),file);
        phoneWriter.write();
    }
}