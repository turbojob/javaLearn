/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.sealedClasses.sealed;

/**
 * @author turbozhao
 * @date 2022/9/30 13:59
 * @verison 1.0
 */
public final class Square extends Shape {
    public final double side;

    public Square(String id, double side) {
        super(id);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
