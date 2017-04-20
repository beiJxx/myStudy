package com.panchong.test;

/**
 * Created by kay on 2017/1/20.
 */
public class Test {

    public static void main(String[] args) {
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        System.out.println(num1 == num2);//false,因为这两个对象是独立创建的，有自己的内存空间和地址。
        Integer num3 = 100;
        Integer num4 = 100;
        System.out.println(num3 == num4);//true，常数之间比较数值。
        Integer num5 = 128;
        Integer num6 = 128;
        System.out.println(num5 == num6);//false，自动装箱成对象，但是超过了默认的缓存范围，同第一个。如果是127就是true。
        Integer num7 = 100;
        Integer num8 = new Integer(100);
        System.out.println(num7 == num8);//false，两个对象之间比较内存地址，不同的是num7通过自动装箱调用valueOf方法，指向缓存的100，而num8是指向自己内存空间里的100.
        int num9 = 100;
        Integer num10 = new Integer(100);
        Integer num11 = 100;
        System.out.println(num9 == num11);//true，num11通过自动装箱调用valueOf方法指向缓存中的100，比较的时候缓存中的100对象自动拆箱成为数值100.
    }

}
