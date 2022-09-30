/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.record.readOnly;

import turbozhao.record.Shape;

/**
 * @author turbozhao
 * @date 2022/9/30 13:42
 * @verison 1.0
 */
public final class Circle implements Shape {
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
