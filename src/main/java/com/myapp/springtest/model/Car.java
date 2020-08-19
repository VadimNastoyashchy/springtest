package com.myapp.springtest.model;

import javax.persistence.*;

/**
 * @author Vadym Nastoiashchyi
 */

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_mark")
    private String carMark;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_price")
    private float carPrice;

    @Column(name = "car_info")
    private String carInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carPrice=" + carPrice +
                ", carInfo='" + carInfo + '\'' +
                '}';
    }
}
