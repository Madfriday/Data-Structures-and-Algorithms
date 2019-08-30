package BasicStruct;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        String[] arr1 = {"aa","bb","cc","dd","ee"};

        String[] arr2 = {"aa,math,89","bb,math,77","cc,math,66"};

        //求出没有参加考试的学生
        Set<String> set1 = new HashSet<String>();
        //
        for(String s : arr1){
            set1.add(s);
        }
        //
        Set<String> set2 = new HashSet<String>();
        //
        for(String s : arr2){
            set2.add(s.split(",")[0]);
        }
        //
        System.out.println(set2);
        //set1,set2做差即得
        for(String sb : set2) {
            boolean b = set1.remove(sb);
        }
        //
        System.out.println(set1);
    }
}
