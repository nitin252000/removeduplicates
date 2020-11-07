import java.util.Arrays;
import java.util.Scanner;

public class removeduplicatesf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]ar=new int[m];
        for(int i=0;i<ar.length;i++ )
        {
            ar[i]=sc.nextInt();
        }
        int unique=ar.length;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[j]=ar[ar.length-1];
                    unique--;
                    j--;
                }
            }
            int [] newar= Arrays.copyOf(ar,unique);
            System.out.println();
            for( i=0;i<newar.length;i++)
            {
                System.out.print(newar[i]+"\t");
            }

        }}
        }
