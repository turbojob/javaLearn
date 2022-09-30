/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.sealedClasses.sealed;

/**
 * @author turbozhao
 * @date 2022/9/30 13:58
 * @verison 1.0
 */
public abstract sealed class Shape permits Square {
    public final String id;

    public Shape(String id) {
        this.id = id;
    }
    public abstract double area();
}
