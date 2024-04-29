package cn.kcnco.design.impl;

import cn.kcnco.design.IVideoUserService;

public class GuestVideoUserService implements IVideoUserService {

    @Override
    public void defination() {
        System.out.println("访客用户，视频480P高清");
    }
    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
