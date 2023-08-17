import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a;
        a=sc.nextDouble();
        double area;
        area=3.14*a*a;
        System.out.printf("%.2f",area);
    } 
}