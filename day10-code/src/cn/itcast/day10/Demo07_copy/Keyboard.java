package cn.itcast.day10.Demo07_copy;

/**
 * @Author Han
 * @Date 2020/8/16 16:07
 * @Version 1.0  @Title：
 */
public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");

    }

    @Override
    public void closed() {
        System.out.println("关闭键盘");

    }
    public void daZi(){
        System.out.println("打字");
    }
}
