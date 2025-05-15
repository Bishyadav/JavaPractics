package src.bishesh.GreatestCommonDivisorFactorString;

import java.util.TreeSet;

public class GreatestCommonDivisorFactorString {
    public static void main(String[] args) {
        String s1="abcabc";
        String s2="abc";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        TreeSet<Character> t1=new TreeSet<>();
        TreeSet<Character> t2=new TreeSet<>();
        String st="";
      for(int i=0;i<ch1.length;i++){
          t1.add(ch1[i]);
      }
        for(int i=0;i<ch2.length;i++){
            t2.add(ch2[i]);
        }
        if(t1.size()==t2.size()){
           for(char ch:t1){
               st=st+ch;
           }
        }
        else {
            st="";
        }
        System.out.println(st+" ");
    }
}
