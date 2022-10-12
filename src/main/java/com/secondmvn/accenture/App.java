package com.secondmvn.accenture;
import java.util.*;
public class App{


    public static void main( String[] args )
    {
      NavigableMap<Integer,String> m1= new TreeMap<Integer,String>(); 
      m1.put(1,"First");
      m1.put(2, "Second");
      m1.put(3, "Third");
      m1.put(4, "Fourth");
      m1.put(5, "Fifth");
      //Collections.reverseOrder();
      System.out.println(m1.descendingMap());
      
    }
}
