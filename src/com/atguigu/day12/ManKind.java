package com.atguigu.day12;

import javax.xml.bind.SchemaOutputResolver;

public class ManKind {
    private int sex;
    private int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public ManKind() {
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void manOrWomen(){
        if (sex==1){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }
    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }
}
