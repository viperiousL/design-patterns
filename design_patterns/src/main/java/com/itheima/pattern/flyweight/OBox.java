package com.itheima.pattern.flyweight;

/**
 * @version v1.0
 * @ClassName: IBox
 * @Description: O图形类(具体享元角色)
 * @Author: 黑马程序员
 */
public class OBox extends AbstractBox {

    @Override
    public String getShape() {
        return "O";
    }
}
