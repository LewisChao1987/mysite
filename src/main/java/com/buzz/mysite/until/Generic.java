package com.buzz.mysite.until;

import java.util.ArrayList;
import java.util.List;

public class Generic {

}

class Generator<T  extends  A> {
    public void method2(T a) {
        return;
    }
}
class  A {};
class B extends A {};
interface  C {};
class  D implements C{};
class Test {
    public static <T extends A> void method(T a) {
        List<? super A> list = new ArrayList<>();
        list.add(new B());
    }

    public static <T extends A> void method1(T a) {
        return;
    }

    public static void main(String[] args) {
        Test.method(new B());
    }
}