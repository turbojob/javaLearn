
package turbozhao.record.simple;

import turbozhao.record.Shape;

//多线程不安全，为了安全就需要加syn
public final class Circle implements Shape {
    private double r;
    public Circle(double ra){
        r = ra;
    }
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
    public double getR(){
        return r;
    }
    public void setR(double r1){
        r = r1;
    }
}
