//现给出一串数据求出最大值和最小值并输出。
//方法：冒泡排序。
public class Shiyanlou{
    public static void main(String[] args){
        int[] a = {313,89,123,323,313,15,90,56,39};
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
            	if(a[j]>a[j+1])
            	{
            		int temp = a[j+1];
            		a[j+1] = a[j];
            		a[j] = temp;
            	}
            }
        }
        System.out.println(a[a.length-1]+" "+a[0]);
    }
}
