import java.util.Scanner;
public class multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float n1,n2,m;
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        m=n1*n2;
        System.out.printf("%.2f",m);
    }
}
