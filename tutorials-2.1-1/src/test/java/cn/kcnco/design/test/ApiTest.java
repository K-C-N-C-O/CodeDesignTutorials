package cn.kcnco.design.test;

import cn.kcnco.design.IVideoUserService;
import cn.kcnco.design.impl.GuestVideoUserService;

public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService guest=new GuestVideoUserService();
        guest.defination();
        guest.advertisement();

    }
}
