package com.coba;
public class GenericsTypeOld { 
    private Object t; 
        public Object get() { 
        return t; 
        } 
        
            public void set(Object t) { 
            this.t = t; 
        } 
        public static void main(String args[]){ 
        GenericsTypeOld type = new GenericsTypeOld(); 
        type.set("java"); 
        String str = (String) type.get(); 
        System.out.println(str);
        type.set(12);
        int bo = (int) type.get();
        System.out.println(bo);
        //type casting, error prone and can cause ClassCastException 
        } 
    }