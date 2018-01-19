package com.guo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RebuyBillBatch {

	/**
     *   主键ID
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Long id;

    /**
     *   业务批次ID
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Long batchId;

    /**
     *   会员代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String memberId;

    /**
     *   票据号码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String billNo;

    /**
     *   票据金额
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private BigDecimal billMoney;

    /**
     *   汇票到期日 票面到期日
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date dueDate;

    /**
     *   票据实际到期日 票面到期日
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date dueMatDate;

    /**
     *   出票日期
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date issuDate;

    /**
     *   出票人全称
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String remitter;

    /**
     *   付款人名称
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String drawee;

    /**
     *   承兑行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String acceptorBranchCode;

    /**
     *   承兑保证行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String acptCfmBranchCode;

    /**
     *   承兑保证行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String acptGuarntrBranchCode;

    /**
     *   贴现行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String discBranchCode;

    /**
     *   贴现保证行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String discGuarntrBranchCode;

    /**
     *   增信行机构代码
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String trustBranchCode;

    /**
     *   首期剩余期限 回购期限/加权平均剩余期限
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Integer remainDays;

    /**
     *   到期剩余期限 回购期限/加权平均剩余期限
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Integer dueRemainDays;

    /**
     *   首期应付利息
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private BigDecimal interest;

    /**
     *   到期应付利息
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private BigDecimal dueInterest;

    /**
     *   首期结算金额
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private BigDecimal settleAmt;

    /**
     *   到期结算金额
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private BigDecimal dueSettleAmt;

    /**
     *   源关联关系
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String scrRelationFlag;

    /**
     *   预关联关系
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String preRelationFlag;

    /**
     *   登记中心ID
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Long billId;

    /**
     *   额度占用标志
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String freeznFlag;

    /**
     *   销账方式
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private String gathType;

    /**
     *   销账日期
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date gathDate;

    /**
     *   创建时间
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date createTime;

    /**
     *   修改时间
     *
     * @mbg.generated 2017-10-10 15:46:52
     */
    private Date updateTime;
    
    
    /**
     *   主键ID
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Long batch_Id;



    /**
     *   业务流水号
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String busiFlowNo;

    /**
     *   报价单号
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String quoteNo;

    /**
     *   成交单编号
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String dealNo;

    /**
     *   成交方式
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String tradeType;

    /**
     *   成交日期
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Date dealDate;

    /**
     *   成交时间
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Date dealTime;

    /**
     *   成交状态
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String dealStatus;

    /**
     *   票交所转贴现业务类型
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String busiType;

    /**
     *   卖出方机构代码
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String saleBranchCode;

    /**
     *   卖出方机构名称
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String saleBranchName;

    /**
     *   卖出方交易员编号
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String saleTraderNo;

    /**
     *   卖出方非法人产品
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String saleProductNo;

    /**
     *   买入方机构代码
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String buyBranchCode;

    /**
     *   买入方机构名称
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String buyBranchName;

    /**
     *   买入方交易员编号
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String buyTraderNo;

    /**
     *   买入方非法人产品
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String buyProductNo;

    /**
     *   票据介质
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String billClass;

    /**
     *   票据类型
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String billType;

    /**
     *   总笔数
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Long sumNum;

    /**
     *   总金额
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private BigDecimal sumAmt;

    /**
     *   回购总金额
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private BigDecimal sumBuyAmt;

    /**
     *   加权平均剩余期限 回购期限/加权平均剩余期限
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Integer tenorDays;

    /**
     *   回购收益率
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private BigDecimal yieldRate;

    /**
     *   部分成交选项
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String subDeal;

    /**
     *   报价有效时间
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String quoteTime;

    /**
     *   清算速度
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String settleSpeed;

    /**
     *   清算类型
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String clearType;

    /**
     *   最晚结算时间
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String setTime;

    /**
     *   结算方式
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String settleMode;

    /**
     *   首期结算日
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Date settleDate;

    /**
     *   到期结算日
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private Date dueSettleDate;



    /**
     *   利率
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private BigDecimal rate;

    /**
     *   到期利率
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private BigDecimal dueRate;

    /**
     *   挑票类型
     *
     * @mbg.generated 2017-10-10 15:46:51
     */
    private String selectType;

    /**
     *   票据包编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String packetSeq;

    /**
     *   批次状态
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String batchStatus;

    /**
     *   预交易行为
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String preTradeBhvr;

    /**
     *   首期实际记账日期
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private Date accountDate;

    /**
     *   利息计算标志
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String rateCalFlag;

    /**
     *   已变更信息
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String changedInfo;

    /**
     *   预变更信息
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String preChangeInfo;

    /**
     *   到期实付利息
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private BigDecimal duePayInterest;

    /**
     *   到期实付金额
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private BigDecimal duePayAmt;

    /**
     *   清算状态
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String clearStatus;

    /**
     *   到期清算状态
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String dueClearStatus;

    /**
     *   到期实际记账日
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private Date dueAccountDate;

    /**
     *   申请柜员号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String applyTellerNo;

    /**
     *   复核柜员编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String checkTellerNo;

    /**
     *   记账柜员编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String acctTellerNo;

    /**
     *   客户经理编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String custManagerNo;

    /**
     *   交易机构号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String transBranchNo;

    /**
     *   账务机构号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String acctBranchNo;

    /**
     *   部门
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String deptNo;

    /**
     *   团队编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String teamNo;

    /**
     *   经营机构归属
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String sellBranchNo;

    /**
     *   人工审批标志
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String manualAuditFlag;

    /**
     *   是否系统内
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String isInner;

    /**
     *   是否再贴现
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String isRediscount;

    /**
     *   利息计算标志
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String calInterestFlag;

    /**
     *   是否同一授权行 系统内交易 区分是否同一授权行
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String isSameAuthBranch;

    /**
     *   是否记账标志
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String acctFlag;

    /**
     *   到期记账标志
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String dueAcctFlag;

    /**
     *   是否预审批
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String preAuditFlag;

    /**
     *   审批单号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String auditNo;

    /**
     *   业务批次编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String batchNo;

    /**
     *   产品编号
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String productNo;

    /**
     *   买入方交易员名称
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String buyTraderName;

    /**
     *   客户经理名称
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String custManagerName;

    /**
     *   卖出方交易员名称
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String saleTraderName;

    /**
     *   卖出批次ID 仅质押式回购卖出按包挑票时输入买断式回购买入的批次ID
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private Long saleBatchId;

    /**
     *   包锁标志 仅质押式回购卖出按包挑票时锁定
     *
     * @mbg.generated 2017-10-26 16:38:17
     */
    private String packetLock;

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
		this.memberId = memberId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
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
		this.remitter = remitter;
	}

	public String getDrawee() {
		return drawee;
	}

	public void setDrawee(String drawee) {
		this.drawee = drawee;
	}

	public String getAcceptorBranchCode() {
		return acceptorBranchCode;
	}

	public void setAcceptorBranchCode(String acceptorBranchCode) {
		this.acceptorBranchCode = acceptorBranchCode;
	}

	public String getAcptCfmBranchCode() {
		return acptCfmBranchCode;
	}

	public void setAcptCfmBranchCode(String acptCfmBranchCode) {
		this.acptCfmBranchCode = acptCfmBranchCode;
	}

	public String getAcptGuarntrBranchCode() {
		return acptGuarntrBranchCode;
	}

	public void setAcptGuarntrBranchCode(String acptGuarntrBranchCode) {
		this.acptGuarntrBranchCode = acptGuarntrBranchCode;
	}

	public String getDiscBranchCode() {
		return discBranchCode;
	}

	public void setDiscBranchCode(String discBranchCode) {
		this.discBranchCode = discBranchCode;
	}

	public String getDiscGuarntrBranchCode() {
		return discGuarntrBranchCode;
	}

	public void setDiscGuarntrBranchCode(String discGuarntrBranchCode) {
		this.discGuarntrBranchCode = discGuarntrBranchCode;
	}

	public String getTrustBranchCode() {
		return trustBranchCode;
	}

	public void setTrustBranchCode(String trustBranchCode) {
		this.trustBranchCode = trustBranchCode;
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
		this.scrRelationFlag = scrRelationFlag;
	}

	public String getPreRelationFlag() {
		return preRelationFlag;
	}

	public void setPreRelationFlag(String preRelationFlag) {
		this.preRelationFlag = preRelationFlag;
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
		this.freeznFlag = freeznFlag;
	}

	public String getGathType() {
		return gathType;
	}

	public void setGathType(String gathType) {
		this.gathType = gathType;
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

	public Long getBatch_Id() {
		return batch_Id;
	}

	public void setBatch_Id(Long batch_Id) {
		this.batch_Id = batch_Id;
	}

	public String getBusiFlowNo() {
		return busiFlowNo;
	}

	public void setBusiFlowNo(String busiFlowNo) {
		this.busiFlowNo = busiFlowNo;
	}

	public String getQuoteNo() {
		return quoteNo;
	}

	public void setQuoteNo(String quoteNo) {
		this.quoteNo = quoteNo;
	}

	public String getDealNo() {
		return dealNo;
	}

	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
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
		this.dealStatus = dealStatus;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getSaleBranchCode() {
		return saleBranchCode;
	}

	public void setSaleBranchCode(String saleBranchCode) {
		this.saleBranchCode = saleBranchCode;
	}

	public String getSaleBranchName() {
		return saleBranchName;
	}

	public void setSaleBranchName(String saleBranchName) {
		this.saleBranchName = saleBranchName;
	}

	public String getSaleTraderNo() {
		return saleTraderNo;
	}

	public void setSaleTraderNo(String saleTraderNo) {
		this.saleTraderNo = saleTraderNo;
	}

	public String getSaleProductNo() {
		return saleProductNo;
	}

	public void setSaleProductNo(String saleProductNo) {
		this.saleProductNo = saleProductNo;
	}

	public String getBuyBranchCode() {
		return buyBranchCode;
	}

	public void setBuyBranchCode(String buyBranchCode) {
		this.buyBranchCode = buyBranchCode;
	}

	public String getBuyBranchName() {
		return buyBranchName;
	}

	public void setBuyBranchName(String buyBranchName) {
		this.buyBranchName = buyBranchName;
	}

	public String getBuyTraderNo() {
		return buyTraderNo;
	}

	public void setBuyTraderNo(String buyTraderNo) {
		this.buyTraderNo = buyTraderNo;
	}

	public String getBuyProductNo() {
		return buyProductNo;
	}

	public void setBuyProductNo(String buyProductNo) {
		this.buyProductNo = buyProductNo;
	}

	public String getBillClass() {
		return billClass;
	}

	public void setBillClass(String billClass) {
		this.billClass = billClass;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
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
		this.subDeal = subDeal;
	}

	public String getQuoteTime() {
		return quoteTime;
	}

	public void setQuoteTime(String quoteTime) {
		this.quoteTime = quoteTime;
	}

	public String getSettleSpeed() {
		return settleSpeed;
	}

	public void setSettleSpeed(String settleSpeed) {
		this.settleSpeed = settleSpeed;
	}

	public String getClearType() {
		return clearType;
	}

	public void setClearType(String clearType) {
		this.clearType = clearType;
	}

	public String getSetTime() {
		return setTime;
	}

	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}

	public String getSettleMode() {
		return settleMode;
	}

	public void setSettleMode(String settleMode) {
		this.settleMode = settleMode;
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
		this.selectType = selectType;
	}

	public String getPacketSeq() {
		return packetSeq;
	}

	public void setPacketSeq(String packetSeq) {
		this.packetSeq = packetSeq;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getPreTradeBhvr() {
		return preTradeBhvr;
	}

	public void setPreTradeBhvr(String preTradeBhvr) {
		this.preTradeBhvr = preTradeBhvr;
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
		this.rateCalFlag = rateCalFlag;
	}

	public String getChangedInfo() {
		return changedInfo;
	}

	public void setChangedInfo(String changedInfo) {
		this.changedInfo = changedInfo;
	}

	public String getPreChangeInfo() {
		return preChangeInfo;
	}

	public void setPreChangeInfo(String preChangeInfo) {
		this.preChangeInfo = preChangeInfo;
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
		this.clearStatus = clearStatus;
	}

	public String getDueClearStatus() {
		return dueClearStatus;
	}

	public void setDueClearStatus(String dueClearStatus) {
		this.dueClearStatus = dueClearStatus;
	}

	public Date getDueAccountDate() {
		return dueAccountDate;
	}

	public void setDueAccountDate(Date dueAccountDate) {
		this.dueAccountDate = dueAccountDate;
	}

	public String getApplyTellerNo() {
		return applyTellerNo;
	}

	public void setApplyTellerNo(String applyTellerNo) {
		this.applyTellerNo = applyTellerNo;
	}

	public String getCheckTellerNo() {
		return checkTellerNo;
	}

	public void setCheckTellerNo(String checkTellerNo) {
		this.checkTellerNo = checkTellerNo;
	}

	public String getAcctTellerNo() {
		return acctTellerNo;
	}

	public void setAcctTellerNo(String acctTellerNo) {
		this.acctTellerNo = acctTellerNo;
	}

	public String getCustManagerNo() {
		return custManagerNo;
	}

	public void setCustManagerNo(String custManagerNo) {
		this.custManagerNo = custManagerNo;
	}

	public String getTransBranchNo() {
		return transBranchNo;
	}

	public void setTransBranchNo(String transBranchNo) {
		this.transBranchNo = transBranchNo;
	}

	public String getAcctBranchNo() {
		return acctBranchNo;
	}

	public void setAcctBranchNo(String acctBranchNo) {
		this.acctBranchNo = acctBranchNo;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(String teamNo) {
		this.teamNo = teamNo;
	}

	public String getSellBranchNo() {
		return sellBranchNo;
	}

	public void setSellBranchNo(String sellBranchNo) {
		this.sellBranchNo = sellBranchNo;
	}

	public String getManualAuditFlag() {
		return manualAuditFlag;
	}

	public void setManualAuditFlag(String manualAuditFlag) {
		this.manualAuditFlag = manualAuditFlag;
	}

	public String getIsInner() {
		return isInner;
	}

	public void setIsInner(String isInner) {
		this.isInner = isInner;
	}

	public String getIsRediscount() {
		return isRediscount;
	}

	public void setIsRediscount(String isRediscount) {
		this.isRediscount = isRediscount;
	}

	public String getCalInterestFlag() {
		return calInterestFlag;
	}

	public void setCalInterestFlag(String calInterestFlag) {
		this.calInterestFlag = calInterestFlag;
	}

	public String getIsSameAuthBranch() {
		return isSameAuthBranch;
	}

	public void setIsSameAuthBranch(String isSameAuthBranch) {
		this.isSameAuthBranch = isSameAuthBranch;
	}

	public String getAcctFlag() {
		return acctFlag;
	}

	public void setAcctFlag(String acctFlag) {
		this.acctFlag = acctFlag;
	}

	public String getDueAcctFlag() {
		return dueAcctFlag;
	}

	public void setDueAcctFlag(String dueAcctFlag) {
		this.dueAcctFlag = dueAcctFlag;
	}

	public String getPreAuditFlag() {
		return preAuditFlag;
	}

	public void setPreAuditFlag(String preAuditFlag) {
		this.preAuditFlag = preAuditFlag;
	}

	public String getAuditNo() {
		return auditNo;
	}

	public void setAuditNo(String auditNo) {
		this.auditNo = auditNo;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getBuyTraderName() {
		return buyTraderName;
	}

	public void setBuyTraderName(String buyTraderName) {
		this.buyTraderName = buyTraderName;
	}

	public String getCustManagerName() {
		return custManagerName;
	}

	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}

	public String getSaleTraderName() {
		return saleTraderName;
	}

	public void setSaleTraderName(String saleTraderName) {
		this.saleTraderName = saleTraderName;
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
		this.packetLock = packetLock;
	}
    
    
}
