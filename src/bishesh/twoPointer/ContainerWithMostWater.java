package src.bishesh.twoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={3,8,4,6,7,11,9};
       int maxValue=result(arr);
       System.out.print(maxValue);
    }
    public static int result(int[] arr){
        int i=0;
        int j=arr.length-1;
        int index=j-i;
        int mostWater=0;
        int temp=0;
        while (i<j) {
            if (arr[i] < arr[j]) {
                temp = arr[i];
                i++;
            } else if (arr[i] > arr[j]) {
                temp = arr[j];
                j--;
            } else if (arr[i] == arr[j]) {
                temp = arr[i];
                i++;
            }
            temp = temp * index;
            mostWater = mostWater + temp;
        }
        return mostWater;
        }
}
