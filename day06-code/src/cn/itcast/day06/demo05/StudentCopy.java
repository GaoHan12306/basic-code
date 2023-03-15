package cn.itcast.day06.demo05;

public class StudentCopy {
    private String name;
    private int age;
    private boolean male;

    public StudentCopy(){

    }
    public StudentCopy(String name,int age,boolean male){
     this.name = name;
     this.age = age;
     this.male = male;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }
}
