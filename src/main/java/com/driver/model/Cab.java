package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Cab")
@NoArgsConstructor
@AllArgsConstructor
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int perKmRate;
    private boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    public Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver driver){
        this.driver = driver;
    }
    public boolean getAvailable() {
        return available;
    }

}