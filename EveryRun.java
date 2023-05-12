
/**
 * Write a description of class prob here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EveryRun
{
    public static void main()
    {
        int[] arr = new int[20];
        for(int i=0;i<arr.length;i++)
        {
            int num= (int)(Math.random()*6+1);
            arr[i]=num;
        }
        boolean inRun=false;
        for(int i=0;i<20;i++)
        {
            
            
            
            if(inRun && arr[i]!=arr[i-1])
            {
                System.out.print(") ");
                inRun=false;
                
            }
             if(i!=arr.length-1 && !inRun && arr[i]==arr[i+1] )
            {
                System.out.print("( ");
                
                inRun=true;
                
            }
            System.out.print(arr[i]+" ");
            
        }
        if(inRun)
        System.out.print(")");
        
    }   
}

