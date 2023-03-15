package cn.itcast.day06.demo05;

public class Demo01StudentCopy {

    public static void main(String[] args){
        StudentCopy stu = new StudentCopy();
        StudentCopy stu1 = new StudentCopy("高",18,true);
        stu.setName("寒");
        System.out.println(stu.getName());
        System.out.println("姓名" + stu1.getName() + "年纪" +stu1.getAge() + "性别男" + stu1.isMale());



    }


}
