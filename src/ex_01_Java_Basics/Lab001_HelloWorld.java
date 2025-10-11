package ex_01_Java_Basics;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;

public class Lab001_HelloWorld {
    public static void main(String[] args) {
//        String str="Sswarnaa";
//        char c[]=str.toCharArray();
//        StringBuilder sd=new StringBuilder();
//        Set<Character> unq=new HashSet<>();
//        for(int i=0;i<c.length;i++)
//        {
//            if(!(unq.contains(c[i])))
//            {
//                unq.add(c[i]);
//                sd.append(c[i]);
//            }
//        }
//        System.out.println(sd);
//        System.out.println(sd.reverse().toString());//
//        System.out.println(str.replaceAll("\\s",""));
        int a[]={7,2,3,4,5,8};
        int first=0;
        int second=0;
        for(int i=0;i<a.length;i++)
        {
//            int j=i+1;
            if(a[i]>first)
            {
                second=first;
                first=a[i];

            }
            else if(a[i]>second)
                second=a[i];
            System.out.println(first+""+second);
        }
    }
}