package src.bishesh.primeNo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindNthPrimeNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nth no");
        int userInput=s.nextInt();
       int data=result(userInput);
       System.out.println(data);
    }
    public static int result(int userInput){
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=4000;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
               if (i%j==0){
                  count++;
               }
            }
            if (count==0){
                list.add(i);
            }
        }
       int finalResult=list.get(userInput-1);
        return finalResult;
    }
}
