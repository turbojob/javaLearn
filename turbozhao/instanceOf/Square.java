/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.instanceOf;

/**
 * @author turbozhao
 * @date 2022/9/30 19:34
 * @verison 1.0
 */
public class Square implements Shape{
    int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
