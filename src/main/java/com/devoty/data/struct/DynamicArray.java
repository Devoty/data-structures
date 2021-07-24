package com.devoty.data.struct;

import java.util.Arrays;

/**
 * 动态数组
 */
public class DynamicArray<E> {

    private Object[] dataElements;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArray(){
        this.dataElements = new Object[DEFAULT_CAPACITY];
    }

    public DynamicArray(int initialCapacity){
        this.size = 0;
        this.dataElements = new Object[initialCapacity];
    }

    public void add(E e){
        rangeCheck();
        dataElements[size] = e;
        size++;
    }

    public  void rangeCheck(){
        if(dataElements.length <= size){
            expandArray();
        }
    }

    protected synchronized void expandArray(){
        System.out.println("进行扩容");
        Object[] o = new Object[size * 2 ];
        for (int i = 0; i< dataElements.length; i++) {
            o[i] = dataElements[i];
        }
        dataElements = o;
    }

    @Override
    public String toString() {
        return Arrays.toString(dataElements);

    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(1);
        dynamicArray.add(100);
        dynamicArray.add(100);
        dynamicArray.add(100);
        System.out.printf(dynamicArray.toString());
    }
}
