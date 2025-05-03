package edu.luhan.feb25.demo;

public class Demo157OverrideChild extends Demo157OverrideParent{

    /* 重写不等于重载
    注意事项：
    - 重写的方法名称和参数必须一样
    - 子类的修饰类型如void要小于父，Object最大>String
    - 子类的方法的权限必须大于父，eg public>protected>default>private

     */


    @Override
    public String method(){
        return null;
    }
}
