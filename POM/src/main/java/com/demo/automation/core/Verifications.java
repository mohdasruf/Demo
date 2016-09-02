package com.demo.automation.core;


import org.apache.log4j.Logger;
import org.testng.AssertJUnit;


public class Verifications {


  protected static StringBuffer verificationErrors = new StringBuffer();
  private static Logger logger = Logger.getLogger(Verifications.class);

 
  public static void quit() {
  }


  public static void debug(String message) {
    logger.debug(message);

  }

  public static void info(String message) {
    logger.info(message);
  }

 
  public static void assertTrue(String message, boolean condition) {

    AssertJUnit.assertTrue(message, condition);
    info("Verification PASSED: " + message);

  }

  public static void assertFalse(String message, boolean condition) {
    AssertJUnit.assertFalse(message, condition);
    info("Verification PASSED: " + message);
  }

  
  public static void assertEquals(String message, String expected, String actual) {
    AssertJUnit.assertEquals(message, expected, actual);
    info("Verification PASSED: " + message + " Expected: " + expected);
  }


public static void fail(String string) {
	// TODO Auto-generated method stub
	
}


public static void fail(String string, Throwable e) {
	// TODO Auto-generated method stub
	
}

 

  
}
