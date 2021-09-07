package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.*;

@Entity
@Table(name="meetingroom")
public class Room {
    private long id;

    private String name;

    private String date;

    private String startHour;

    private String endHour;

    public Room(){

    }

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "date", nullable = false)
    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
    }

    @Column(name = "startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @Column(name = "getEndHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String toString(){
        return "Room[id="+id+",name="+name+",startHour="+startHour+",endHour"+endHour+"]";
    }





}

