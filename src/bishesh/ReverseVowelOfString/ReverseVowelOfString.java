package src.bishesh.ReverseVowelOfString;

public class ReverseVowelOfString {
        public static String reverseVowels(String s) {
            int i=0;
            int j=s.length()-1;
            boolean flag=false;
            if(s==null || s.length()==0) return s;
            char[] ch=s.toCharArray();
            while(i<j){
                if((ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A' ||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') && (ch[j]=='a' ||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'|| ch[j]=='A' ||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U')){
                    char c=ch[i];
                    ch[i]=ch[j];
                    ch[j]=c;
                    i++;
                    j--;
                }

                else if(ch[i]!='a' &&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A' &&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&& ch[i]!='U'){
                    i++;
                    flag=true;
                }
                else  if(ch[j]!='a' &&ch[j]!='e'&&ch[j]!='i'&&ch[j]!='o'&&ch[j]!='u'&& ch[j]!='A' &&ch[j]!='E'&&ch[j]!='I'&&ch[j]!='O'&&ch[j]!='U'){
                    j--;
                    flag=true;
                }
                if(flag==false){
                    i++;
                    j--;
                }
            }
            String str=new String(ch);
            return str;
        }

        public static void main(String[] args) {
            String s="IceCreAm";
            String st=  reverseVowels(s);
            System.out.println(st+" ");
        }
    }
