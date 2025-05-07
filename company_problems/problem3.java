public class problem3 {
    public static void main(String[] args) {
        int num=2;
        int sum=0;
        while(num<=100){
            if(num%2==0){
                sum=sum+num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
