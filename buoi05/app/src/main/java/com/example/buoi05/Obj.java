package com.example.buoi05;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Obj implements Serializable {
    private String title;
    private int Src;
    private String Sub;

    public Obj(String title,int src,String Sub) {
        this.title = title;
        this.Src=src;
        this.Sub=Sub;
    }

    public String getTitle() {
        return title;
    }

    public int getSrc() {
        return Src;
    }

    public String getSub() {
        return Sub;
    }

    public void setSrc(int src) {
        this.Src = src;
    }

    public void setSub(String sub) {
        this.Sub = sub;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
