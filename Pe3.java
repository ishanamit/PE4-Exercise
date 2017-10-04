public class Pe3
{ 
Pe3(String msg) 
{ 
msg="hello this is ishan here"; 
System.out.println(msg); 
} 
public static void main(String[] args)throws Exception 
{ 
try 
{ 
throw new Exception(); 
} 
catch(Exception e) 
{ 
e.printStackTrace(); 
} 

finally 
{ 
System.out.println("i was there at that moment"); 
} 

} 
} 
