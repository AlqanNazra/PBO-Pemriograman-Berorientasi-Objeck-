package com.Hadiah;


public class Family {
    private String name;
    private int day;
    private int month;

    protected void addNiece (String name,int day,int month)
    {
        this.name = name;
        this.day = day;
        this.month = month;

    }

    public void adduncle (String name) {
        this.name = name;
    }

    
    

}
