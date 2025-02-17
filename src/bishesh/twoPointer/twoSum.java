package src.bishesh.twoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={2,5,4,7,9,2};
        int[] result=new int[2];
        twoSum(arr,result);
        for (int i= 0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }
    }
    public static int[] twoSum(int[] arr,int[] result){
        int target=9;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i])) {
                //if you get the element set the array with the result
                result[0]=hm.get(arr[i]);
                result[1]=i;
            }
            else{

                int temp=target-arr[i];
                hm.put(temp,i);
            }
        }
        return result;

    }

}
