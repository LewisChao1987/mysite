package com.buzz.mysite.controller;

import com.buzz.mysite.model.Product;
import com.buzz.mysite.until.JdbcUntil;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.function.ToLongFunction;


public class TestController {
    public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException {
        NestedClazz[] nestedClazzes = new NestedClazz[]{
                new NestedClazz(10), new NestedClazz(1), new NestedClazz(2), new NestedClazz(5), new NestedClazz(8)
        };
        //#region
        Arrays.sort(nestedClazzes);
        Arrays.sort(nestedClazzes);
        String sql = "select  * from product  limit 1,1";
        Product product = new JdbcUntil<Product>().getSingle(sql,Product.class);

        System.out.println(product.getPrice());
    }

    public static class NestedClazz implements Nested, Comparable<Nested> {
        private int anInt;

        public NestedClazz(int i) {
            this.anInt = i;
        }

        @Override
        public int compareTo(Nested o) {
            return (this.getValue() < o.getValue()) ? -1 : ((this.getValue() == o.getValue()) ? 0 : 1);
        }

        @Override
        public int getValue() {
            return this.anInt;
        }
    }


    public static class NestedClass2 implements Nested, Comparable<Nested> {
        private int anInt;

        public NestedClass2(int i) {
            this.anInt = i;
        }

        @Override
        public int compareTo(Nested o) {
            return (this.getValue() < o.getValue()) ? -1 : ((this.getValue() == o.getValue()) ? 0 : 1);
        }

        @Override
        public int getValue() {
            return anInt;
        }
    }

    public interface Nested {
        int getValue();

        static void m() {
            return;
        }
    }
}
class NestedCompartor implements Comparator<TestController.Nested> {

    @Override
    public int compare(TestController.Nested o1, TestController.Nested o2) {
        return (o1.getValue() < o2.getValue() ? 1 : ((o1.getValue() == o2.getValue()) ? 0 : -1));
    }
}

