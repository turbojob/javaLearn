/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.instanceOf;

/**
 * @author turbozhao
 * @date 2022/9/30 19:32
 * @verison 1.0
 */
public class Rectangle implements Shape{
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
