package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Contract {
    @Id
    private Number unique_number;
    private Number chdrnum;

    private String CUST_NO;
    private String CUST_DST_COD;
    private String RNM_NO;
    private String RNM_CONF_CD;
    private String CUST_STTS_COD;
    private String JOIN_DT;
    private String AGE;
    private String KOR_NM;
    private String ENG_NM;
    private String SEX_COD;
    private String BIRTH_DT;
    private String NATN_CD;
    private String POST_NO;
    private String H_ADDR;
    private String O_ADDR;
    private String PHONE_TEL_NO;
    private String HP_TEL_NO;
    private String E_MAIL;
    private String JOB_COD;
    private String NTR_YN;
    private String BIZ_COD;
    private String WKPL_NM;
    private String DEPT_NM;
    private String POS_NM;
    private String HDOF_ADDR;
    private String HDOF_ADDR_DETL;
    private String HDOF_POST_NO;
    private String HDOF_TEL_NO;
    private String HDOF_FAX_NO;
    private String BIZ_ADDR;
    private String BIZ_ADDR_DETL;
    private String BIZ_POST_NO;
    private String BIZ_TEL_NO;
    private String BIZ_FAX_NO;
    private String BIZ_RGST_NO;
    private String CORP_RGST_NO;
    private String PSNO;
    private String LIVE_YN;
    private String CORP_SCALE_COD;
    private String LST_YN;
    private String HOMEPAGE;
    private String ESTB_DT;
    private String OUT_DT;
    private String RGS_DTM;


    public Contract() {
    }

    public Contract(Number unique_number, Number chdrnum) {
        this.unique_number = unique_number;
        this.chdrnum = chdrnum;
    }

    public Number getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(Number unique_number) {
        this.unique_number = unique_number;
    }

    public Number getChdrnum() {
        return chdrnum;
    }

    public void setChdrnum(Number chdrnum) {
        this.chdrnum = chdrnum;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "unique_number=" + unique_number +
                ", chdrnum=" + chdrnum +
                '}';
    }
}
