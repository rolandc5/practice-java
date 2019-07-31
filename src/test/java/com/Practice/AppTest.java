package com.Practice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.Practice.beginner.Basic;

public class AppTest extends TestCase {

    public AppTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( AppTest.class );
    }
    
    public void testmultiplyByTen1() {
    	assertEquals(Basic.multiplyByTen(1), 10);
    }
 
    public void testmutiplyByTen2() {
    	assertEquals(Basic.multiplyByTen(2), 20);
    }
    
    public void testmutiplyByTen3() {
    	assertEquals(Basic.multiplyByTen(3), 30);
    }
    
    public void testSubtractFive1() {
    	assertEquals(Basic.subtractFive(20), 15);
    }
    
    public void testSubtractFive2() {
    	assertEquals(Basic.subtractFive(10), 5);
    }
    
    public void testSubtractFive3() {
    	assertEquals(Basic.subtractFive(8), 3);
    }
    
    public void testAreSameLength1() {
    	String value1 = "North";
    	String value2 = "Face";
    	String result = "North Face";
    	assertEquals(Basic.areSameLength(value1, value2), result);
    }
    
    public void testAreSameLength2() {
    	String value1 = "Apple";
    	String value2 = "Watch";
    	String result = "Apple Watch";
    	assertEquals(Basic.areSameLength(value1, value2), result);
    }
    
    public void testAreSameLength3() {
    	String value1 = "Oculus";
    	String value2 = "Rift";
    	String result = "Oculus Rift";
    	assertEquals(Basic.areSameLength(value1, value2), result);
    }
    
    public void testAreEqual1() {
    	int value1 = 5;
    	int value2 = 5;
    	boolean result = true;
    	assertEquals(Basic.areEqual(value1, value2), result);
    }
    
    public void testAreEqual2() {
    	int value1 = 6;
    	int value2 = 10;
    	boolean result = false;
    	assertEquals(Basic.areEqual(value1, value2), result);
    }
    
    public void testAreEqual3() {
    	int value1 = 15;
    	int value2 = 15;
    	boolean result = true;
    	assertEquals(Basic.areEqual(value1, value2), result);
    }

    
}
