package cn.kcnco.design;

import java.util.HashMap;
import java.util.Map;


public class Principal {

    private Teacher teacher = new Teacher("丽华", "3年1班");

    // 查询班级信息，总分数、学生人数、平均值
    public Map<String, Object> queryClazzInfo(String clazzId) {
        // 获取班级信息；学生总人数、总分、平均分
        int stuCount = clazzStudentCount();
        double totalScore = clazzTotalScore();
        double averageScore = clazzAverageScore();

        // 组装对象，实际业务开发会有对应的类
        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("班级", teacher.getClazz());
        mapObj.put("老师", teacher.getName());
        mapObj.put("学生人数", stuCount);
        mapObj.put("班级总分数", totalScore);
        mapObj.put("班级平均分", averageScore);
        return mapObj;
    }

    // 总分
    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student stu : Teacher.getStudentList()) {
            totalScore += stu.getGrade();
        }
        return totalScore;
    }

    // 平均分
    public double clazzAverageScore(){
        double totalScore = 0;
        for (Student stu : Teacher.getStudentList()) {
            totalScore += stu.getGrade();
        }
        return totalScore / Teacher.getStudentList().size();
    }

    // 班级人数
    public int clazzStudentCount(){
        return Teacher.getStudentList().size();
    }

}
