package cn.kcnco.design.impl;

import cn.kcnco.design.IVideoUserService;

public class OrdinaryVideoUserService implements IVideoUserService {

    @Override
    public void defination() {
        System.out.println("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
