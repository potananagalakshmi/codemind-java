import java.util.Scanner;
public class capacity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=2*a*b*c*512;
        System.out.println(d);
        sc.close();
    }
}