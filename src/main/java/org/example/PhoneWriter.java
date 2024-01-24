package org.example;

import java.io.*;
import java.util.ArrayList;

public class PhoneWriter {
    private ArrayList<PhoneNumber> listPhone;
    private File file;
    public PhoneWriter(ArrayList<PhoneNumber> listPhone, File file){
        this.listPhone = listPhone;
        this.file = file;
    }

    private ObjectOutputStream connection() throws IOException {
        file.delete();
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file,true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        return oos;
    }
    public void write() throws IOException {
        ObjectOutputStream oos = this.connection();
        for (PhoneNumber x:listPhone)oos.writeObject(x);
        oos.close();
    }
}
