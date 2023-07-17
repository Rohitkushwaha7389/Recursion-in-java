import java.util.*;
public class CountNumber{
    public static int Countsum(int num){
        int result=0;
        if(num==0){
            return 0;
        }
        else{
            result=(num%10+Countsum(num/10));
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=Countsum(num);
        System.out.println(result);
    }
}
