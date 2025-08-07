package InstanceOf;
/*
 * In Java, values from -128 to 127 are cached,
 *  so the same objects are returned. 
 *  The implementation of valueOf() uses cached objects if the value is between -128 to 127.
 * */

public class Test {
 	public static void main(String[] args) {
     //Integer x=40,y=40;
     //Integer x=140,y=140;
     Integer x=new Integer(40),y=new Integer(40);
     
     if(x==y) {
    	 System.out.println("same");
     }else {
    	 {
        	 System.out.println("not same");
         }
     }
	}
}
