/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.record.readOnly;

import turbozhao.record.Shape;

/**
 * @author turbozhao
 * @date 2022/9/30 13:44
 * @verison 1.0
 */
public final class Square implements Shape {
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
