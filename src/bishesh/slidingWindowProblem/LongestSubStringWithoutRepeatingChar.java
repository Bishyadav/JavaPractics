package src.bishesh.slidingWindowProblem;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str="abbadae";
        int maxLength=maxSubLeng(str);
        System.out.println(maxLength);
    }
    public static int maxSubLeng(String str){
        int max=0;
        int start=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int end=0;end<str.length();end++){
            if(hm.containsKey(str.charAt(end))){
                start=Math.max(start, hm.get(str.charAt(end))+1);
            }
            hm.put(str.charAt(end),end);
           max= Math.max(max,(end-start)+1);
        }
        return max;
    }
}
