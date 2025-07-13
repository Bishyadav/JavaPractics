import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimesElements {
    public static void main(String[] args) {
        int[] nums={4,1,6,8,4,2,6};
        int result=repeatedNTimesElements(nums);
        System.out.println(result+" ");
    }
    public static int repeatedNTimesElements(int[] nums){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int no:nums){
            if(hm.containsKey(no)){
                hm.put(no,hm.get(no)+1);
            }
            else{
               hm.put(no,1);
            }
        }
        int element=0;
        int maxRepeatedElement=0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(maxRepeatedElement<entry.getValue()){
                maxRepeatedElement=entry.getValue();
                element=entry.getKey();
            }
        }
        return element;
    }
}
