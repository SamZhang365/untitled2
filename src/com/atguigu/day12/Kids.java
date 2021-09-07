package com.atguigu.day12;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("年龄为： "+yearsOld);
    }
}
