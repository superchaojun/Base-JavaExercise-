# Base-JavaExercise-
Java编码练习
import java.util.Scanner;

//判断两个字符串是否相等，不用equals()方法
public class Shiyanlou {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		if(a.length() != b.length())
		{
			System.out.println("不同");
		}
		else
		{
			boolean isprime = true;
			for(int i=1; i<a.length(); i++)
			{
				if(a.charAt(i) != b.charAt(i))
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				System.out.println("相同");
			}
			else
			{
				System.out.println("不同");
			}
		}

	}

}
