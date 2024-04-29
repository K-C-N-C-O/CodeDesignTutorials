package cn.kcnco.design.impl;

import cn.kcnco.design.ISkillArchery;
import cn.kcnco.design.ISkillInvisible;
import cn.kcnco.design.ISkillSilent;


public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
