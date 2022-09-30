/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.instanceOf;


/**
 * @author turbozhao
 * @date 2022/9/30 19:31
 * @verison 1.0
 */
public class main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(1, 2);
        Shape s2 = new Square(10);
        Shape s3 = new Rectangle(1, 1);
        System.out.println(isSquare(s1));
        System.out.println(isSquare(s2));
        System.out.println(isSquare(s3));
    }
    static boolean isSquare(Shape shape){
        if(shape instanceof Rectangle){
            Rectangle rect = (Rectangle) shape;
            return rect.length == rect.width;
        }
        return shape instanceof Square;
    }

    static boolean isSquareImproved(Shape shape){
        if(shape instanceof Rectangle rect){
            return  rect.length == rect.width;
        }
        return shape instanceof Square;
    }
}
