/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.record.bestRecord;

import turbozhao.record.Shape;

/**
 * @author turbozhao
 * @date 2022/9/30 13:46
 * @verison 1.0
 */
public record Circle(double radius) implements Shape {
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
