import java.util.*;
public class Max_value_Array {
    public static int maxValue(int arr[],int num,int index){
        if(index==num-1)
            return arr[num-1];
            int maxOfLatter=maxValue(arr ,num,index+1);
            int max=Math.max(arr[index],maxOfLatter);
        
        return max;
    

        
    }
    public static void main(String[] args) {
        int arr[]={13,1,-3,22,3};
        int n=arr.length;

        System.out.println(maxValue(arr,n,0));
        
    }
    
}
