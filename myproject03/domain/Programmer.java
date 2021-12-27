package com.wufujian.myproject03.domain;

import com.wufujian.myproject03.service.Status;

/**
 * @author:gfk
 * @create:2021/12/21
 * @Description:
 * @FileName:Programmer
 * @History:
 * @自定义内容:
 */
public class Programmer extends Employee{
    private int memberId;//开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + " \t\t程序员 \t\t" + status + " \t \t \t \t \t \t" + equipment.getDescription();
    }

    public String getTeamBaseDetails(){
        return memberId + "/" + getId() + " \t" + getName() + " \t" + getAge() + " \t\t" + getSalary();
    }
    public  String getDetailsForTeam() {
        return getTeamBaseDetails() + "\t程序员";
    }
}
