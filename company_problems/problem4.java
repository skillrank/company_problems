import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping " + "a : "+ a + " " +  " b: " + b);
    }
}
