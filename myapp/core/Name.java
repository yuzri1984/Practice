//Practice if loop//


package myapp.core;


import java.io.Console;


public class Name {
public static void main(String[] args){

Console cons = System.console();
String name = cons.readLine("What is your name?");
if (name.length() <= 0) {
System.err.println(" Name not entered.");


}
else 

System.out.printf("Hello %s. Please to meet you..\n", name);


}    



}
