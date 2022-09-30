## 文字块
1. 认识 textarea 是什么？基本语法是什么？ """
2. textarea 和 原始的长字符串处理方式产生的对象指向同一内存地址。
3. 文字块可以调用字符串 String 的 API 。
4. 可以使用嵌入式的表达式 。
5. textarea 是如何处理共享的前导空格的。
6. 需要保留 textarea 怎么办？添加一个 \s 即可保留 此行 '\s' 及之前的空格。
7. 如何在遵守编码规范的前提下处理长段落：在需要断行的地方 添加 \ 即可。

## 档案类
1、不可变的数据

2、透明的载体

equals，hashcode，toString帮我们实现了
为了最大化性能，优先考虑使用不可变的对象；如果一个类是用来表述不可变的对象，优先使用Java的档案类。
 > 一个类，如果是用来表述不可变的数据，能不能使用档案类？
## 封闭类
被扩展的：封闭类
扩展出来的：许可类
可扩展性的限定方法：使用私有类，final修饰符，sealed修饰符，不受限制的扩展性
 > 一个类，如果有真实的可扩展需求，能不能枚举，可不可以使用sealed 修饰

## 类型匹配
场景：判断一个shape 是不是 正方形包含：
    1、【类型判断语句】shape 是不是 长方形的实例  instanceof
    2、【类型转换语句+声明新的本地变量】把shape强转 为长方形，判断宽==长

第二步成立的前提是，第一步 成立

 > 如果需要类型转换，是不是可以使用类型匹配？

```
static boolean isSquare(Shape shape){
    if(shape instanceof Rectangle){
         Rectangle rect = (Rectangle) shape;
         return rect.length == rect.width;
    }
    return shape instanceof Square;
 }
```
```
static boolean isSquareImproved(Shape shape){
    if(shape instanceof Rectangle rect){
        return  rect.length == rect.width;
    }
    return shape instanceof Square;
}
```
## switch 表达式