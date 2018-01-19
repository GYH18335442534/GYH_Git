package com.guo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RebuyBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RebuyBatchExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoIsNull() {
            addCriterion("BUSI_FLOW_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoIsNotNull() {
            addCriterion("BUSI_FLOW_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoEqualTo(String value) {
            addCriterion("BUSI_FLOW_NO =", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotEqualTo(String value) {
            addCriterion("BUSI_FLOW_NO <>", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoGreaterThan(String value) {
            addCriterion("BUSI_FLOW_NO >", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_FLOW_NO >=", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoLessThan(String value) {
            addCriterion("BUSI_FLOW_NO <", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoLessThanOrEqualTo(String value) {
            addCriterion("BUSI_FLOW_NO <=", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoLike(String value) {
            addCriterion("BUSI_FLOW_NO like", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotLike(String value) {
            addCriterion("BUSI_FLOW_NO not like", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoIn(List<String> values) {
            addCriterion("BUSI_FLOW_NO in", values, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotIn(List<String> values) {
            addCriterion("BUSI_FLOW_NO not in", values, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoBetween(String value1, String value2) {
            addCriterion("BUSI_FLOW_NO between", value1, value2, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotBetween(String value1, String value2) {
            addCriterion("BUSI_FLOW_NO not between", value1, value2, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoIsNull() {
            addCriterion("QUOTE_NO is null");
            return (Criteria) this;
        }

        public Criteria andQuoteNoIsNotNull() {
            addCriterion("QUOTE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteNoEqualTo(String value) {
            addCriterion("QUOTE_NO =", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoNotEqualTo(String value) {
            addCriterion("QUOTE_NO <>", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoGreaterThan(String value) {
            addCriterion("QUOTE_NO >", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_NO >=", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoLessThan(String value) {
            addCriterion("QUOTE_NO <", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoLessThanOrEqualTo(String value) {
            addCriterion("QUOTE_NO <=", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoLike(String value) {
            addCriterion("QUOTE_NO like", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoNotLike(String value) {
            addCriterion("QUOTE_NO not like", value, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoIn(List<String> values) {
            addCriterion("QUOTE_NO in", values, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoNotIn(List<String> values) {
            addCriterion("QUOTE_NO not in", values, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoBetween(String value1, String value2) {
            addCriterion("QUOTE_NO between", value1, value2, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andQuoteNoNotBetween(String value1, String value2) {
            addCriterion("QUOTE_NO not between", value1, value2, "quoteNo");
            return (Criteria) this;
        }

        public Criteria andDealNoIsNull() {
            addCriterion("DEAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andDealNoIsNotNull() {
            addCriterion("DEAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDealNoEqualTo(String value) {
            addCriterion("DEAL_NO =", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoNotEqualTo(String value) {
            addCriterion("DEAL_NO <>", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoGreaterThan(String value) {
            addCriterion("DEAL_NO >", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_NO >=", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoLessThan(String value) {
            addCriterion("DEAL_NO <", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoLessThanOrEqualTo(String value) {
            addCriterion("DEAL_NO <=", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoLike(String value) {
            addCriterion("DEAL_NO like", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoNotLike(String value) {
            addCriterion("DEAL_NO not like", value, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoIn(List<String> values) {
            addCriterion("DEAL_NO in", values, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoNotIn(List<String> values) {
            addCriterion("DEAL_NO not in", values, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoBetween(String value1, String value2) {
            addCriterion("DEAL_NO between", value1, value2, "dealNo");
            return (Criteria) this;
        }

        public Criteria andDealNoNotBetween(String value1, String value2) {
            addCriterion("DEAL_NO not between", value1, value2, "dealNo");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("DEAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("DEAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_DATE =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_DATE <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEAL_DATE >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_DATE >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Date value) {
            addCriterionForJDBCDate("DEAL_DATE <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEAL_DATE <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_DATE in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEAL_DATE not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_DATE between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEAL_DATE not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("DEAL_TIME =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("DEAL_TIME <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("DEAL_TIME >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("DEAL_TIME <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("DEAL_TIME in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("DEAL_TIME not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNull() {
            addCriterion("DEAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDealStatusIsNotNull() {
            addCriterion("DEAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDealStatusEqualTo(String value) {
            addCriterion("DEAL_STATUS =", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotEqualTo(String value) {
            addCriterion("DEAL_STATUS <>", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThan(String value) {
            addCriterion("DEAL_STATUS >", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_STATUS >=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThan(String value) {
            addCriterion("DEAL_STATUS <", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLessThanOrEqualTo(String value) {
            addCriterion("DEAL_STATUS <=", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusLike(String value) {
            addCriterion("DEAL_STATUS like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotLike(String value) {
            addCriterion("DEAL_STATUS not like", value, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusIn(List<String> values) {
            addCriterion("DEAL_STATUS in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotIn(List<String> values) {
            addCriterion("DEAL_STATUS not in", values, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusBetween(String value1, String value2) {
            addCriterion("DEAL_STATUS between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andDealStatusNotBetween(String value1, String value2) {
            addCriterion("DEAL_STATUS not between", value1, value2, "dealStatus");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNull() {
            addCriterion("BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("BUSI_TYPE =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("BUSI_TYPE <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("BUSI_TYPE >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("BUSI_TYPE <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("BUSI_TYPE like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("BUSI_TYPE not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("BUSI_TYPE in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("BUSI_TYPE not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeIsNull() {
            addCriterion("SALE_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeIsNotNull() {
            addCriterion("SALE_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeEqualTo(String value) {
            addCriterion("SALE_BRANCH_CODE =", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeNotEqualTo(String value) {
            addCriterion("SALE_BRANCH_CODE <>", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeGreaterThan(String value) {
            addCriterion("SALE_BRANCH_CODE >", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_BRANCH_CODE >=", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeLessThan(String value) {
            addCriterion("SALE_BRANCH_CODE <", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("SALE_BRANCH_CODE <=", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeLike(String value) {
            addCriterion("SALE_BRANCH_CODE like", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeNotLike(String value) {
            addCriterion("SALE_BRANCH_CODE not like", value, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeIn(List<String> values) {
            addCriterion("SALE_BRANCH_CODE in", values, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeNotIn(List<String> values) {
            addCriterion("SALE_BRANCH_CODE not in", values, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeBetween(String value1, String value2) {
            addCriterion("SALE_BRANCH_CODE between", value1, value2, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchCodeNotBetween(String value1, String value2) {
            addCriterion("SALE_BRANCH_CODE not between", value1, value2, "saleBranchCode");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameIsNull() {
            addCriterion("SALE_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameIsNotNull() {
            addCriterion("SALE_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameEqualTo(String value) {
            addCriterion("SALE_BRANCH_NAME =", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameNotEqualTo(String value) {
            addCriterion("SALE_BRANCH_NAME <>", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameGreaterThan(String value) {
            addCriterion("SALE_BRANCH_NAME >", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_BRANCH_NAME >=", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameLessThan(String value) {
            addCriterion("SALE_BRANCH_NAME <", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameLessThanOrEqualTo(String value) {
            addCriterion("SALE_BRANCH_NAME <=", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameLike(String value) {
            addCriterion("SALE_BRANCH_NAME like", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameNotLike(String value) {
            addCriterion("SALE_BRANCH_NAME not like", value, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameIn(List<String> values) {
            addCriterion("SALE_BRANCH_NAME in", values, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameNotIn(List<String> values) {
            addCriterion("SALE_BRANCH_NAME not in", values, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameBetween(String value1, String value2) {
            addCriterion("SALE_BRANCH_NAME between", value1, value2, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleBranchNameNotBetween(String value1, String value2) {
            addCriterion("SALE_BRANCH_NAME not between", value1, value2, "saleBranchName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoIsNull() {
            addCriterion("SALE_TRADER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoIsNotNull() {
            addCriterion("SALE_TRADER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoEqualTo(String value) {
            addCriterion("SALE_TRADER_NO =", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoNotEqualTo(String value) {
            addCriterion("SALE_TRADER_NO <>", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoGreaterThan(String value) {
            addCriterion("SALE_TRADER_NO >", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TRADER_NO >=", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoLessThan(String value) {
            addCriterion("SALE_TRADER_NO <", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_TRADER_NO <=", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoLike(String value) {
            addCriterion("SALE_TRADER_NO like", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoNotLike(String value) {
            addCriterion("SALE_TRADER_NO not like", value, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoIn(List<String> values) {
            addCriterion("SALE_TRADER_NO in", values, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoNotIn(List<String> values) {
            addCriterion("SALE_TRADER_NO not in", values, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoBetween(String value1, String value2) {
            addCriterion("SALE_TRADER_NO between", value1, value2, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNoNotBetween(String value1, String value2) {
            addCriterion("SALE_TRADER_NO not between", value1, value2, "saleTraderNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoIsNull() {
            addCriterion("SALE_PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoIsNotNull() {
            addCriterion("SALE_PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoEqualTo(String value) {
            addCriterion("SALE_PRODUCT_NO =", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoNotEqualTo(String value) {
            addCriterion("SALE_PRODUCT_NO <>", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoGreaterThan(String value) {
            addCriterion("SALE_PRODUCT_NO >", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PRODUCT_NO >=", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoLessThan(String value) {
            addCriterion("SALE_PRODUCT_NO <", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_PRODUCT_NO <=", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoLike(String value) {
            addCriterion("SALE_PRODUCT_NO like", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoNotLike(String value) {
            addCriterion("SALE_PRODUCT_NO not like", value, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoIn(List<String> values) {
            addCriterion("SALE_PRODUCT_NO in", values, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoNotIn(List<String> values) {
            addCriterion("SALE_PRODUCT_NO not in", values, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoBetween(String value1, String value2) {
            addCriterion("SALE_PRODUCT_NO between", value1, value2, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andSaleProductNoNotBetween(String value1, String value2) {
            addCriterion("SALE_PRODUCT_NO not between", value1, value2, "saleProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeIsNull() {
            addCriterion("BUY_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeIsNotNull() {
            addCriterion("BUY_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeEqualTo(String value) {
            addCriterion("BUY_BRANCH_CODE =", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeNotEqualTo(String value) {
            addCriterion("BUY_BRANCH_CODE <>", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeGreaterThan(String value) {
            addCriterion("BUY_BRANCH_CODE >", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_BRANCH_CODE >=", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeLessThan(String value) {
            addCriterion("BUY_BRANCH_CODE <", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("BUY_BRANCH_CODE <=", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeLike(String value) {
            addCriterion("BUY_BRANCH_CODE like", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeNotLike(String value) {
            addCriterion("BUY_BRANCH_CODE not like", value, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeIn(List<String> values) {
            addCriterion("BUY_BRANCH_CODE in", values, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeNotIn(List<String> values) {
            addCriterion("BUY_BRANCH_CODE not in", values, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeBetween(String value1, String value2) {
            addCriterion("BUY_BRANCH_CODE between", value1, value2, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchCodeNotBetween(String value1, String value2) {
            addCriterion("BUY_BRANCH_CODE not between", value1, value2, "buyBranchCode");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameIsNull() {
            addCriterion("BUY_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameIsNotNull() {
            addCriterion("BUY_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameEqualTo(String value) {
            addCriterion("BUY_BRANCH_NAME =", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameNotEqualTo(String value) {
            addCriterion("BUY_BRANCH_NAME <>", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameGreaterThan(String value) {
            addCriterion("BUY_BRANCH_NAME >", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_BRANCH_NAME >=", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameLessThan(String value) {
            addCriterion("BUY_BRANCH_NAME <", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BUY_BRANCH_NAME <=", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameLike(String value) {
            addCriterion("BUY_BRANCH_NAME like", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameNotLike(String value) {
            addCriterion("BUY_BRANCH_NAME not like", value, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameIn(List<String> values) {
            addCriterion("BUY_BRANCH_NAME in", values, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameNotIn(List<String> values) {
            addCriterion("BUY_BRANCH_NAME not in", values, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameBetween(String value1, String value2) {
            addCriterion("BUY_BRANCH_NAME between", value1, value2, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyBranchNameNotBetween(String value1, String value2) {
            addCriterion("BUY_BRANCH_NAME not between", value1, value2, "buyBranchName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoIsNull() {
            addCriterion("BUY_TRADER_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoIsNotNull() {
            addCriterion("BUY_TRADER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoEqualTo(String value) {
            addCriterion("BUY_TRADER_NO =", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoNotEqualTo(String value) {
            addCriterion("BUY_TRADER_NO <>", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoGreaterThan(String value) {
            addCriterion("BUY_TRADER_NO >", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_TRADER_NO >=", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoLessThan(String value) {
            addCriterion("BUY_TRADER_NO <", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoLessThanOrEqualTo(String value) {
            addCriterion("BUY_TRADER_NO <=", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoLike(String value) {
            addCriterion("BUY_TRADER_NO like", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoNotLike(String value) {
            addCriterion("BUY_TRADER_NO not like", value, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoIn(List<String> values) {
            addCriterion("BUY_TRADER_NO in", values, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoNotIn(List<String> values) {
            addCriterion("BUY_TRADER_NO not in", values, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoBetween(String value1, String value2) {
            addCriterion("BUY_TRADER_NO between", value1, value2, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNoNotBetween(String value1, String value2) {
            addCriterion("BUY_TRADER_NO not between", value1, value2, "buyTraderNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoIsNull() {
            addCriterion("BUY_PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoIsNotNull() {
            addCriterion("BUY_PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoEqualTo(String value) {
            addCriterion("BUY_PRODUCT_NO =", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoNotEqualTo(String value) {
            addCriterion("BUY_PRODUCT_NO <>", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoGreaterThan(String value) {
            addCriterion("BUY_PRODUCT_NO >", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_PRODUCT_NO >=", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoLessThan(String value) {
            addCriterion("BUY_PRODUCT_NO <", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoLessThanOrEqualTo(String value) {
            addCriterion("BUY_PRODUCT_NO <=", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoLike(String value) {
            addCriterion("BUY_PRODUCT_NO like", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoNotLike(String value) {
            addCriterion("BUY_PRODUCT_NO not like", value, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoIn(List<String> values) {
            addCriterion("BUY_PRODUCT_NO in", values, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoNotIn(List<String> values) {
            addCriterion("BUY_PRODUCT_NO not in", values, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoBetween(String value1, String value2) {
            addCriterion("BUY_PRODUCT_NO between", value1, value2, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBuyProductNoNotBetween(String value1, String value2) {
            addCriterion("BUY_PRODUCT_NO not between", value1, value2, "buyProductNo");
            return (Criteria) this;
        }

        public Criteria andBillClassIsNull() {
            addCriterion("BILL_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andBillClassIsNotNull() {
            addCriterion("BILL_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBillClassEqualTo(String value) {
            addCriterion("BILL_CLASS =", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassNotEqualTo(String value) {
            addCriterion("BILL_CLASS <>", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassGreaterThan(String value) {
            addCriterion("BILL_CLASS >", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_CLASS >=", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassLessThan(String value) {
            addCriterion("BILL_CLASS <", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassLessThanOrEqualTo(String value) {
            addCriterion("BILL_CLASS <=", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassLike(String value) {
            addCriterion("BILL_CLASS like", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassNotLike(String value) {
            addCriterion("BILL_CLASS not like", value, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassIn(List<String> values) {
            addCriterion("BILL_CLASS in", values, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassNotIn(List<String> values) {
            addCriterion("BILL_CLASS not in", values, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassBetween(String value1, String value2) {
            addCriterion("BILL_CLASS between", value1, value2, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillClassNotBetween(String value1, String value2) {
            addCriterion("BILL_CLASS not between", value1, value2, "billClass");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("BILL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("BILL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("BILL_TYPE =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("BILL_TYPE <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("BILL_TYPE >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_TYPE >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("BILL_TYPE <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("BILL_TYPE <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("BILL_TYPE like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("BILL_TYPE not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("BILL_TYPE in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("BILL_TYPE not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("BILL_TYPE between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("BILL_TYPE not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNull() {
            addCriterion("SUM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSumNumIsNotNull() {
            addCriterion("SUM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumEqualTo(Long value) {
            addCriterion("SUM_NUM =", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotEqualTo(Long value) {
            addCriterion("SUM_NUM <>", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThan(Long value) {
            addCriterion("SUM_NUM >", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NUM >=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThan(Long value) {
            addCriterion("SUM_NUM <", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NUM <=", value, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumIn(List<Long> values) {
            addCriterion("SUM_NUM in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotIn(List<Long> values) {
            addCriterion("SUM_NUM not in", values, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumBetween(Long value1, Long value2) {
            addCriterion("SUM_NUM between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumNumNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NUM not between", value1, value2, "sumNum");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNull() {
            addCriterion("SUM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNotNull() {
            addCriterion("SUM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmtEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT =", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT <>", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThan(BigDecimal value) {
            addCriterion("SUM_AMT >", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT >=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThan(BigDecimal value) {
            addCriterion("SUM_AMT <", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT <=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtIn(List<BigDecimal> values) {
            addCriterion("SUM_AMT in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotIn(List<BigDecimal> values) {
            addCriterion("SUM_AMT not in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMT between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMT not between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtIsNull() {
            addCriterion("SUM_BUY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtIsNotNull() {
            addCriterion("SUM_BUY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtEqualTo(BigDecimal value) {
            addCriterion("SUM_BUY_AMT =", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtNotEqualTo(BigDecimal value) {
            addCriterion("SUM_BUY_AMT <>", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtGreaterThan(BigDecimal value) {
            addCriterion("SUM_BUY_AMT >", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_BUY_AMT >=", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtLessThan(BigDecimal value) {
            addCriterion("SUM_BUY_AMT <", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_BUY_AMT <=", value, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtIn(List<BigDecimal> values) {
            addCriterion("SUM_BUY_AMT in", values, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtNotIn(List<BigDecimal> values) {
            addCriterion("SUM_BUY_AMT not in", values, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_BUY_AMT between", value1, value2, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andSumBuyAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_BUY_AMT not between", value1, value2, "sumBuyAmt");
            return (Criteria) this;
        }

        public Criteria andTenorDaysIsNull() {
            addCriterion("TENOR_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andTenorDaysIsNotNull() {
            addCriterion("TENOR_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andTenorDaysEqualTo(Integer value) {
            addCriterion("TENOR_DAYS =", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysNotEqualTo(Integer value) {
            addCriterion("TENOR_DAYS <>", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysGreaterThan(Integer value) {
            addCriterion("TENOR_DAYS >", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("TENOR_DAYS >=", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysLessThan(Integer value) {
            addCriterion("TENOR_DAYS <", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysLessThanOrEqualTo(Integer value) {
            addCriterion("TENOR_DAYS <=", value, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysIn(List<Integer> values) {
            addCriterion("TENOR_DAYS in", values, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysNotIn(List<Integer> values) {
            addCriterion("TENOR_DAYS not in", values, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysBetween(Integer value1, Integer value2) {
            addCriterion("TENOR_DAYS between", value1, value2, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andTenorDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("TENOR_DAYS not between", value1, value2, "tenorDays");
            return (Criteria) this;
        }

        public Criteria andYieldRateIsNull() {
            addCriterion("YIELD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andYieldRateIsNotNull() {
            addCriterion("YIELD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldRateEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE =", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE <>", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateGreaterThan(BigDecimal value) {
            addCriterion("YIELD_RATE >", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE >=", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateLessThan(BigDecimal value) {
            addCriterion("YIELD_RATE <", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE <=", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateIn(List<BigDecimal> values) {
            addCriterion("YIELD_RATE in", values, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotIn(List<BigDecimal> values) {
            addCriterion("YIELD_RATE not in", values, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIELD_RATE between", value1, value2, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIELD_RATE not between", value1, value2, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andSubDealIsNull() {
            addCriterion("SUB_DEAL is null");
            return (Criteria) this;
        }

        public Criteria andSubDealIsNotNull() {
            addCriterion("SUB_DEAL is not null");
            return (Criteria) this;
        }

        public Criteria andSubDealEqualTo(String value) {
            addCriterion("SUB_DEAL =", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealNotEqualTo(String value) {
            addCriterion("SUB_DEAL <>", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealGreaterThan(String value) {
            addCriterion("SUB_DEAL >", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_DEAL >=", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealLessThan(String value) {
            addCriterion("SUB_DEAL <", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealLessThanOrEqualTo(String value) {
            addCriterion("SUB_DEAL <=", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealLike(String value) {
            addCriterion("SUB_DEAL like", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealNotLike(String value) {
            addCriterion("SUB_DEAL not like", value, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealIn(List<String> values) {
            addCriterion("SUB_DEAL in", values, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealNotIn(List<String> values) {
            addCriterion("SUB_DEAL not in", values, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealBetween(String value1, String value2) {
            addCriterion("SUB_DEAL between", value1, value2, "subDeal");
            return (Criteria) this;
        }

        public Criteria andSubDealNotBetween(String value1, String value2) {
            addCriterion("SUB_DEAL not between", value1, value2, "subDeal");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeIsNull() {
            addCriterion("QUOTE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeIsNotNull() {
            addCriterion("QUOTE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeEqualTo(String value) {
            addCriterion("QUOTE_TIME =", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeNotEqualTo(String value) {
            addCriterion("QUOTE_TIME <>", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeGreaterThan(String value) {
            addCriterion("QUOTE_TIME >", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_TIME >=", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeLessThan(String value) {
            addCriterion("QUOTE_TIME <", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeLessThanOrEqualTo(String value) {
            addCriterion("QUOTE_TIME <=", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeLike(String value) {
            addCriterion("QUOTE_TIME like", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeNotLike(String value) {
            addCriterion("QUOTE_TIME not like", value, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeIn(List<String> values) {
            addCriterion("QUOTE_TIME in", values, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeNotIn(List<String> values) {
            addCriterion("QUOTE_TIME not in", values, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeBetween(String value1, String value2) {
            addCriterion("QUOTE_TIME between", value1, value2, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andQuoteTimeNotBetween(String value1, String value2) {
            addCriterion("QUOTE_TIME not between", value1, value2, "quoteTime");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedIsNull() {
            addCriterion("SETTLE_SPEED is null");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedIsNotNull() {
            addCriterion("SETTLE_SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedEqualTo(String value) {
            addCriterion("SETTLE_SPEED =", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedNotEqualTo(String value) {
            addCriterion("SETTLE_SPEED <>", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedGreaterThan(String value) {
            addCriterion("SETTLE_SPEED >", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_SPEED >=", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedLessThan(String value) {
            addCriterion("SETTLE_SPEED <", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_SPEED <=", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedLike(String value) {
            addCriterion("SETTLE_SPEED like", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedNotLike(String value) {
            addCriterion("SETTLE_SPEED not like", value, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedIn(List<String> values) {
            addCriterion("SETTLE_SPEED in", values, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedNotIn(List<String> values) {
            addCriterion("SETTLE_SPEED not in", values, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedBetween(String value1, String value2) {
            addCriterion("SETTLE_SPEED between", value1, value2, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andSettleSpeedNotBetween(String value1, String value2) {
            addCriterion("SETTLE_SPEED not between", value1, value2, "settleSpeed");
            return (Criteria) this;
        }

        public Criteria andClearTypeIsNull() {
            addCriterion("CLEAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClearTypeIsNotNull() {
            addCriterion("CLEAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClearTypeEqualTo(String value) {
            addCriterion("CLEAR_TYPE =", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotEqualTo(String value) {
            addCriterion("CLEAR_TYPE <>", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeGreaterThan(String value) {
            addCriterion("CLEAR_TYPE >", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLEAR_TYPE >=", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeLessThan(String value) {
            addCriterion("CLEAR_TYPE <", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeLessThanOrEqualTo(String value) {
            addCriterion("CLEAR_TYPE <=", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeLike(String value) {
            addCriterion("CLEAR_TYPE like", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotLike(String value) {
            addCriterion("CLEAR_TYPE not like", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeIn(List<String> values) {
            addCriterion("CLEAR_TYPE in", values, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotIn(List<String> values) {
            addCriterion("CLEAR_TYPE not in", values, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeBetween(String value1, String value2) {
            addCriterion("CLEAR_TYPE between", value1, value2, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotBetween(String value1, String value2) {
            addCriterion("CLEAR_TYPE not between", value1, value2, "clearType");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("SET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("SET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(String value) {
            addCriterion("SET_TIME =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(String value) {
            addCriterion("SET_TIME <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(String value) {
            addCriterion("SET_TIME >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SET_TIME >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(String value) {
            addCriterion("SET_TIME <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(String value) {
            addCriterion("SET_TIME <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLike(String value) {
            addCriterion("SET_TIME like", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotLike(String value) {
            addCriterion("SET_TIME not like", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<String> values) {
            addCriterion("SET_TIME in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<String> values) {
            addCriterion("SET_TIME not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(String value1, String value2) {
            addCriterion("SET_TIME between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(String value1, String value2) {
            addCriterion("SET_TIME not between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNull() {
            addCriterion("SETTLE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNotNull() {
            addCriterion("SETTLE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleModeEqualTo(String value) {
            addCriterion("SETTLE_MODE =", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotEqualTo(String value) {
            addCriterion("SETTLE_MODE <>", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThan(String value) {
            addCriterion("SETTLE_MODE >", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_MODE >=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThan(String value) {
            addCriterion("SETTLE_MODE <", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_MODE <=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLike(String value) {
            addCriterion("SETTLE_MODE like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotLike(String value) {
            addCriterion("SETTLE_MODE not like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeIn(List<String> values) {
            addCriterion("SETTLE_MODE in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotIn(List<String> values) {
            addCriterion("SETTLE_MODE not in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeBetween(String value1, String value2) {
            addCriterion("SETTLE_MODE between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_MODE not between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNull() {
            addCriterion("SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SETTLE_DATE <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLE_DATE in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SETTLE_DATE not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLE_DATE between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SETTLE_DATE not between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateIsNull() {
            addCriterion("DUE_SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateIsNotNull() {
            addCriterion("DUE_SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE =", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE <>", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE >", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE >=", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE <", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE <=", value, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE in", values, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE not in", values, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE between", value1, value2, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andDueSettleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_SETTLE_DATE not between", value1, value2, "dueSettleDate");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNull() {
            addCriterion("SETTLE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIsNotNull() {
            addCriterion("SETTLE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmtEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT =", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT <>", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThan(BigDecimal value) {
            addCriterion("SETTLE_AMT >", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT >=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThan(BigDecimal value) {
            addCriterion("SETTLE_AMT <", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLE_AMT <=", value, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMT in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotIn(List<BigDecimal> values) {
            addCriterion("SETTLE_AMT not in", values, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMT between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andSettleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLE_AMT not between", value1, value2, "settleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtIsNull() {
            addCriterion("DUE_SETTLE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtIsNotNull() {
            addCriterion("DUE_SETTLE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtEqualTo(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT =", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtNotEqualTo(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT <>", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtGreaterThan(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT >", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT >=", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtLessThan(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT <", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_SETTLE_AMT <=", value, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtIn(List<BigDecimal> values) {
            addCriterion("DUE_SETTLE_AMT in", values, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtNotIn(List<BigDecimal> values) {
            addCriterion("DUE_SETTLE_AMT not in", values, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_SETTLE_AMT between", value1, value2, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andDueSettleAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_SETTLE_AMT not between", value1, value2, "dueSettleAmt");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("INTEREST =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("INTEREST <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("INTEREST >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEREST >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("INTEREST <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEREST <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("INTEREST in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("INTEREST not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEREST between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEREST not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andDueInterestIsNull() {
            addCriterion("DUE_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andDueInterestIsNotNull() {
            addCriterion("DUE_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andDueInterestEqualTo(BigDecimal value) {
            addCriterion("DUE_INTEREST =", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestNotEqualTo(BigDecimal value) {
            addCriterion("DUE_INTEREST <>", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestGreaterThan(BigDecimal value) {
            addCriterion("DUE_INTEREST >", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_INTEREST >=", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestLessThan(BigDecimal value) {
            addCriterion("DUE_INTEREST <", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_INTEREST <=", value, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestIn(List<BigDecimal> values) {
            addCriterion("DUE_INTEREST in", values, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestNotIn(List<BigDecimal> values) {
            addCriterion("DUE_INTEREST not in", values, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_INTEREST between", value1, value2, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andDueInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_INTEREST not between", value1, value2, "dueInterest");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andDueRateIsNull() {
            addCriterion("DUE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDueRateIsNotNull() {
            addCriterion("DUE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueRateEqualTo(BigDecimal value) {
            addCriterion("DUE_RATE =", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateNotEqualTo(BigDecimal value) {
            addCriterion("DUE_RATE <>", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateGreaterThan(BigDecimal value) {
            addCriterion("DUE_RATE >", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_RATE >=", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateLessThan(BigDecimal value) {
            addCriterion("DUE_RATE <", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_RATE <=", value, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateIn(List<BigDecimal> values) {
            addCriterion("DUE_RATE in", values, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateNotIn(List<BigDecimal> values) {
            addCriterion("DUE_RATE not in", values, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_RATE between", value1, value2, "dueRate");
            return (Criteria) this;
        }

        public Criteria andDueRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_RATE not between", value1, value2, "dueRate");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNull() {
            addCriterion("SELECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIsNotNull() {
            addCriterion("SELECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTypeEqualTo(String value) {
            addCriterion("SELECT_TYPE =", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotEqualTo(String value) {
            addCriterion("SELECT_TYPE <>", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThan(String value) {
            addCriterion("SELECT_TYPE >", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SELECT_TYPE >=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThan(String value) {
            addCriterion("SELECT_TYPE <", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLessThanOrEqualTo(String value) {
            addCriterion("SELECT_TYPE <=", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeLike(String value) {
            addCriterion("SELECT_TYPE like", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotLike(String value) {
            addCriterion("SELECT_TYPE not like", value, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeIn(List<String> values) {
            addCriterion("SELECT_TYPE in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotIn(List<String> values) {
            addCriterion("SELECT_TYPE not in", values, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeBetween(String value1, String value2) {
            addCriterion("SELECT_TYPE between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andSelectTypeNotBetween(String value1, String value2) {
            addCriterion("SELECT_TYPE not between", value1, value2, "selectType");
            return (Criteria) this;
        }

        public Criteria andPacketSeqIsNull() {
            addCriterion("PACKET_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPacketSeqIsNotNull() {
            addCriterion("PACKET_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPacketSeqEqualTo(String value) {
            addCriterion("PACKET_SEQ =", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqNotEqualTo(String value) {
            addCriterion("PACKET_SEQ <>", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqGreaterThan(String value) {
            addCriterion("PACKET_SEQ >", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PACKET_SEQ >=", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqLessThan(String value) {
            addCriterion("PACKET_SEQ <", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqLessThanOrEqualTo(String value) {
            addCriterion("PACKET_SEQ <=", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqLike(String value) {
            addCriterion("PACKET_SEQ like", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqNotLike(String value) {
            addCriterion("PACKET_SEQ not like", value, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqIn(List<String> values) {
            addCriterion("PACKET_SEQ in", values, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqNotIn(List<String> values) {
            addCriterion("PACKET_SEQ not in", values, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqBetween(String value1, String value2) {
            addCriterion("PACKET_SEQ between", value1, value2, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andPacketSeqNotBetween(String value1, String value2) {
            addCriterion("PACKET_SEQ not between", value1, value2, "packetSeq");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIsNull() {
            addCriterion("BATCH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIsNotNull() {
            addCriterion("BATCH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBatchStatusEqualTo(String value) {
            addCriterion("BATCH_STATUS =", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotEqualTo(String value) {
            addCriterion("BATCH_STATUS <>", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusGreaterThan(String value) {
            addCriterion("BATCH_STATUS >", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_STATUS >=", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLessThan(String value) {
            addCriterion("BATCH_STATUS <", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLessThanOrEqualTo(String value) {
            addCriterion("BATCH_STATUS <=", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusLike(String value) {
            addCriterion("BATCH_STATUS like", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotLike(String value) {
            addCriterion("BATCH_STATUS not like", value, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusIn(List<String> values) {
            addCriterion("BATCH_STATUS in", values, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotIn(List<String> values) {
            addCriterion("BATCH_STATUS not in", values, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusBetween(String value1, String value2) {
            addCriterion("BATCH_STATUS between", value1, value2, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andBatchStatusNotBetween(String value1, String value2) {
            addCriterion("BATCH_STATUS not between", value1, value2, "batchStatus");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrIsNull() {
            addCriterion("PRE_TRADE_BHVR is null");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrIsNotNull() {
            addCriterion("PRE_TRADE_BHVR is not null");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrEqualTo(String value) {
            addCriterion("PRE_TRADE_BHVR =", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrNotEqualTo(String value) {
            addCriterion("PRE_TRADE_BHVR <>", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrGreaterThan(String value) {
            addCriterion("PRE_TRADE_BHVR >", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_TRADE_BHVR >=", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrLessThan(String value) {
            addCriterion("PRE_TRADE_BHVR <", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrLessThanOrEqualTo(String value) {
            addCriterion("PRE_TRADE_BHVR <=", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrLike(String value) {
            addCriterion("PRE_TRADE_BHVR like", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrNotLike(String value) {
            addCriterion("PRE_TRADE_BHVR not like", value, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrIn(List<String> values) {
            addCriterion("PRE_TRADE_BHVR in", values, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrNotIn(List<String> values) {
            addCriterion("PRE_TRADE_BHVR not in", values, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrBetween(String value1, String value2) {
            addCriterion("PRE_TRADE_BHVR between", value1, value2, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andPreTradeBhvrNotBetween(String value1, String value2) {
            addCriterion("PRE_TRADE_BHVR not between", value1, value2, "preTradeBhvr");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNull() {
            addCriterion("ACCOUNT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("ACCOUNT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNT_DATE in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNT_DATE not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNT_DATE between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNT_DATE not between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagIsNull() {
            addCriterion("RATE_CAL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagIsNotNull() {
            addCriterion("RATE_CAL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagEqualTo(String value) {
            addCriterion("RATE_CAL_FLAG =", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagNotEqualTo(String value) {
            addCriterion("RATE_CAL_FLAG <>", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagGreaterThan(String value) {
            addCriterion("RATE_CAL_FLAG >", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_CAL_FLAG >=", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagLessThan(String value) {
            addCriterion("RATE_CAL_FLAG <", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagLessThanOrEqualTo(String value) {
            addCriterion("RATE_CAL_FLAG <=", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagLike(String value) {
            addCriterion("RATE_CAL_FLAG like", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagNotLike(String value) {
            addCriterion("RATE_CAL_FLAG not like", value, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagIn(List<String> values) {
            addCriterion("RATE_CAL_FLAG in", values, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagNotIn(List<String> values) {
            addCriterion("RATE_CAL_FLAG not in", values, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagBetween(String value1, String value2) {
            addCriterion("RATE_CAL_FLAG between", value1, value2, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andRateCalFlagNotBetween(String value1, String value2) {
            addCriterion("RATE_CAL_FLAG not between", value1, value2, "rateCalFlag");
            return (Criteria) this;
        }

        public Criteria andChangedInfoIsNull() {
            addCriterion("CHANGED_INFO is null");
            return (Criteria) this;
        }

        public Criteria andChangedInfoIsNotNull() {
            addCriterion("CHANGED_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andChangedInfoEqualTo(String value) {
            addCriterion("CHANGED_INFO =", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoNotEqualTo(String value) {
            addCriterion("CHANGED_INFO <>", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoGreaterThan(String value) {
            addCriterion("CHANGED_INFO >", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGED_INFO >=", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoLessThan(String value) {
            addCriterion("CHANGED_INFO <", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoLessThanOrEqualTo(String value) {
            addCriterion("CHANGED_INFO <=", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoLike(String value) {
            addCriterion("CHANGED_INFO like", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoNotLike(String value) {
            addCriterion("CHANGED_INFO not like", value, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoIn(List<String> values) {
            addCriterion("CHANGED_INFO in", values, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoNotIn(List<String> values) {
            addCriterion("CHANGED_INFO not in", values, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoBetween(String value1, String value2) {
            addCriterion("CHANGED_INFO between", value1, value2, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andChangedInfoNotBetween(String value1, String value2) {
            addCriterion("CHANGED_INFO not between", value1, value2, "changedInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoIsNull() {
            addCriterion("PRE_CHANGE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoIsNotNull() {
            addCriterion("PRE_CHANGE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoEqualTo(String value) {
            addCriterion("PRE_CHANGE_INFO =", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoNotEqualTo(String value) {
            addCriterion("PRE_CHANGE_INFO <>", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoGreaterThan(String value) {
            addCriterion("PRE_CHANGE_INFO >", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_CHANGE_INFO >=", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoLessThan(String value) {
            addCriterion("PRE_CHANGE_INFO <", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoLessThanOrEqualTo(String value) {
            addCriterion("PRE_CHANGE_INFO <=", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoLike(String value) {
            addCriterion("PRE_CHANGE_INFO like", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoNotLike(String value) {
            addCriterion("PRE_CHANGE_INFO not like", value, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoIn(List<String> values) {
            addCriterion("PRE_CHANGE_INFO in", values, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoNotIn(List<String> values) {
            addCriterion("PRE_CHANGE_INFO not in", values, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoBetween(String value1, String value2) {
            addCriterion("PRE_CHANGE_INFO between", value1, value2, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPreChangeInfoNotBetween(String value1, String value2) {
            addCriterion("PRE_CHANGE_INFO not between", value1, value2, "preChangeInfo");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestIsNull() {
            addCriterion("DUE_PAY_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestIsNotNull() {
            addCriterion("DUE_PAY_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST =", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestNotEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST <>", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestGreaterThan(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST >", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST >=", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestLessThan(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST <", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_INTEREST <=", value, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestIn(List<BigDecimal> values) {
            addCriterion("DUE_PAY_INTEREST in", values, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestNotIn(List<BigDecimal> values) {
            addCriterion("DUE_PAY_INTEREST not in", values, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_PAY_INTEREST between", value1, value2, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_PAY_INTEREST not between", value1, value2, "duePayInterest");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtIsNull() {
            addCriterion("DUE_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtIsNotNull() {
            addCriterion("DUE_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_AMT =", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtNotEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_AMT <>", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtGreaterThan(BigDecimal value) {
            addCriterion("DUE_PAY_AMT >", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_AMT >=", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtLessThan(BigDecimal value) {
            addCriterion("DUE_PAY_AMT <", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUE_PAY_AMT <=", value, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtIn(List<BigDecimal> values) {
            addCriterion("DUE_PAY_AMT in", values, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtNotIn(List<BigDecimal> values) {
            addCriterion("DUE_PAY_AMT not in", values, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_PAY_AMT between", value1, value2, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andDuePayAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUE_PAY_AMT not between", value1, value2, "duePayAmt");
            return (Criteria) this;
        }

        public Criteria andClearStatusIsNull() {
            addCriterion("CLEAR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andClearStatusIsNotNull() {
            addCriterion("CLEAR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andClearStatusEqualTo(String value) {
            addCriterion("CLEAR_STATUS =", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotEqualTo(String value) {
            addCriterion("CLEAR_STATUS <>", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusGreaterThan(String value) {
            addCriterion("CLEAR_STATUS >", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CLEAR_STATUS >=", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLessThan(String value) {
            addCriterion("CLEAR_STATUS <", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLessThanOrEqualTo(String value) {
            addCriterion("CLEAR_STATUS <=", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusLike(String value) {
            addCriterion("CLEAR_STATUS like", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotLike(String value) {
            addCriterion("CLEAR_STATUS not like", value, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusIn(List<String> values) {
            addCriterion("CLEAR_STATUS in", values, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotIn(List<String> values) {
            addCriterion("CLEAR_STATUS not in", values, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusBetween(String value1, String value2) {
            addCriterion("CLEAR_STATUS between", value1, value2, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andClearStatusNotBetween(String value1, String value2) {
            addCriterion("CLEAR_STATUS not between", value1, value2, "clearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusIsNull() {
            addCriterion("DUE_CLEAR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusIsNotNull() {
            addCriterion("DUE_CLEAR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusEqualTo(String value) {
            addCriterion("DUE_CLEAR_STATUS =", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusNotEqualTo(String value) {
            addCriterion("DUE_CLEAR_STATUS <>", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusGreaterThan(String value) {
            addCriterion("DUE_CLEAR_STATUS >", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DUE_CLEAR_STATUS >=", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusLessThan(String value) {
            addCriterion("DUE_CLEAR_STATUS <", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusLessThanOrEqualTo(String value) {
            addCriterion("DUE_CLEAR_STATUS <=", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusLike(String value) {
            addCriterion("DUE_CLEAR_STATUS like", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusNotLike(String value) {
            addCriterion("DUE_CLEAR_STATUS not like", value, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusIn(List<String> values) {
            addCriterion("DUE_CLEAR_STATUS in", values, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusNotIn(List<String> values) {
            addCriterion("DUE_CLEAR_STATUS not in", values, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusBetween(String value1, String value2) {
            addCriterion("DUE_CLEAR_STATUS between", value1, value2, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueClearStatusNotBetween(String value1, String value2) {
            addCriterion("DUE_CLEAR_STATUS not between", value1, value2, "dueClearStatus");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateIsNull() {
            addCriterion("DUE_ACCOUNT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateIsNotNull() {
            addCriterion("DUE_ACCOUNT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE =", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE <>", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE >", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE >=", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE <", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE <=", value, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE in", values, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE not in", values, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE between", value1, value2, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andDueAccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_ACCOUNT_DATE not between", value1, value2, "dueAccountDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoIsNull() {
            addCriterion("APPLY_TELLER_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoIsNotNull() {
            addCriterion("APPLY_TELLER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoEqualTo(String value) {
            addCriterion("APPLY_TELLER_NO =", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoNotEqualTo(String value) {
            addCriterion("APPLY_TELLER_NO <>", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoGreaterThan(String value) {
            addCriterion("APPLY_TELLER_NO >", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TELLER_NO >=", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoLessThan(String value) {
            addCriterion("APPLY_TELLER_NO <", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TELLER_NO <=", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoLike(String value) {
            addCriterion("APPLY_TELLER_NO like", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoNotLike(String value) {
            addCriterion("APPLY_TELLER_NO not like", value, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoIn(List<String> values) {
            addCriterion("APPLY_TELLER_NO in", values, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoNotIn(List<String> values) {
            addCriterion("APPLY_TELLER_NO not in", values, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoBetween(String value1, String value2) {
            addCriterion("APPLY_TELLER_NO between", value1, value2, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andApplyTellerNoNotBetween(String value1, String value2) {
            addCriterion("APPLY_TELLER_NO not between", value1, value2, "applyTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoIsNull() {
            addCriterion("CHECK_TELLER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoIsNotNull() {
            addCriterion("CHECK_TELLER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoEqualTo(String value) {
            addCriterion("CHECK_TELLER_NO =", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoNotEqualTo(String value) {
            addCriterion("CHECK_TELLER_NO <>", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoGreaterThan(String value) {
            addCriterion("CHECK_TELLER_NO >", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_TELLER_NO >=", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoLessThan(String value) {
            addCriterion("CHECK_TELLER_NO <", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoLessThanOrEqualTo(String value) {
            addCriterion("CHECK_TELLER_NO <=", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoLike(String value) {
            addCriterion("CHECK_TELLER_NO like", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoNotLike(String value) {
            addCriterion("CHECK_TELLER_NO not like", value, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoIn(List<String> values) {
            addCriterion("CHECK_TELLER_NO in", values, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoNotIn(List<String> values) {
            addCriterion("CHECK_TELLER_NO not in", values, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoBetween(String value1, String value2) {
            addCriterion("CHECK_TELLER_NO between", value1, value2, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andCheckTellerNoNotBetween(String value1, String value2) {
            addCriterion("CHECK_TELLER_NO not between", value1, value2, "checkTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoIsNull() {
            addCriterion("ACCT_TELLER_NO is null");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoIsNotNull() {
            addCriterion("ACCT_TELLER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoEqualTo(String value) {
            addCriterion("ACCT_TELLER_NO =", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoNotEqualTo(String value) {
            addCriterion("ACCT_TELLER_NO <>", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoGreaterThan(String value) {
            addCriterion("ACCT_TELLER_NO >", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_TELLER_NO >=", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoLessThan(String value) {
            addCriterion("ACCT_TELLER_NO <", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoLessThanOrEqualTo(String value) {
            addCriterion("ACCT_TELLER_NO <=", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoLike(String value) {
            addCriterion("ACCT_TELLER_NO like", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoNotLike(String value) {
            addCriterion("ACCT_TELLER_NO not like", value, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoIn(List<String> values) {
            addCriterion("ACCT_TELLER_NO in", values, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoNotIn(List<String> values) {
            addCriterion("ACCT_TELLER_NO not in", values, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoBetween(String value1, String value2) {
            addCriterion("ACCT_TELLER_NO between", value1, value2, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andAcctTellerNoNotBetween(String value1, String value2) {
            addCriterion("ACCT_TELLER_NO not between", value1, value2, "acctTellerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoIsNull() {
            addCriterion("CUST_MANAGER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoIsNotNull() {
            addCriterion("CUST_MANAGER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoEqualTo(String value) {
            addCriterion("CUST_MANAGER_NO =", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoNotEqualTo(String value) {
            addCriterion("CUST_MANAGER_NO <>", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoGreaterThan(String value) {
            addCriterion("CUST_MANAGER_NO >", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NO >=", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoLessThan(String value) {
            addCriterion("CUST_MANAGER_NO <", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NO <=", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoLike(String value) {
            addCriterion("CUST_MANAGER_NO like", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoNotLike(String value) {
            addCriterion("CUST_MANAGER_NO not like", value, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoIn(List<String> values) {
            addCriterion("CUST_MANAGER_NO in", values, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoNotIn(List<String> values) {
            addCriterion("CUST_MANAGER_NO not in", values, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NO between", value1, value2, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andCustManagerNoNotBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NO not between", value1, value2, "custManagerNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoIsNull() {
            addCriterion("TRANS_BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoIsNotNull() {
            addCriterion("TRANS_BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoEqualTo(String value) {
            addCriterion("TRANS_BRANCH_NO =", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoNotEqualTo(String value) {
            addCriterion("TRANS_BRANCH_NO <>", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoGreaterThan(String value) {
            addCriterion("TRANS_BRANCH_NO >", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_BRANCH_NO >=", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoLessThan(String value) {
            addCriterion("TRANS_BRANCH_NO <", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_BRANCH_NO <=", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoLike(String value) {
            addCriterion("TRANS_BRANCH_NO like", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoNotLike(String value) {
            addCriterion("TRANS_BRANCH_NO not like", value, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoIn(List<String> values) {
            addCriterion("TRANS_BRANCH_NO in", values, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoNotIn(List<String> values) {
            addCriterion("TRANS_BRANCH_NO not in", values, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoBetween(String value1, String value2) {
            addCriterion("TRANS_BRANCH_NO between", value1, value2, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andTransBranchNoNotBetween(String value1, String value2) {
            addCriterion("TRANS_BRANCH_NO not between", value1, value2, "transBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoIsNull() {
            addCriterion("ACCT_BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoIsNotNull() {
            addCriterion("ACCT_BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoEqualTo(String value) {
            addCriterion("ACCT_BRANCH_NO =", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoNotEqualTo(String value) {
            addCriterion("ACCT_BRANCH_NO <>", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoGreaterThan(String value) {
            addCriterion("ACCT_BRANCH_NO >", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BRANCH_NO >=", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoLessThan(String value) {
            addCriterion("ACCT_BRANCH_NO <", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BRANCH_NO <=", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoLike(String value) {
            addCriterion("ACCT_BRANCH_NO like", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoNotLike(String value) {
            addCriterion("ACCT_BRANCH_NO not like", value, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoIn(List<String> values) {
            addCriterion("ACCT_BRANCH_NO in", values, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoNotIn(List<String> values) {
            addCriterion("ACCT_BRANCH_NO not in", values, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoBetween(String value1, String value2) {
            addCriterion("ACCT_BRANCH_NO between", value1, value2, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andAcctBranchNoNotBetween(String value1, String value2) {
            addCriterion("ACCT_BRANCH_NO not between", value1, value2, "acctBranchNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNull() {
            addCriterion("DEPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("DEPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(String value) {
            addCriterion("DEPT_NO =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(String value) {
            addCriterion("DEPT_NO <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(String value) {
            addCriterion("DEPT_NO >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NO >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(String value) {
            addCriterion("DEPT_NO <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NO <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLike(String value) {
            addCriterion("DEPT_NO like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotLike(String value) {
            addCriterion("DEPT_NO not like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<String> values) {
            addCriterion("DEPT_NO in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<String> values) {
            addCriterion("DEPT_NO not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(String value1, String value2) {
            addCriterion("DEPT_NO between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(String value1, String value2) {
            addCriterion("DEPT_NO not between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoIsNull() {
            addCriterion("TEAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeamNoIsNotNull() {
            addCriterion("TEAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNoEqualTo(String value) {
            addCriterion("TEAM_NO =", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotEqualTo(String value) {
            addCriterion("TEAM_NO <>", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoGreaterThan(String value) {
            addCriterion("TEAM_NO >", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NO >=", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLessThan(String value) {
            addCriterion("TEAM_NO <", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NO <=", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLike(String value) {
            addCriterion("TEAM_NO like", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotLike(String value) {
            addCriterion("TEAM_NO not like", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoIn(List<String> values) {
            addCriterion("TEAM_NO in", values, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotIn(List<String> values) {
            addCriterion("TEAM_NO not in", values, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoBetween(String value1, String value2) {
            addCriterion("TEAM_NO between", value1, value2, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotBetween(String value1, String value2) {
            addCriterion("TEAM_NO not between", value1, value2, "teamNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoIsNull() {
            addCriterion("SELL_BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoIsNotNull() {
            addCriterion("SELL_BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoEqualTo(String value) {
            addCriterion("SELL_BRANCH_NO =", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoNotEqualTo(String value) {
            addCriterion("SELL_BRANCH_NO <>", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoGreaterThan(String value) {
            addCriterion("SELL_BRANCH_NO >", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("SELL_BRANCH_NO >=", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoLessThan(String value) {
            addCriterion("SELL_BRANCH_NO <", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoLessThanOrEqualTo(String value) {
            addCriterion("SELL_BRANCH_NO <=", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoLike(String value) {
            addCriterion("SELL_BRANCH_NO like", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoNotLike(String value) {
            addCriterion("SELL_BRANCH_NO not like", value, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoIn(List<String> values) {
            addCriterion("SELL_BRANCH_NO in", values, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoNotIn(List<String> values) {
            addCriterion("SELL_BRANCH_NO not in", values, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoBetween(String value1, String value2) {
            addCriterion("SELL_BRANCH_NO between", value1, value2, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andSellBranchNoNotBetween(String value1, String value2) {
            addCriterion("SELL_BRANCH_NO not between", value1, value2, "sellBranchNo");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagIsNull() {
            addCriterion("MANUAL_AUDIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagIsNotNull() {
            addCriterion("MANUAL_AUDIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagEqualTo(String value) {
            addCriterion("MANUAL_AUDIT_FLAG =", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagNotEqualTo(String value) {
            addCriterion("MANUAL_AUDIT_FLAG <>", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagGreaterThan(String value) {
            addCriterion("MANUAL_AUDIT_FLAG >", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MANUAL_AUDIT_FLAG >=", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagLessThan(String value) {
            addCriterion("MANUAL_AUDIT_FLAG <", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagLessThanOrEqualTo(String value) {
            addCriterion("MANUAL_AUDIT_FLAG <=", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagLike(String value) {
            addCriterion("MANUAL_AUDIT_FLAG like", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagNotLike(String value) {
            addCriterion("MANUAL_AUDIT_FLAG not like", value, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagIn(List<String> values) {
            addCriterion("MANUAL_AUDIT_FLAG in", values, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagNotIn(List<String> values) {
            addCriterion("MANUAL_AUDIT_FLAG not in", values, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagBetween(String value1, String value2) {
            addCriterion("MANUAL_AUDIT_FLAG between", value1, value2, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andManualAuditFlagNotBetween(String value1, String value2) {
            addCriterion("MANUAL_AUDIT_FLAG not between", value1, value2, "manualAuditFlag");
            return (Criteria) this;
        }

        public Criteria andIsInnerIsNull() {
            addCriterion("IS_INNER is null");
            return (Criteria) this;
        }

        public Criteria andIsInnerIsNotNull() {
            addCriterion("IS_INNER is not null");
            return (Criteria) this;
        }

        public Criteria andIsInnerEqualTo(String value) {
            addCriterion("IS_INNER =", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerNotEqualTo(String value) {
            addCriterion("IS_INNER <>", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerGreaterThan(String value) {
            addCriterion("IS_INNER >", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INNER >=", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerLessThan(String value) {
            addCriterion("IS_INNER <", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerLessThanOrEqualTo(String value) {
            addCriterion("IS_INNER <=", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerLike(String value) {
            addCriterion("IS_INNER like", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerNotLike(String value) {
            addCriterion("IS_INNER not like", value, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerIn(List<String> values) {
            addCriterion("IS_INNER in", values, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerNotIn(List<String> values) {
            addCriterion("IS_INNER not in", values, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerBetween(String value1, String value2) {
            addCriterion("IS_INNER between", value1, value2, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsInnerNotBetween(String value1, String value2) {
            addCriterion("IS_INNER not between", value1, value2, "isInner");
            return (Criteria) this;
        }

        public Criteria andIsRediscountIsNull() {
            addCriterion("IS_REDISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsRediscountIsNotNull() {
            addCriterion("IS_REDISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsRediscountEqualTo(String value) {
            addCriterion("IS_REDISCOUNT =", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountNotEqualTo(String value) {
            addCriterion("IS_REDISCOUNT <>", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountGreaterThan(String value) {
            addCriterion("IS_REDISCOUNT >", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REDISCOUNT >=", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountLessThan(String value) {
            addCriterion("IS_REDISCOUNT <", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountLessThanOrEqualTo(String value) {
            addCriterion("IS_REDISCOUNT <=", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountLike(String value) {
            addCriterion("IS_REDISCOUNT like", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountNotLike(String value) {
            addCriterion("IS_REDISCOUNT not like", value, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountIn(List<String> values) {
            addCriterion("IS_REDISCOUNT in", values, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountNotIn(List<String> values) {
            addCriterion("IS_REDISCOUNT not in", values, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountBetween(String value1, String value2) {
            addCriterion("IS_REDISCOUNT between", value1, value2, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andIsRediscountNotBetween(String value1, String value2) {
            addCriterion("IS_REDISCOUNT not between", value1, value2, "isRediscount");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagIsNull() {
            addCriterion("CAL_INTEREST_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagIsNotNull() {
            addCriterion("CAL_INTEREST_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagEqualTo(String value) {
            addCriterion("CAL_INTEREST_FLAG =", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagNotEqualTo(String value) {
            addCriterion("CAL_INTEREST_FLAG <>", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagGreaterThan(String value) {
            addCriterion("CAL_INTEREST_FLAG >", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_INTEREST_FLAG >=", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagLessThan(String value) {
            addCriterion("CAL_INTEREST_FLAG <", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagLessThanOrEqualTo(String value) {
            addCriterion("CAL_INTEREST_FLAG <=", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagLike(String value) {
            addCriterion("CAL_INTEREST_FLAG like", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagNotLike(String value) {
            addCriterion("CAL_INTEREST_FLAG not like", value, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagIn(List<String> values) {
            addCriterion("CAL_INTEREST_FLAG in", values, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagNotIn(List<String> values) {
            addCriterion("CAL_INTEREST_FLAG not in", values, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagBetween(String value1, String value2) {
            addCriterion("CAL_INTEREST_FLAG between", value1, value2, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andCalInterestFlagNotBetween(String value1, String value2) {
            addCriterion("CAL_INTEREST_FLAG not between", value1, value2, "calInterestFlag");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchIsNull() {
            addCriterion("IS_SAME_AUTH_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchIsNotNull() {
            addCriterion("IS_SAME_AUTH_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchEqualTo(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH =", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchNotEqualTo(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH <>", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchGreaterThan(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH >", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH >=", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchLessThan(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH <", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchLessThanOrEqualTo(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH <=", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchLike(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH like", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchNotLike(String value) {
            addCriterion("IS_SAME_AUTH_BRANCH not like", value, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchIn(List<String> values) {
            addCriterion("IS_SAME_AUTH_BRANCH in", values, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchNotIn(List<String> values) {
            addCriterion("IS_SAME_AUTH_BRANCH not in", values, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchBetween(String value1, String value2) {
            addCriterion("IS_SAME_AUTH_BRANCH between", value1, value2, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andIsSameAuthBranchNotBetween(String value1, String value2) {
            addCriterion("IS_SAME_AUTH_BRANCH not between", value1, value2, "isSameAuthBranch");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIsNull() {
            addCriterion("ACCT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIsNotNull() {
            addCriterion("ACCT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAcctFlagEqualTo(String value) {
            addCriterion("ACCT_FLAG =", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotEqualTo(String value) {
            addCriterion("ACCT_FLAG <>", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagGreaterThan(String value) {
            addCriterion("ACCT_FLAG >", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_FLAG >=", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLessThan(String value) {
            addCriterion("ACCT_FLAG <", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLessThanOrEqualTo(String value) {
            addCriterion("ACCT_FLAG <=", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagLike(String value) {
            addCriterion("ACCT_FLAG like", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotLike(String value) {
            addCriterion("ACCT_FLAG not like", value, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagIn(List<String> values) {
            addCriterion("ACCT_FLAG in", values, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotIn(List<String> values) {
            addCriterion("ACCT_FLAG not in", values, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagBetween(String value1, String value2) {
            addCriterion("ACCT_FLAG between", value1, value2, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andAcctFlagNotBetween(String value1, String value2) {
            addCriterion("ACCT_FLAG not between", value1, value2, "acctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagIsNull() {
            addCriterion("DUE_ACCT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagIsNotNull() {
            addCriterion("DUE_ACCT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagEqualTo(String value) {
            addCriterion("DUE_ACCT_FLAG =", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagNotEqualTo(String value) {
            addCriterion("DUE_ACCT_FLAG <>", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagGreaterThan(String value) {
            addCriterion("DUE_ACCT_FLAG >", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DUE_ACCT_FLAG >=", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagLessThan(String value) {
            addCriterion("DUE_ACCT_FLAG <", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagLessThanOrEqualTo(String value) {
            addCriterion("DUE_ACCT_FLAG <=", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagLike(String value) {
            addCriterion("DUE_ACCT_FLAG like", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagNotLike(String value) {
            addCriterion("DUE_ACCT_FLAG not like", value, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagIn(List<String> values) {
            addCriterion("DUE_ACCT_FLAG in", values, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagNotIn(List<String> values) {
            addCriterion("DUE_ACCT_FLAG not in", values, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagBetween(String value1, String value2) {
            addCriterion("DUE_ACCT_FLAG between", value1, value2, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andDueAcctFlagNotBetween(String value1, String value2) {
            addCriterion("DUE_ACCT_FLAG not between", value1, value2, "dueAcctFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagIsNull() {
            addCriterion("PRE_AUDIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagIsNotNull() {
            addCriterion("PRE_AUDIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagEqualTo(String value) {
            addCriterion("PRE_AUDIT_FLAG =", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagNotEqualTo(String value) {
            addCriterion("PRE_AUDIT_FLAG <>", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagGreaterThan(String value) {
            addCriterion("PRE_AUDIT_FLAG >", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_AUDIT_FLAG >=", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagLessThan(String value) {
            addCriterion("PRE_AUDIT_FLAG <", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagLessThanOrEqualTo(String value) {
            addCriterion("PRE_AUDIT_FLAG <=", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagLike(String value) {
            addCriterion("PRE_AUDIT_FLAG like", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagNotLike(String value) {
            addCriterion("PRE_AUDIT_FLAG not like", value, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagIn(List<String> values) {
            addCriterion("PRE_AUDIT_FLAG in", values, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagNotIn(List<String> values) {
            addCriterion("PRE_AUDIT_FLAG not in", values, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagBetween(String value1, String value2) {
            addCriterion("PRE_AUDIT_FLAG between", value1, value2, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andPreAuditFlagNotBetween(String value1, String value2) {
            addCriterion("PRE_AUDIT_FLAG not between", value1, value2, "preAuditFlag");
            return (Criteria) this;
        }

        public Criteria andAuditNoIsNull() {
            addCriterion("AUDIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAuditNoIsNotNull() {
            addCriterion("AUDIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNoEqualTo(String value) {
            addCriterion("AUDIT_NO =", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoNotEqualTo(String value) {
            addCriterion("AUDIT_NO <>", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoGreaterThan(String value) {
            addCriterion("AUDIT_NO >", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_NO >=", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoLessThan(String value) {
            addCriterion("AUDIT_NO <", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_NO <=", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoLike(String value) {
            addCriterion("AUDIT_NO like", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoNotLike(String value) {
            addCriterion("AUDIT_NO not like", value, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoIn(List<String> values) {
            addCriterion("AUDIT_NO in", values, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoNotIn(List<String> values) {
            addCriterion("AUDIT_NO not in", values, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoBetween(String value1, String value2) {
            addCriterion("AUDIT_NO between", value1, value2, "auditNo");
            return (Criteria) this;
        }

        public Criteria andAuditNoNotBetween(String value1, String value2) {
            addCriterion("AUDIT_NO not between", value1, value2, "auditNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("BATCH_NO =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("BATCH_NO <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("BATCH_NO >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NO >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("BATCH_NO <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NO <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("BATCH_NO like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("BATCH_NO not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("BATCH_NO in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("BATCH_NO not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("BATCH_NO between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("BATCH_NO not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("PRODUCT_NO like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("PRODUCT_NO not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameIsNull() {
            addCriterion("BUY_TRADER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameIsNotNull() {
            addCriterion("BUY_TRADER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameEqualTo(String value) {
            addCriterion("BUY_TRADER_NAME =", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameNotEqualTo(String value) {
            addCriterion("BUY_TRADER_NAME <>", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameGreaterThan(String value) {
            addCriterion("BUY_TRADER_NAME >", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_TRADER_NAME >=", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameLessThan(String value) {
            addCriterion("BUY_TRADER_NAME <", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameLessThanOrEqualTo(String value) {
            addCriterion("BUY_TRADER_NAME <=", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameLike(String value) {
            addCriterion("BUY_TRADER_NAME like", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameNotLike(String value) {
            addCriterion("BUY_TRADER_NAME not like", value, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameIn(List<String> values) {
            addCriterion("BUY_TRADER_NAME in", values, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameNotIn(List<String> values) {
            addCriterion("BUY_TRADER_NAME not in", values, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameBetween(String value1, String value2) {
            addCriterion("BUY_TRADER_NAME between", value1, value2, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andBuyTraderNameNotBetween(String value1, String value2) {
            addCriterion("BUY_TRADER_NAME not between", value1, value2, "buyTraderName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNull() {
            addCriterion("CUST_MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNotNull() {
            addCriterion("CUST_MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME =", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME <>", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThan(String value) {
            addCriterion("CUST_MANAGER_NAME >", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME >=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThan(String value) {
            addCriterion("CUST_MANAGER_NAME <", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME <=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLike(String value) {
            addCriterion("CUST_MANAGER_NAME like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotLike(String value) {
            addCriterion("CUST_MANAGER_NAME not like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIn(List<String> values) {
            addCriterion("CUST_MANAGER_NAME in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotIn(List<String> values) {
            addCriterion("CUST_MANAGER_NAME not in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NAME between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NAME not between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameIsNull() {
            addCriterion("SALE_TRADER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameIsNotNull() {
            addCriterion("SALE_TRADER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameEqualTo(String value) {
            addCriterion("SALE_TRADER_NAME =", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameNotEqualTo(String value) {
            addCriterion("SALE_TRADER_NAME <>", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameGreaterThan(String value) {
            addCriterion("SALE_TRADER_NAME >", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TRADER_NAME >=", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameLessThan(String value) {
            addCriterion("SALE_TRADER_NAME <", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameLessThanOrEqualTo(String value) {
            addCriterion("SALE_TRADER_NAME <=", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameLike(String value) {
            addCriterion("SALE_TRADER_NAME like", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameNotLike(String value) {
            addCriterion("SALE_TRADER_NAME not like", value, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameIn(List<String> values) {
            addCriterion("SALE_TRADER_NAME in", values, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameNotIn(List<String> values) {
            addCriterion("SALE_TRADER_NAME not in", values, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameBetween(String value1, String value2) {
            addCriterion("SALE_TRADER_NAME between", value1, value2, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleTraderNameNotBetween(String value1, String value2) {
            addCriterion("SALE_TRADER_NAME not between", value1, value2, "saleTraderName");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdIsNull() {
            addCriterion("SALE_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdIsNotNull() {
            addCriterion("SALE_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdEqualTo(Long value) {
            addCriterion("SALE_BATCH_ID =", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdNotEqualTo(Long value) {
            addCriterion("SALE_BATCH_ID <>", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdGreaterThan(Long value) {
            addCriterion("SALE_BATCH_ID >", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_BATCH_ID >=", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdLessThan(Long value) {
            addCriterion("SALE_BATCH_ID <", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_BATCH_ID <=", value, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdIn(List<Long> values) {
            addCriterion("SALE_BATCH_ID in", values, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdNotIn(List<Long> values) {
            addCriterion("SALE_BATCH_ID not in", values, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdBetween(Long value1, Long value2) {
            addCriterion("SALE_BATCH_ID between", value1, value2, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andSaleBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_BATCH_ID not between", value1, value2, "saleBatchId");
            return (Criteria) this;
        }

        public Criteria andPacketLockIsNull() {
            addCriterion("PACKET_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andPacketLockIsNotNull() {
            addCriterion("PACKET_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andPacketLockEqualTo(String value) {
            addCriterion("PACKET_LOCK =", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockNotEqualTo(String value) {
            addCriterion("PACKET_LOCK <>", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockGreaterThan(String value) {
            addCriterion("PACKET_LOCK >", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockGreaterThanOrEqualTo(String value) {
            addCriterion("PACKET_LOCK >=", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockLessThan(String value) {
            addCriterion("PACKET_LOCK <", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockLessThanOrEqualTo(String value) {
            addCriterion("PACKET_LOCK <=", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockLike(String value) {
            addCriterion("PACKET_LOCK like", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockNotLike(String value) {
            addCriterion("PACKET_LOCK not like", value, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockIn(List<String> values) {
            addCriterion("PACKET_LOCK in", values, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockNotIn(List<String> values) {
            addCriterion("PACKET_LOCK not in", values, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockBetween(String value1, String value2) {
            addCriterion("PACKET_LOCK between", value1, value2, "packetLock");
            return (Criteria) this;
        }

        public Criteria andPacketLockNotBetween(String value1, String value2) {
            addCriterion("PACKET_LOCK not between", value1, value2, "packetLock");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeIsNull() {
            addCriterion("ACCT_BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeIsNotNull() {
            addCriterion("ACCT_BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeEqualTo(String value) {
            addCriterion("ACCT_BUSI_TYPE =", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeNotEqualTo(String value) {
            addCriterion("ACCT_BUSI_TYPE <>", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeGreaterThan(String value) {
            addCriterion("ACCT_BUSI_TYPE >", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BUSI_TYPE >=", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeLessThan(String value) {
            addCriterion("ACCT_BUSI_TYPE <", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BUSI_TYPE <=", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeLike(String value) {
            addCriterion("ACCT_BUSI_TYPE like", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeNotLike(String value) {
            addCriterion("ACCT_BUSI_TYPE not like", value, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeIn(List<String> values) {
            addCriterion("ACCT_BUSI_TYPE in", values, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeNotIn(List<String> values) {
            addCriterion("ACCT_BUSI_TYPE not in", values, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeBetween(String value1, String value2) {
            addCriterion("ACCT_BUSI_TYPE between", value1, value2, "acctBusiType");
            return (Criteria) this;
        }

        public Criteria andAcctBusiTypeNotBetween(String value1, String value2) {
            addCriterion("ACCT_BUSI_TYPE not between", value1, value2, "acctBusiType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}