package Test01;

//获取用户的输入信息（字符串）
//当用户输入 end 时，结束输入并打印用户之前输入的所有信息（输入的信息数量不超过 100 个）
import java.util.Scanner;

public class Shiyanlou{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] input = new String[100];
        int i = 0;
        while(! in.hasNext("end"))
        {
            input[i] = in.nextLine();
            i++;
        }
        for(int x=0; x<i; x++)
        {
            System.out.println(input[x]);
        }
    }
}
