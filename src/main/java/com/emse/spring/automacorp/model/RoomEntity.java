package com.emse.spring.automacorp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "SP_ROOM")
public class RoomEntity {

    //Columns
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private byte floor ;

    @Column
    private double targetTemperature;

    @OneToOne
    private SensorEntity currentTemperature;

    //Constructor
    public Long getId() { // .
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public byte getFloor(){
        return floor ;
    }
    public void setFloor(byte floor){
        this.floor = floor ;
    }

    public double getTargetTemperature(){
        return targetTemperature;
    }
    public void setTargetTemperature(double targetTemperature){
        this.targetTemperature=targetTemperature;
    }

    public SensorEntity getCurrentTemperature(){
        return currentTemperature;
    }
    public void setCurrentTemperature(SensorEntity currentTemperature){
        this.currentTemperature = currentTemperature;
    }
}