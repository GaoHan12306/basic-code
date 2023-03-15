package cn.itcast.day10.Demo07_copy;

/**
 * @Author Han
 * @Date 2020/8/16 15:57
 * @Version 1.0  @Title笔记本电脑使用
 */
public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //插入一个鼠标，供电脑使用
        USB usb = new Mouse();
        computer.useDevice(usb);

        //插入一个键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);//向上转型 从小到大


        computer.powerOff();
    }
}
