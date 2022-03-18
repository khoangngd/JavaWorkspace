package com.tls.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="VM1DTA.CHDRPF")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Number Id;
    private Number CONTRACTNO;
    private String APPLICATIONNO;
    private Date RISKCOMMENCEMENTDATE;
    private String BILLINGFREQUENCY;

    public Contract() { }

    public Contract(Number CONTRACTNO, String APPLICATIONNO, Date RISKCOMMENCEMENTDATE, String BILLINGFREQUENCY) {
        this.CONTRACTNO = CONTRACTNO;
        this.APPLICATIONNO = APPLICATIONNO;
        this.RISKCOMMENCEMENTDATE = RISKCOMMENCEMENTDATE;
        this.BILLINGFREQUENCY = BILLINGFREQUENCY;
    }

    public Number getId() {
        return Id;
    }

    public void setId(Number id) {
        Id = id;
    }

    public Number getCONTRACTNO() {
        return CONTRACTNO;
    }

    public void setCONTRACTNO(Number CONTRACTNO) {
        this.CONTRACTNO = CONTRACTNO;
    }

    public String getAPPLICATIONNO() {
        return APPLICATIONNO;
    }

    public void setAPPLICATIONNO(String APPLICATIONNO) {
        this.APPLICATIONNO = APPLICATIONNO;
    }

    public Date getRISKCOMMENCEMENTDATE() {
        return RISKCOMMENCEMENTDATE;
    }

    public void setRISKCOMMENCEMENTDATE(Date RISKCOMMENCEMENTDATE) {
        this.RISKCOMMENCEMENTDATE = RISKCOMMENCEMENTDATE;
    }

    public String getBILLINGFREQUENCY() {
        return BILLINGFREQUENCY;
    }

    public void setBILLINGFREQUENCY(String BILLINGFREQUENCY) {
        this.BILLINGFREQUENCY = BILLINGFREQUENCY;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "Id=" + Id +
                ", CONTRACTNO=" + CONTRACTNO +
                ", APPLICATIONNO='" + APPLICATIONNO + '\'' +
                ", RISKCOMMENCEMENTDATE=" + RISKCOMMENCEMENTDATE +
                ", BILLINGFREQUENCY='" + BILLINGFREQUENCY + '\'' +
                '}';
    }
}
