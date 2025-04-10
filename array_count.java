
import java.util.*;
public class  arraycount{
    public static void main(String args[])
    {
        int arr[]={1,3,2,5,8,2,3,2};
        int count=0;
        for(int i=0;i<8;i++)
        {
            if(arr[i]==2){
            count++;
            }
        }
        System.out.println(count);
    }
}
