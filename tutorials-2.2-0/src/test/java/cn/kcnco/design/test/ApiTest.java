package cn.kcnco.design.test;

import cn.kcnco.design.ICalculateArea;
import cn.kcnco.design.impl.CalculateAreaExt;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CalculateAreaExt(){
        ICalculateArea area=new CalculateAreaExt();
        double circular=area.circular(10);
        System.out.println(circular);

    }
}
