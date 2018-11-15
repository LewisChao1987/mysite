package com.buzz.mysite.controller;

import java.util.*;
import java.util.function.ToLongFunction;

public class TestController {
    public static void main(String[] args) {
        NestedClazz[] nestedClazzes = new NestedClazz[]{
           new NestedClazz(10),  new NestedClazz(1),new NestedClazz(2),new NestedClazz(5),new NestedClazz(8)
   };
        Arrays.sort(nestedClazzes);
        Arrays.sort(nestedClazzes);
        for (int i = nestedClazzes.length - 1; i >= 0; i--) {
            //System.out.println(nestedClazzes[i].anInt);
        }
        //System.out.println(Arrays.toString(nestedClazzes));
        Integer integer =1232323;
        Integer.toHexString(integer);
       Integer integer1 = 0x123;
        //System.out.println(integer1);
        List<Nested>  list = new Vector<>();
        list.add(new NestedClazz(1));
        list.add(new NestedClass2(1));
        list.add(new NestedClass2(32));
        list.add(new NestedClazz(34));
        list.sort(new NestedCompartor());
        list.forEach(a-> System.out.println(a.getValue()));

    }
    public static class NestedClazz implements Nested,  Comparable<Nested>
    {
        private  int anInt;
        public  NestedClazz(int i)
        {
            this.anInt = i;
        }

        @Override
        public int compareTo(Nested o) {
            return (this.getValue()<o.getValue())?-1:((this.getValue()==o.getValue())?0:1);
        }

        @Override
        public int getValue() {
            return  this.anInt;
        }
    }


    public  static  class NestedClass2 implements Nested,Comparable<Nested>
    {
        private  int anInt;
        public  NestedClass2(int i)
        {
 this.anInt = i;
        }
        @Override
        public int compareTo(Nested o) {
            return (this.getValue()<o.getValue())?-1:((this.getValue()==o.getValue())?0:1);
        }

        @Override
        public int getValue() {
            return anInt;
        }
    }
    public  interface  Nested
    {
        int getValue();
        static  void  m()
        {
            return;
        }
    }
    
}
class NestedCompartor implements Comparator<TestController.Nested>
{

    @Override
    public int compare(TestController.Nested o1, TestController.Nested o2) {
        return (o1.getValue()<o2.getValue()?-1:((o1.getValue()==o2.getValue())?0:1));
    }

}

