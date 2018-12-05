package org.gdpi;

import java.util.ArrayList;
import java.util.List;

public class MainHello {
    public static void main(String[] args){
        List<String> a=new ArrayList();
        f1(a);
        List<String> b=new ArrayList();
        f2(b);
    }

    private static void f2(List<String> list) {
        for(int i=0;i<list.size();++i){
            String item=list.get(i);
        }
    }

    private static void f1(List<String> list) {
        for (String item : list) {
        }
    }

    private static void a(){
        String name="zhangsan";
        int age=24;

        System.out.println("name:+" + name + "age=" + age);
        String x= String.format("name:%+sage:%d", name, age);
        System.out.println(x);
    }
}
