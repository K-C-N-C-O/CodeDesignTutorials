package cn.kcnco.design.impl;

import cn.kcnco.design.ISkillInvisible;
import cn.kcnco.design.ISkillSilent;
import cn.kcnco.design.ISkillVertigo;


public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

}
