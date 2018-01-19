package com.guo.pojo;

import java.util.Date;

public class BillModifyHist {
    private Long id;

    private Integer billId;

    private String billNo;

    private String modifyProrName;

    private Date modifyDt;

    private String modifyBefore;

    private String modifyAfter;

    private String modifyUser;

    private String billSource;

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

    public String getModifyProrName() {
        return modifyProrName;
    }

    public void setModifyProrName(String modifyProrName) {
        this.modifyProrName = modifyProrName == null ? null : modifyProrName.trim();
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getModifyBefore() {
        return modifyBefore;
    }

    public void setModifyBefore(String modifyBefore) {
        this.modifyBefore = modifyBefore == null ? null : modifyBefore.trim();
    }

    public String getModifyAfter() {
        return modifyAfter;
    }

    public void setModifyAfter(String modifyAfter) {
        this.modifyAfter = modifyAfter == null ? null : modifyAfter.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getBillSource() {
        return billSource;
    }

    public void setBillSource(String billSource) {
        this.billSource = billSource == null ? null : billSource.trim();
    }
}