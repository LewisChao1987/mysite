package com.buzz.mysite.rolay;

import java.util.AbstractList;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;

public class Flower {

Moli moli = new Moli();

    public static void main(String[] args) {
        new Flower().moli.iterator().hasNext();
    }

}
class  Moli  extends AbstractQueue<String>
{

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(String s) {
        return false;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }
}
