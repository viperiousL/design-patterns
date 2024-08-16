package com.itheima.pattern.interpreter;

import java.util.Objects;

/**
 * @version v1.0
 * @ClassName: Variable
 * @Description: 封装变量的类
 * @Author: 黑马程序员
 */
public class Variable extends AbstractExpression {

    /**
     * 声明存储变量名的成员变量
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        //直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
