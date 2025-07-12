import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(majorityElementDemo(nums));
    }
    public static List<Integer> majorityElementDemo(int[] nums){
        int leng=nums.length;
        int halfLeng=leng/3;
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int no:nums){
            if(hm.containsKey(no)){
                hm.put(no,hm.get(no)+1);
            }
            else{
                hm.put(no,1);
            }
        }


        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int valued=entry.getValue();
            if(valued>halfLeng){
                li.add(entry.getKey());

            }
        }
        return li;
    }
    }

