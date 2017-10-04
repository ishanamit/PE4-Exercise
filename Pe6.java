import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pe6
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		String s=inp.nextLine();
		String reg="se";
		regexChecker(reg,s);
	}
	public static void regexChecker(String reg,String s)
	{
		Pattern checkRegex=Pattern.compile(reg);
		Matcher regexMatcher=checkRegex.matcher(s);
		while(regexMatcher.find())
		{
			if(regexMatcher.group().length()!=0)
				System.out.println("Found at :"+regexMatcher.start()+"-"+regexMatcher.end());
		}
	}
}