import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num==1){
            System.out.println("It is not prime");
            return;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count<1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }
}
