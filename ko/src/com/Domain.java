package com;

import javax.swing.*;
import java.io.Serializable;

public class Domain implements Serializable {
    private static int i;
    private transient String name ;
    private  String lp;

    public String getLp() {
        return lp;
    }

    public void setLp(String lp) {
        this.lp = lp;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", lp='" + lp + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
