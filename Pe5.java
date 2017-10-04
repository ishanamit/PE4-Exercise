import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Pe5{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		String s=inp.nextLine();
		//String str[]=s.split(" ");
		//int l=str.length;
       // int c=1;
        
        	if(s.matches("\\b[Hh]arry\\b"))
              System.out.println(" Is Harry here ? true ");
           else
           System.out.println(" Is Harry here ? false ");
}
}
    
	    

