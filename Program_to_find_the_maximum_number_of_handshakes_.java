import java.util.Scanner;
public class handshakes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n*(n-1)/2;
        System.out.println(t);
        sc.close();
    }
}