package cn.itcast.day10.Demo07_copy;

/**
 * @Author Han
 * @Date 2020/8/16 15:47
 * @Version 1.0  @Title：
 */
public class Computer {

    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse)
        {
            ((Mouse) usb).click();

        }
        else if(usb instanceof Keyboard)
        {
            ((Keyboard) usb).daZi();

        }
        usb.closed();

    }



}
