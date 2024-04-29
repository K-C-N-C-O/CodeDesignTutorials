package cn.kcnco.design.impl;


//扩展继承实现自己需求
public class CalculateAreaExt extends CalculateArea{

    private final static double π=3.1415926D;

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
