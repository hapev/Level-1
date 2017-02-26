package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class intro2tests {

	@Test
	public void test() {
	assertEquals(7,add(3,4));
	assertEquals(25,subtract(30,5));
	assertEquals(25, squareNum(5));
	assertEquals("Hi Bob",giveGreeting("Bob"));
	assertEquals("Hi Bob!!!",giveEnthusiasticGreeting("Bob"));
	assertTrue(isWeekend("Saturday"));
	assertFalse(isWeekend("Tuesday"));
	assertEquals("A",getGrade(95));
	assertEquals("B",getGrade(88));
	assertEquals("C",getGrade(72));
	assertEquals("D",getGrade(61));
	assertEquals("F",getGrade(42));
	assertEquals("stuffstuffstuff",repeatString("stuff",3));
	assertEquals("stuff*-*stuff*-*stuff",repeatStringWithSeperator("stuff","*-*",3));
	}

int add(int x,int y){
	return x+y;
}
int subtract(int x,int y){
	return x-y;
}
int squareNum(int x){
	
	return x*x;
	
}
String giveGreeting(String x){
	return ("Hi "+ x);
	
}
String giveEnthusiasticGreeting(String x){
	return ("Hi "+ x+"!!!");
	
}
boolean isWeekend(String x){
	if(x=="Saturday"||x=="Sunday"){
		return true;
		}
	else{
		
		return false;
	}
}
String getGrade(int x){
	if(x>89){
	return "A";	
	}
	else if (x>79){
		return "B";
		
	}
	else if (x>69){
		return "C";
		
	}
	else if (x>59){
		return "D";
	}
	else{
		return "F";
	}
}
	

String repeatString(String X,int Y){
String Johnston="";
	for(int z=0;z<Y;z++){
	Johnston = Johnston + X;
	
}
	return Johnston;	
			
		}
String repeatStringWithSeperator(String X, String Y,int Z){
	String Johnston = X;
	for(int l=0;l<(Z-1);l++){
		Johnston = Johnston+ Y + X ;
	}
	System.out.println(Johnston);
	return Johnston;
	

}		
	
}


