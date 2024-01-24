package org.example;

import java.io.*;
import java.util.ArrayList;

public class PhoneReader {
    private File file;
    private ArrayList<PhoneNumber> listPhoneNumber = new ArrayList<PhoneNumber>();
    public PhoneReader(File file){
        this.file = file;
    }

    private ObjectInputStream connection () throws IOException {
        FileInputStream fis = new FileInputStream(this.file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return ois;
    }

    public ArrayList<PhoneNumber> getPhoneNumber(int number) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = this.connection();
        for (int i = 0;i<number;i++){
            listPhoneNumber.add((PhoneNumber) ois.readObject());
        };
//        ois.close();
        return listPhoneNumber;
    };

}
