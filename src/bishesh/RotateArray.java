package src.bishesh;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        result(arr,k);
    }
    public  static void  result(int[] arr,int k){
        int x=0;
        for(int i=1;i<=k;i++) {
            int len = arr.length;
            int temp = arr[len - 1];
            for(int j= arr.length-1;j>=0;j--){
                arr[j]=arr[j-1];
            }
            arr[x]=temp;
            x++;
        }
        for(int l=0;l< arr.length;l++){
            System.out.print(arr[l]+" ");
        }
    }
}
