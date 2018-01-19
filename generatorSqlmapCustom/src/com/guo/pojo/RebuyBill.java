package com.guo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RebuyBill {
    private Long id;

    private Long batchId;

    private String memberId;

    private String billNo;

    private BigDecimal billMoney;

    private Date dueDate;

    private Date dueMatDate;

    private Date issuDate;

    private String remitter;

    private String drawee;

    private String acceptorBranchCode;

    private String acptCfmBranchCode;

    private String acptGuarntrBranchCode;

    private String discBranchCode;

    private String discGuarntrBranchCode;

    private String trustBranchCode;

    private Integer remainDays;

    private Integer dueRemainDays;

    private BigDecimal interest;

    private BigDecimal dueInterest;

    private BigDecimal settleAmt;

    private BigDecimal dueSettleAmt;

    private String scrRelationFlag;

    private String preRelationFlag;

    private Long billId;

    private String freeznFlag;

    private String gathType;

    private Date gathDate;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public BigDecimal getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(BigDecimal billMoney) {
        this.billMoney = billMoney;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueMatDate() {
        return dueMatDate;
    }

    public void setDueMatDate(Date dueMatDate) {
        this.dueMatDate = dueMatDate;
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

    public String getDrawee() {
        return drawee;
    }

    public void setDrawee(String drawee) {
        this.drawee = drawee == null ? null : drawee.trim();
    }

    public String getAcceptorBranchCode() {
        return acceptorBranchCode;
    }

    public void setAcceptorBranchCode(String acceptorBranchCode) {
        this.acceptorBranchCode = acceptorBranchCode == null ? null : acceptorBranchCode.trim();
    }

    public String getAcptCfmBranchCode() {
        return acptCfmBranchCode;
    }

    public void setAcptCfmBranchCode(String acptCfmBranchCode) {
        this.acptCfmBranchCode = acptCfmBranchCode == null ? null : acptCfmBranchCode.trim();
    }

    public String getAcptGuarntrBranchCode() {
        return acptGuarntrBranchCode;
    }

    public void setAcptGuarntrBranchCode(String acptGuarntrBranchCode) {
        this.acptGuarntrBranchCode = acptGuarntrBranchCode == null ? null : acptGuarntrBranchCode.trim();
    }

    public String getDiscBranchCode() {
        return discBranchCode;
    }

    public void setDiscBranchCode(String discBranchCode) {
        this.discBranchCode = discBranchCode == null ? null : discBranchCode.trim();
    }

    public String getDiscGuarntrBranchCode() {
        return discGuarntrBranchCode;
    }

    public void setDiscGuarntrBranchCode(String discGuarntrBranchCode) {
        this.discGuarntrBranchCode = discGuarntrBranchCode == null ? null : discGuarntrBranchCode.trim();
    }

    public String getTrustBranchCode() {
        return trustBranchCode;
    }

    public void setTrustBranchCode(String trustBranchCode) {
        this.trustBranchCode = trustBranchCode == null ? null : trustBranchCode.trim();
    }

    public Integer getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(Integer remainDays) {
        this.remainDays = remainDays;
    }

    public Integer getDueRemainDays() {
        return dueRemainDays;
    }

    public void setDueRemainDays(Integer dueRemainDays) {
        this.dueRemainDays = dueRemainDays;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getDueInterest() {
        return dueInterest;
    }

    public void setDueInterest(BigDecimal dueInterest) {
        this.dueInterest = dueInterest;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public BigDecimal getDueSettleAmt() {
        return dueSettleAmt;
    }

    public void setDueSettleAmt(BigDecimal dueSettleAmt) {
        this.dueSettleAmt = dueSettleAmt;
    }

    public String getScrRelationFlag() {
        return scrRelationFlag;
    }

    public void setScrRelationFlag(String scrRelationFlag) {
        this.scrRelationFlag = scrRelationFlag == null ? null : scrRelationFlag.trim();
    }

    public String getPreRelationFlag() {
        return preRelationFlag;
    }

    public void setPreRelationFlag(String preRelationFlag) {
        this.preRelationFlag = preRelationFlag == null ? null : preRelationFlag.trim();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getFreeznFlag() {
        return freeznFlag;
    }

    public void setFreeznFlag(String freeznFlag) {
        this.freeznFlag = freeznFlag == null ? null : freeznFlag.trim();
    }

    public String getGathType() {
        return gathType;
    }

    public void setGathType(String gathType) {
        this.gathType = gathType == null ? null : gathType.trim();
    }

    public Date getGathDate() {
        return gathDate;
    }

    public void setGathDate(Date gathDate) {
        this.gathDate = gathDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}