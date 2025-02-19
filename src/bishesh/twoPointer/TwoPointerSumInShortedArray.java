package src.bishesh.twoPointer;

public class TwoPointerSumInShortedArray {
    public static void main(String[] args) {
        int[] arr = {-2,2,4, 7, 9, 12, 15};
        twoSum(arr);
        for (int x : twoSum(arr)) {
            System.out.print(x + " ");
        }

    }

    public static int[] twoSum(int[] arr) {
        int target = 0;
        int[] result = new int[2];
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int sum = arr[i] + arr[j];
            if (target == sum) {
                result[0] = i;
                result[1] = j;
                break;
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return result;
    }
}

