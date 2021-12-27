package com.wufujian.myproject03.domain;

/**
 * @author:gfk
 * @create:2021/12/22
 * @Description:
 * @FileName:Designer
 * @History:
 * @自定义内容:
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "  \t设计师 \t\t" + getStatus() + " \t" + bonus + " \t \t\t\t" + getEquipment().getDescription();
    }

    @Override
    public  String getDetailsForTeam() {
        return getTeamBaseDetails() + "\t设计师\t" + getBonus();
    }
}
