import java.util.Scanner;
public class average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b;
        float  c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}