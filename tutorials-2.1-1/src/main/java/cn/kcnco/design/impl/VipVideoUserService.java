package cn.kcnco.design.impl;

import cn.kcnco.design.IVideoUserService;

public class VipVideoUserService implements IVideoUserService {
    @Override
    public void defination() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
