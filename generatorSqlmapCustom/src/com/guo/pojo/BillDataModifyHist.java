package com.guo.pojo;

import java.util.Date;

public class BillDataModifyHist {
    private Long id;

    private Integer billId;

    private String billNo;

    private Date issuDate;

    private String remitter;

    private String remitterAcctNo;

    private String payee;

    private String prodName;

    private String modifyUser;

    private Date creatTime;

    private String billSource;

    private Integer rebuybillId;

    private String initalType;

    private String custManagerName;

    private String custManagerNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Date getIssuDate() {
        return issuDate;
    }

    public void setIssuDate(Date issuDate) {
        this.issuDate = issuDate;
    }

    public String getRemitter() {
        return remitter;
    }

    public void setRemitter(String remitter) {
        this.remitter = remitter == null ? null : remitter.trim();
    }

    public String getRemitterAcctNo() {
        return remitterAcctNo;
    }

    public void setRemitterAcctNo(String remitterAcctNo) {
        this.remitterAcctNo = remitterAcctNo == null ? null : remitterAcctNo.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getBillSource() {
        return billSource;
    }

    public void setBillSource(String billSource) {
        this.billSource = billSource == null ? null : billSource.trim();
    }

    public Integer getRebuybillId() {
        return rebuybillId;
    }

    public void setRebuybillId(Integer rebuybillId) {
        this.rebuybillId = rebuybillId;
    }

    public String getInitalType() {
        return initalType;
    }

    public void setInitalType(String initalType) {
        this.initalType = initalType == null ? null : initalType.trim();
    }

    public String getCustManagerName() {
        return custManagerName;
    }

    public void setCustManagerName(String custManagerName) {
        this.custManagerName = custManagerName == null ? null : custManagerName.trim();
    }

    public String getCustManagerNo() {
        return custManagerNo;
    }

    public void setCustManagerNo(String custManagerNo) {
        this.custManagerNo = custManagerNo == null ? null : custManagerNo.trim();
    }
}