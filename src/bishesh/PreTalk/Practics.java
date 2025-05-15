package src.bishesh.PreTalk;

import java.util.Arrays;

public class Practics {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int k=1;
        int max=0;
        if(k==2){
            for(int i=0;i< arr.length-1;i++){
              int sum=arr[i]+arr[i+1];
              if(max<sum){
                  max=sum;
              }
            }

        }
        else {
            Arrays.sort(arr);
            max = arr[(arr.length) - 1];
        }
        System.out.println(max);
    }
}
