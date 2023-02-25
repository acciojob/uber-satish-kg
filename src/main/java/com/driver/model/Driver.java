package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Driver")
@NoArgsConstructor
@AllArgsConstructor

public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    @Column(nullable = false)
    private String mobile;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking>tripBookingList = new ArrayList<>();

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;

    public Cab getCab(){
        return cab;
    }
    public void setCab(Cab cab) {
        this.cab = cab;
    }
}