package src.bishesh.twoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={2, 1, 8, 6, 4, 6, 5, 5};
       int maxValue=result(arr);
       System.out.print(maxValue);
    }
    public static int result(int[] arr){
        int i=0;
        int j=arr.length-1;
        int mostWater=0;
        int temp=0;
        while (i<j) {
            int index=j-i;
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
            if (mostWater<temp){
                mostWater=temp;
            }
        }
        return mostWater;
        }
}
