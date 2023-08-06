import java.util.*;
import java.io.*;
public class Main{

    public static boolean intToRoman(int num,int num2)
    {
       String m[]={" ","M","MM","MMM"};
       String x[]={" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
       String y[]={" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
       String h[]={" ","I","II","III","IV","V","VI","VII","VIII","IX"};

       String thousand=m[num/1000];
       String hundred=x[(num%1000)/100];
       String tens=y[(num%100)/10];
       String ones=h[num%10];
       String ans=thousand+hundred+tens+ones;

        String thousand1=m[num2/1000];
        String hundred1=x[(num2%1000)/100];
        String tens1=y[(num2%100)/10];
        String ones1=h[num2%10];
        String ans1=thousand1+hundred1+tens1+ones1;

        int n=ans.length();
        int n1=ans1.length();
        int count=0;
        boolean set=false;

        if(n>n1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n1; j++)
                    if (ans.charAt(i) == ans1.charAt(j))
                        count++;
                if(count==n)
                    set=true;
            }
        }
            else
            {
                for(int i=0;i<n1;i++)
                {
                    for(int j=0;j<n;j++)
                        if(ans.charAt(j)==ans1.charAt(i))
                            count++;
                    if(count==n1)
                        set=true;


            }
        }
            System.out.println(ans+" "+ans1);
            System.out.println(set);
            return set;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int num1= scan.nextInt();
        intToRoman(num,num1);
    }
}
