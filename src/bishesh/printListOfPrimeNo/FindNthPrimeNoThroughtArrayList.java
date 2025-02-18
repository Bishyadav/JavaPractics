package src.bishesh.printListOfPrimeNo;

import java.util.ArrayList;
import java.util.List;
public class FindNthPrimeNoThroughtArrayList {
    public static void main(String[] args) {

         int no=100;
         //New way to print listElemet
         result(no).stream().forEach(System.out::println);
         //Old way to print listElement
//         for(Integer res:result(no)){
//          System.out.println(res);
//         }


    }
    public static List<Integer> result(int no){
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=100;i++){
            int count=0;
           for(int j=2;j<=Math.sqrt(i);j++){
             if(i%j==0){
                 count++;
             }
           }
           if (count==0){
               list.add(i);
           }
        }
        return list;
    }
}
