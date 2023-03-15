package cn.itcast.day10.Demo07_copy;

/**
 * @Author Han
 * @Date 2020/8/16 15:56
 * @Version 1.0  @Title：
 */
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("使用鼠标");

    }

    @Override
    public void closed() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击");
    }

}
