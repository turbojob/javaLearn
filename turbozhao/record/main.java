/*
 * Copyright (c) 2022, turbozhao. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

package turbozhao.record;

import turbozhao.record.bestRecord.Circle;

/**
 * @author turbozhao
 * @date 2022/9/30 13:47
 * @verison 1.0
 */
public class main {
    public static void main(String[] args) {
        //实现档案类 最优解
        Circle c1 = new Circle(10);
        double r = c1.radius();
        Circle c2 = new Circle(10);

        //true 已经帮我们重载了 equals
        System.out.println(c1.equals(c2));
        //false
        System.out.println(c1 == c2);
    }
}
