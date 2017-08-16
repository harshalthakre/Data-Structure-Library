import java.util.*;
public class ReplaceExample2{  
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
String s1=str; 
s1=s1.replaceAll("Dark","0");
//System.out.println(replaceString);  
s1=s1.replaceAll("Peace","-"); 
s1=s1.replaceAll("-","Dark");
s1=s1.replaceAll("0","Peace");  
System.out.println(s1);  
}}  