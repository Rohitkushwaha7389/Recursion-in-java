import java.util.*;
public class Natural_Sum{
    static int go(int n,int i){
        if(i==n+1) return 0;
        if(i%2==0) return go(n,i+1)-1;
        else return go(n,i+1)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(go(n,1));
        
    }

}
