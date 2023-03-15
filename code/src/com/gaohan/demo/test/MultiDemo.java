package com.gaohan.demo.test;
/*多态
*在多态中，编译看左边，运行看右边
* */
public class MultiDemo {
    public static void main(String[] args) {
        // 多态的引用，就是向上转型
        Animals dog = new Dog();
        dog.eat();

        Animals cat = new Cat();
        cat.eat();

        // 如果要调用父类中没有的方法，则要向下转型
        Dog dogDown = (Dog)dog;
        dogDown.watchDoor();

    }
}
class Animals {
    public void eat(){
        System.out.println("动物吃饭！");
    }
}
class Dog extends Animals{
    public void eat(){
        System.out.println("狗在吃骨头！");
    }
    public void watchDoor(){
        System.out.println("狗看门！");
    }
}
class Cat extends Animals{
    public void eat(){
        System.out.println("猫在吃鱼！");
    }
}