package com.guo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RebuyBatch {
    private Long id;

    private String memberId;

    private String busiFlowNo;

    private String quoteNo;

    private String dealNo;

    private String tradeType;

    private Date dealDate;

    private Date dealTime;

    private String dealStatus;

    private String busiType;

    private String saleBranchCode;

    private String saleBranchName;

    private String saleTraderNo;

    private String saleProductNo;

    private String buyBranchCode;

    private String buyBranchName;

    private String buyTraderNo;

    private String buyProductNo;

    private String billClass;

    private String billType;

    private Long sumNum;

    private BigDecimal sumAmt;

    private BigDecimal sumBuyAmt;

    private Integer tenorDays;

    private BigDecimal yieldRate;

    private String subDeal;

    private String quoteTime;

    private String settleSpeed;

    private String clearType;

    private String setTime;

    private String settleMode;

    private Date settleDate;

    private Date dueSettleDate;

    private BigDecimal settleAmt;

    private BigDecimal dueSettleAmt;

    private BigDecimal interest;

    private BigDecimal dueInterest;

    private BigDecimal rate;

    private BigDecimal dueRate;

    private String selectType;

    private String packetSeq;

    private String batchStatus;

    private String preTradeBhvr;

    private Date accountDate;

    private String rateCalFlag;

    private String changedInfo;

    private String preChangeInfo;

    private BigDecimal duePayInterest;

    private BigDecimal duePayAmt;

    private String clearStatus;

    private String dueClearStatus;

    private Date dueAccountDate;

    private Date createTime;

    private Date updateTime;

    private String applyTellerNo;

    private String checkTellerNo;

    private String acctTellerNo;

    private String custManagerNo;

    private String transBranchNo;

    private String acctBranchNo;

    private String deptNo;

    private String teamNo;

    private String sellBranchNo;

    private String manualAuditFlag;

    private String isInner;

    private String isRediscount;

    private String calInterestFlag;

    private String isSameAuthBranch;

    private String acctFlag;

    private String dueAcctFlag;

    private String preAuditFlag;

    private String auditNo;

    private String batchNo;

    private String productNo;

    private String buyTraderName;

    private String custManagerName;

    private String saleTraderName;

    private Long saleBatchId;

    private String packetLock;

    private String acctBusiType;

    private String riskInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getBusiFlowNo() {
        return busiFlowNo;
    }

    public void setBusiFlowNo(String busiFlowNo) {
        this.busiFlowNo = busiFlowNo == null ? null : busiFlowNo.trim();
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo == null ? null : quoteNo.trim();
    }

    public String getDealNo() {
        return dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo == null ? null : dealNo.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getSaleBranchCode() {
        return saleBranchCode;
    }

    public void setSaleBranchCode(String saleBranchCode) {
        this.saleBranchCode = saleBranchCode == null ? null : saleBranchCode.trim();
    }

    public String getSaleBranchName() {
        return saleBranchName;
    }

    public void setSaleBranchName(String saleBranchName) {
        this.saleBranchName = saleBranchName == null ? null : saleBranchName.trim();
    }

    public String getSaleTraderNo() {
        return saleTraderNo;
    }

    public void setSaleTraderNo(String saleTraderNo) {
        this.saleTraderNo = saleTraderNo == null ? null : saleTraderNo.trim();
    }

    public String getSaleProductNo() {
        return saleProductNo;
    }

    public void setSaleProductNo(String saleProductNo) {
        this.saleProductNo = saleProductNo == null ? null : saleProductNo.trim();
    }

    public String getBuyBranchCode() {
        return buyBranchCode;
    }

    public void setBuyBranchCode(String buyBranchCode) {
        this.buyBranchCode = buyBranchCode == null ? null : buyBranchCode.trim();
    }

    public String getBuyBranchName() {
        return buyBranchName;
    }

    public void setBuyBranchName(String buyBranchName) {
        this.buyBranchName = buyBranchName == null ? null : buyBranchName.trim();
    }

    public String getBuyTraderNo() {
        return buyTraderNo;
    }

    public void setBuyTraderNo(String buyTraderNo) {
        this.buyTraderNo = buyTraderNo == null ? null : buyTraderNo.trim();
    }

    public String getBuyProductNo() {
        return buyProductNo;
    }

    public void setBuyProductNo(String buyProductNo) {
        this.buyProductNo = buyProductNo == null ? null : buyProductNo.trim();
    }

    public String getBillClass() {
        return billClass;
    }

    public void setBillClass(String billClass) {
        this.billClass = billClass == null ? null : billClass.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public Long getSumNum() {
        return sumNum;
    }

    public void setSumNum(Long sumNum) {
        this.sumNum = sumNum;
    }

    public BigDecimal getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(BigDecimal sumAmt) {
        this.sumAmt = sumAmt;
    }

    public BigDecimal getSumBuyAmt() {
        return sumBuyAmt;
    }

    public void setSumBuyAmt(BigDecimal sumBuyAmt) {
        this.sumBuyAmt = sumBuyAmt;
    }

    public Integer getTenorDays() {
        return tenorDays;
    }

    public void setTenorDays(Integer tenorDays) {
        this.tenorDays = tenorDays;
    }

    public BigDecimal getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(BigDecimal yieldRate) {
        this.yieldRate = yieldRate;
    }

    public String getSubDeal() {
        return subDeal;
    }

    public void setSubDeal(String subDeal) {
        this.subDeal = subDeal == null ? null : subDeal.trim();
    }

    public String getQuoteTime() {
        return quoteTime;
    }

    public void setQuoteTime(String quoteTime) {
        this.quoteTime = quoteTime == null ? null : quoteTime.trim();
    }

    public String getSettleSpeed() {
        return settleSpeed;
    }

    public void setSettleSpeed(String settleSpeed) {
        this.settleSpeed = settleSpeed == null ? null : settleSpeed.trim();
    }

    public String getClearType() {
        return clearType;
    }

    public void setClearType(String clearType) {
        this.clearType = clearType == null ? null : clearType.trim();
    }

    public String getSetTime() {
        return setTime;
    }

    public void setSetTime(String setTime) {
        this.setTime = setTime == null ? null : setTime.trim();
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public Date getDueSettleDate() {
        return dueSettleDate;
    }

    public void setDueSettleDate(Date dueSettleDate) {
        this.dueSettleDate = dueSettleDate;
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

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getDueRate() {
        return dueRate;
    }

    public void setDueRate(BigDecimal dueRate) {
        this.dueRate = dueRate;
    }

    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType == null ? null : selectType.trim();
    }

    public String getPacketSeq() {
        return packetSeq;
    }

    public void setPacketSeq(String packetSeq) {
        this.packetSeq = packetSeq == null ? null : packetSeq.trim();
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus == null ? null : batchStatus.trim();
    }

    public String getPreTradeBhvr() {
        return preTradeBhvr;
    }

    public void setPreTradeBhvr(String preTradeBhvr) {
        this.preTradeBhvr = preTradeBhvr == null ? null : preTradeBhvr.trim();
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getRateCalFlag() {
        return rateCalFlag;
    }

    public void setRateCalFlag(String rateCalFlag) {
        this.rateCalFlag = rateCalFlag == null ? null : rateCalFlag.trim();
    }

    public String getChangedInfo() {
        return changedInfo;
    }

    public void setChangedInfo(String changedInfo) {
        this.changedInfo = changedInfo == null ? null : changedInfo.trim();
    }

    public String getPreChangeInfo() {
        return preChangeInfo;
    }

    public void setPreChangeInfo(String preChangeInfo) {
        this.preChangeInfo = preChangeInfo == null ? null : preChangeInfo.trim();
    }

    public BigDecimal getDuePayInterest() {
        return duePayInterest;
    }

    public void setDuePayInterest(BigDecimal duePayInterest) {
        this.duePayInterest = duePayInterest;
    }

    public BigDecimal getDuePayAmt() {
        return duePayAmt;
    }

    public void setDuePayAmt(BigDecimal duePayAmt) {
        this.duePayAmt = duePayAmt;
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus == null ? null : clearStatus.trim();
    }

    public String getDueClearStatus() {
        return dueClearStatus;
    }

    public void setDueClearStatus(String dueClearStatus) {
        this.dueClearStatus = dueClearStatus == null ? null : dueClearStatus.trim();
    }

    public Date getDueAccountDate() {
        return dueAccountDate;
    }

    public void setDueAccountDate(Date dueAccountDate) {
        this.dueAccountDate = dueAccountDate;
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

    public String getApplyTellerNo() {
        return applyTellerNo;
    }

    public void setApplyTellerNo(String applyTellerNo) {
        this.applyTellerNo = applyTellerNo == null ? null : applyTellerNo.trim();
    }

    public String getCheckTellerNo() {
        return checkTellerNo;
    }

    public void setCheckTellerNo(String checkTellerNo) {
        this.checkTellerNo = checkTellerNo == null ? null : checkTellerNo.trim();
    }

    public String getAcctTellerNo() {
        return acctTellerNo;
    }

    public void setAcctTellerNo(String acctTellerNo) {
        this.acctTellerNo = acctTellerNo == null ? null : acctTellerNo.trim();
    }

    public String getCustManagerNo() {
        return custManagerNo;
    }

    public void setCustManagerNo(String custManagerNo) {
        this.custManagerNo = custManagerNo == null ? null : custManagerNo.trim();
    }

    public String getTransBranchNo() {
        return transBranchNo;
    }

    public void setTransBranchNo(String transBranchNo) {
        this.transBranchNo = transBranchNo == null ? null : transBranchNo.trim();
    }

    public String getAcctBranchNo() {
        return acctBranchNo;
    }

    public void setAcctBranchNo(String acctBranchNo) {
        this.acctBranchNo = acctBranchNo == null ? null : acctBranchNo.trim();
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo == null ? null : teamNo.trim();
    }

    public String getSellBranchNo() {
        return sellBranchNo;
    }

    public void setSellBranchNo(String sellBranchNo) {
        this.sellBranchNo = sellBranchNo == null ? null : sellBranchNo.trim();
    }

    public String getManualAuditFlag() {
        return manualAuditFlag;
    }

    public void setManualAuditFlag(String manualAuditFlag) {
        this.manualAuditFlag = manualAuditFlag == null ? null : manualAuditFlag.trim();
    }

    public String getIsInner() {
        return isInner;
    }

    public void setIsInner(String isInner) {
        this.isInner = isInner == null ? null : isInner.trim();
    }

    public String getIsRediscount() {
        return isRediscount;
    }

    public void setIsRediscount(String isRediscount) {
        this.isRediscount = isRediscount == null ? null : isRediscount.trim();
    }

    public String getCalInterestFlag() {
        return calInterestFlag;
    }

    public void setCalInterestFlag(String calInterestFlag) {
        this.calInterestFlag = calInterestFlag == null ? null : calInterestFlag.trim();
    }

    public String getIsSameAuthBranch() {
        return isSameAuthBranch;
    }

    public void setIsSameAuthBranch(String isSameAuthBranch) {
        this.isSameAuthBranch = isSameAuthBranch == null ? null : isSameAuthBranch.trim();
    }

    public String getAcctFlag() {
        return acctFlag;
    }

    public void setAcctFlag(String acctFlag) {
        this.acctFlag = acctFlag == null ? null : acctFlag.trim();
    }

    public String getDueAcctFlag() {
        return dueAcctFlag;
    }

    public void setDueAcctFlag(String dueAcctFlag) {
        this.dueAcctFlag = dueAcctFlag == null ? null : dueAcctFlag.trim();
    }

    public String getPreAuditFlag() {
        return preAuditFlag;
    }

    public void setPreAuditFlag(String preAuditFlag) {
        this.preAuditFlag = preAuditFlag == null ? null : preAuditFlag.trim();
    }

    public String getAuditNo() {
        return auditNo;
    }

    public void setAuditNo(String auditNo) {
        this.auditNo = auditNo == null ? null : auditNo.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getBuyTraderName() {
        return buyTraderName;
    }

    public void setBuyTraderName(String buyTraderName) {
        this.buyTraderName = buyTraderName == null ? null : buyTraderName.trim();
    }

    public String getCustManagerName() {
        return custManagerName;
    }

    public void setCustManagerName(String custManagerName) {
        this.custManagerName = custManagerName == null ? null : custManagerName.trim();
    }

    public String getSaleTraderName() {
        return saleTraderName;
    }

    public void setSaleTraderName(String saleTraderName) {
        this.saleTraderName = saleTraderName == null ? null : saleTraderName.trim();
    }

    public Long getSaleBatchId() {
        return saleBatchId;
    }

    public void setSaleBatchId(Long saleBatchId) {
        this.saleBatchId = saleBatchId;
    }

    public String getPacketLock() {
        return packetLock;
    }

    public void setPacketLock(String packetLock) {
        this.packetLock = packetLock == null ? null : packetLock.trim();
    }

    public String getAcctBusiType() {
        return acctBusiType;
    }

    public void setAcctBusiType(String acctBusiType) {
        this.acctBusiType = acctBusiType == null ? null : acctBusiType.trim();
    }

    public String getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo == null ? null : riskInfo.trim();
    }
}