package DAY9.solutions;

public class l18 
{
    int number;
    public int[] fibo(int num)
    {
        int[] result = new int[num];

        result[0]=0;
        result[1]=1;
        for(int i=0;i<num;i++)
        {
            if(i==0||i==1)
            {
                continue;
            }
            else
            {
                result[i]=result[i-1]+result[i-2];
            }
            
        }
        return result;

    }

    public void main()
    {
        int num=10;
        int[] result=fibo(num);

        for(int i=0;i<num;i++)
        {
            System.out.println(result[i]);
        }
    }


}
    
