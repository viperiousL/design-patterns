package com.itheima.pattern.iterator;

/**
 * @version v1.0
 * @ClassName: StudentAggregate
 * @Description: 抽象聚合角色接口
 * @Author: 黑马程序员
 */
public interface StudentAggregate {

    /**
     * 添加学生功能
     *
     * @param stu 学生
     */
    void addStudent(Student stu);

    /**
     * 删除学生功能
     *
     * @param stu 学生
     */
    void removeStudent(Student stu);

    /**
     * 获取迭代器对象功能
     *
     * @return 学生迭代器
     */
    StudentIterator getStudentIterator();
}
