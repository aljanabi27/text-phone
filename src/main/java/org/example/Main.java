package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static void add(Contact contact){
        String firstName ,lastName,number;
        System.out.println("Enter first name");
        firstName = input.next();
        System.out.println("Enter last name");
        lastName = input.next();
        System.out.println("Enter number phone");
        number = input.next();
        contact.add(new PhoneNumber(firstName,lastName,number));
        System.out.println("add this number seccuss");
    }
    static void remove(Contact contact){
        System.out.println("pleas enter id for number phone that want delete it "+"{"+contact.getSize()+"}");
        int index = input.nextInt();
        if(index <= contact.getSize()){
            contact.remove(index);
            System.out.println("this number is remove");
        } else {
            System.out.println("this number out of range");
        }
    }
    static void clear(Contact contact){
        System.out.println("is you remove all phone number chosses { true or false }");
        boolean check = input.nextBoolean();
        if(check){
            contact.removeAll();
            System.out.println("remove all phone number");
        } else {
            System.out.println("cancel remove all");
        }
    }
    static void printPhoneNumber(Contact contact){
        System.out.println("------------------------------------------------------------------------------------");
        for(PhoneNumber x:contact.getInformation()){System.out.println(x);}
        System.out.println("------------------------------------------------------------------------------------");
    }
    static void chosser(){
        System.out.println("chooses one of this option\n1-add number phone\n2-delete number Phone\n3-print number phone\n4-delete all number phone\n5- exit from program");
    }
    static void Exit(boolean status){

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("storge.txt");
//      create file to storge object if it is not found
        if(!file.exists()){
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.close();
            fos.close();
        }
//      create connection to file purpose read information and store in array list
        PhoneReader phoneReader = new PhoneReader(file);
//      create instane of contact object store text Phones and mainpulate them
        Contact contact = new Contact(phoneReader.getPhoneNumber(0));
//      ------------------------------------------- code ------------------------------------------------
        int x;
        boolean status = true;
        while(status){
            chosser();
            x = input.nextInt();
            switch (x){
                case 1:add(contact);
                break;
                case 2:remove(contact);
                break;
                case 3:printPhoneNumber(contact);
                break;
                case 4:clear(contact);
                break;
                case 5:status = false;
                System.out.println("program finshed");
            }
        }
//      ------------------------------------------- code ------------------------------------------------
//      write information in the storge file
        PhoneWriter phoneWriter = new PhoneWriter(contact.getInformation(),file);
        phoneWriter.write();
    }
}