package com;

import java.io.*;

public class SerializeDemo {
    public static void main(String [] args)
    {

        try
        {

            ObjectInputStream ko= new ObjectInputStream(new FileInputStream("d://employee.ser") );
            Object o = (Domain)ko.readObject();
            Object o1 = (Domain)ko.readObject();
            System.out.println(o);
            System.out.println(o1);
            ko.close();
        }catch(IOException | ClassNotFoundException i)
        {
            i.printStackTrace();
        }
    }

}
