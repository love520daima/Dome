package com;

import java.io.*;

public class Ser {
    public static void main(String[] args) {

            Domain domain=new Domain();
            domain.setName("什么");
        domain.setLp("真好");
            System.out.println(domain);
            try
            {
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("d://text.java"));
                objectOutputStream.writeObject(domain);
                objectOutputStream.flush();
                objectOutputStream.close();
                ObjectInputStream ko= new ObjectInputStream(new FileInputStream("d://text.java") );
                Object o = (Domain)ko.readObject();
                System.out.println(o);

                ko.close();
            }catch(IOException | ClassNotFoundException i)
            {
                i.printStackTrace();
            }


    }

}
