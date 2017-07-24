package test;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

class Base {

    protected void run() {
        double r = Math.random();
        System.out.println(r);
    }
    
    public static void main(String[] args){
        System.out.println(new Base().run());
    }

}
