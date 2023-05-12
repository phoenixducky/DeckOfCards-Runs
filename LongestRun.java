
/**
 * Write a description of class problem1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LongestRun
{
    public static void main()
    {
        
    
        int[] arr=new int[20];
        int index1=9999999; 
        int longest=-99999;
        int index2=99999; 
        int m;
        for (int i=0;i<20;i++)
        {
            arr[i]=(int)(Math.random()*6)+1;
        }
        for (int n=0; n<arr.length-1;n++)
        {
            m=0;
            while (n+m+1<arr.length && arr[n]==arr[n+m+1])
            m++;
            
            if (m!=0 && m>longest)
            {
                longest=m;
                index1=n;
                index2=n+m;
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (i==index1)
            System.out.print("("+arr[i]+" ");
            
            else if (i==index2)
            System.out.print(arr[i]+") ");
            
            else 
            System.out.print(arr[i]+" ");
    
        }
    }
}