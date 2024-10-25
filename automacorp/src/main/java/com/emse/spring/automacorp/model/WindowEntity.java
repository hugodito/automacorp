package com.emse.spring.automacorp.model;

import jakarta.persistence.* ;

import java.util.List;

@Entity
@Table(name="SP_WINDOW")
public class WindowEntity {

    @Id
    @GeneratedValue
    private Long id ;

    @Column(nullable = false , length = 255)
    private String name ;

    @OneToOne
    private SensorEntity windowStatus;

    @ManyToOne
    @JoinColumn(name="ROOM_ID")
    private RoomEntity roomId;

    public WindowEntity() {
    }

    //Constructor
    public WindowEntity(String name, SensorEntity sensor) {
        this.windowStatus = sensor;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public SensorEntity getWindowStatus() {
        return windowStatus;
    }
    public void setWindowStatus(SensorEntity windowStatus) {
        this.windowStatus = windowStatus;
    }

    //useridconstr

}
