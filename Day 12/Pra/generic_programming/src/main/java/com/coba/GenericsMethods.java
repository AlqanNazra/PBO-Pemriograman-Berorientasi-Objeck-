package com.coba;

public class GenericsMethods { 
 
    //Java Generic Method 
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){ 
    return g1.get().equals(g2.get()); 
    } 
     
    public static void main(String args[]){ 
    GenericsType<String> g1 = new GenericsType<>(); 
    g1.set("Java"); 
    GenericsType<String> g2 = new GenericsType<>(); 
    g2.set("Java"); 
     
    boolean isEqual = GenericsMethods.<String>isEqual(g1, g2); 
    //above statement can be written simply as 
    isEqual = GenericsMethods.isEqual(g1, g2);
    System.err.println("String = " + isEqual);

    GenericsType<Integer> g3 = new GenericsType<>(); 
    g3.set(100); 
    GenericsType<Integer> g4 = new GenericsType<>(); 
    g4.set(100); 

    boolean isEqualint = GenericsMethods.<Integer>isEqual(g3, g4);  
    isEqualint = GenericsMethods.isEqual(g3, g4);
    System.err.println("Integer = " + isEqualint);
    /*This feature, known as type inference, allows you to invoke 
a generic method as an ordinary method, without specifying a type 
between angle brackets */ 
 
//Compiler will infer the type that is needed 
} 
} 

