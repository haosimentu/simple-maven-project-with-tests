package com;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

public class Base {

    protected void run() {
        double r = Math.random();
        System.out.println(r);
    }
    
    public static void main(String[] args){
    	new Base().run();
    }
    
    /////////////////

}
