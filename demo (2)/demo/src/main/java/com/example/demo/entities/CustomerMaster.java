package com.example.demo.entities;


import javax.persistence.*;

@Entity
@Table(name="VM1DTA.CHDRPF") //CustomerMaster
public class CustomerMaster {
    @Id
    @Column(name = "UNIQUE_NUMBER") //name is db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long UNIQUE_NUMBER ;

    private  String CHDRNUM;

    public CustomerMaster() {
    }

    public CustomerMaster(String CHDRNUM) {
        this.CHDRNUM = CHDRNUM;
    }

    public Long getUNIQUE_NUMBER() {
        return UNIQUE_NUMBER;
    }

    public void setUNIQUE_NUMBER(Long UNIQUE_NUMBER) {
        this.UNIQUE_NUMBER = UNIQUE_NUMBER;
    }

    public String getCHDRNUM() {
        return CHDRNUM;
    }

    public void setCHDRNUM(String CHDRNUM) {
        this.CHDRNUM = CHDRNUM;
    }

    @Override
    public String toString() {
        return "CustomerMaster{" +
                "UNIQUE_NUMBER=" + UNIQUE_NUMBER +
                ", CHDRNUM='" + CHDRNUM + '\'' +
                '}';
    }
}
