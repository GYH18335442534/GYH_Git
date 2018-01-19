package com.guo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RebuyBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RebuyBillExample() {
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

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Long value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Long value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Long value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Long value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Long> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Long> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Long value1, Long value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
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

        public Criteria andBillNoIsNull() {
            addCriterion("BILL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("BILL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("BILL_NO =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("BILL_NO <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("BILL_NO >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_NO >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("BILL_NO <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("BILL_NO <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("BILL_NO like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("BILL_NO not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("BILL_NO in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("BILL_NO not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("BILL_NO between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("BILL_NO not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNull() {
            addCriterion("BILL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNotNull() {
            addCriterion("BILL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyEqualTo(BigDecimal value) {
            addCriterion("BILL_MONEY =", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BILL_MONEY <>", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThan(BigDecimal value) {
            addCriterion("BILL_MONEY >", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_MONEY >=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThan(BigDecimal value) {
            addCriterion("BILL_MONEY <", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_MONEY <=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIn(List<BigDecimal> values) {
            addCriterion("BILL_MONEY in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BILL_MONEY not in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_MONEY between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_MONEY not between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateIsNull() {
            addCriterion("DUE_MAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueMatDateIsNotNull() {
            addCriterion("DUE_MAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueMatDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE =", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE <>", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE >", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE >=", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE <", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_MAT_DATE <=", value, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_MAT_DATE in", values, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_MAT_DATE not in", values, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_MAT_DATE between", value1, value2, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andDueMatDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_MAT_DATE not between", value1, value2, "dueMatDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateIsNull() {
            addCriterion("ISSU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIssuDateIsNotNull() {
            addCriterion("ISSU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIssuDateEqualTo(Date value) {
            addCriterionForJDBCDate("ISSU_DATE =", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ISSU_DATE <>", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ISSU_DATE >", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ISSU_DATE >=", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateLessThan(Date value) {
            addCriterionForJDBCDate("ISSU_DATE <", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ISSU_DATE <=", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateIn(List<Date> values) {
            addCriterionForJDBCDate("ISSU_DATE in", values, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ISSU_DATE not in", values, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ISSU_DATE between", value1, value2, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ISSU_DATE not between", value1, value2, "issuDate");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNull() {
            addCriterion("REMITTER is null");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNotNull() {
            addCriterion("REMITTER is not null");
            return (Criteria) this;
        }

        public Criteria andRemitterEqualTo(String value) {
            addCriterion("REMITTER =", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotEqualTo(String value) {
            addCriterion("REMITTER <>", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThan(String value) {
            addCriterion("REMITTER >", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThanOrEqualTo(String value) {
            addCriterion("REMITTER >=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThan(String value) {
            addCriterion("REMITTER <", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThanOrEqualTo(String value) {
            addCriterion("REMITTER <=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLike(String value) {
            addCriterion("REMITTER like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotLike(String value) {
            addCriterion("REMITTER not like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterIn(List<String> values) {
            addCriterion("REMITTER in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotIn(List<String> values) {
            addCriterion("REMITTER not in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterBetween(String value1, String value2) {
            addCriterion("REMITTER between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotBetween(String value1, String value2) {
            addCriterion("REMITTER not between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andDraweeIsNull() {
            addCriterion("DRAWEE is null");
            return (Criteria) this;
        }

        public Criteria andDraweeIsNotNull() {
            addCriterion("DRAWEE is not null");
            return (Criteria) this;
        }

        public Criteria andDraweeEqualTo(String value) {
            addCriterion("DRAWEE =", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeNotEqualTo(String value) {
            addCriterion("DRAWEE <>", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeGreaterThan(String value) {
            addCriterion("DRAWEE >", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWEE >=", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeLessThan(String value) {
            addCriterion("DRAWEE <", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeLessThanOrEqualTo(String value) {
            addCriterion("DRAWEE <=", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeLike(String value) {
            addCriterion("DRAWEE like", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeNotLike(String value) {
            addCriterion("DRAWEE not like", value, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeIn(List<String> values) {
            addCriterion("DRAWEE in", values, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeNotIn(List<String> values) {
            addCriterion("DRAWEE not in", values, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeBetween(String value1, String value2) {
            addCriterion("DRAWEE between", value1, value2, "drawee");
            return (Criteria) this;
        }

        public Criteria andDraweeNotBetween(String value1, String value2) {
            addCriterion("DRAWEE not between", value1, value2, "drawee");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeIsNull() {
            addCriterion("ACCEPTOR_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeIsNotNull() {
            addCriterion("ACCEPTOR_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeEqualTo(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE =", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeNotEqualTo(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE <>", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeGreaterThan(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE >", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE >=", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeLessThan(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE <", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE <=", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeLike(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE like", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeNotLike(String value) {
            addCriterion("ACCEPTOR_BRANCH_CODE not like", value, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeIn(List<String> values) {
            addCriterion("ACCEPTOR_BRANCH_CODE in", values, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeNotIn(List<String> values) {
            addCriterion("ACCEPTOR_BRANCH_CODE not in", values, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeBetween(String value1, String value2) {
            addCriterion("ACCEPTOR_BRANCH_CODE between", value1, value2, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcceptorBranchCodeNotBetween(String value1, String value2) {
            addCriterion("ACCEPTOR_BRANCH_CODE not between", value1, value2, "acceptorBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeIsNull() {
            addCriterion("ACPT_CFM_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeIsNotNull() {
            addCriterion("ACPT_CFM_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeEqualTo(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE =", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeNotEqualTo(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE <>", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeGreaterThan(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE >", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE >=", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeLessThan(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE <", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE <=", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeLike(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE like", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeNotLike(String value) {
            addCriterion("ACPT_CFM_BRANCH_CODE not like", value, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeIn(List<String> values) {
            addCriterion("ACPT_CFM_BRANCH_CODE in", values, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeNotIn(List<String> values) {
            addCriterion("ACPT_CFM_BRANCH_CODE not in", values, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeBetween(String value1, String value2) {
            addCriterion("ACPT_CFM_BRANCH_CODE between", value1, value2, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptCfmBranchCodeNotBetween(String value1, String value2) {
            addCriterion("ACPT_CFM_BRANCH_CODE not between", value1, value2, "acptCfmBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeIsNull() {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeIsNotNull() {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeEqualTo(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE =", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeNotEqualTo(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE <>", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeGreaterThan(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE >", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE >=", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeLessThan(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE <", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE <=", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeLike(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE like", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeNotLike(String value) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE not like", value, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeIn(List<String> values) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE in", values, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeNotIn(List<String> values) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE not in", values, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeBetween(String value1, String value2) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE between", value1, value2, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andAcptGuarntrBranchCodeNotBetween(String value1, String value2) {
            addCriterion("ACPT_GUARNTR_BRANCH_CODE not between", value1, value2, "acptGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeIsNull() {
            addCriterion("DISC_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeIsNotNull() {
            addCriterion("DISC_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeEqualTo(String value) {
            addCriterion("DISC_BRANCH_CODE =", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeNotEqualTo(String value) {
            addCriterion("DISC_BRANCH_CODE <>", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeGreaterThan(String value) {
            addCriterion("DISC_BRANCH_CODE >", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISC_BRANCH_CODE >=", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeLessThan(String value) {
            addCriterion("DISC_BRANCH_CODE <", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("DISC_BRANCH_CODE <=", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeLike(String value) {
            addCriterion("DISC_BRANCH_CODE like", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeNotLike(String value) {
            addCriterion("DISC_BRANCH_CODE not like", value, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeIn(List<String> values) {
            addCriterion("DISC_BRANCH_CODE in", values, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeNotIn(List<String> values) {
            addCriterion("DISC_BRANCH_CODE not in", values, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeBetween(String value1, String value2) {
            addCriterion("DISC_BRANCH_CODE between", value1, value2, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscBranchCodeNotBetween(String value1, String value2) {
            addCriterion("DISC_BRANCH_CODE not between", value1, value2, "discBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeIsNull() {
            addCriterion("DISC_GUARNTR_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeIsNotNull() {
            addCriterion("DISC_GUARNTR_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeEqualTo(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE =", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeNotEqualTo(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE <>", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeGreaterThan(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE >", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE >=", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeLessThan(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE <", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE <=", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeLike(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE like", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeNotLike(String value) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE not like", value, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeIn(List<String> values) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE in", values, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeNotIn(List<String> values) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE not in", values, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeBetween(String value1, String value2) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE between", value1, value2, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andDiscGuarntrBranchCodeNotBetween(String value1, String value2) {
            addCriterion("DISC_GUARNTR_BRANCH_CODE not between", value1, value2, "discGuarntrBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeIsNull() {
            addCriterion("TRUST_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeIsNotNull() {
            addCriterion("TRUST_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeEqualTo(String value) {
            addCriterion("TRUST_BRANCH_CODE =", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeNotEqualTo(String value) {
            addCriterion("TRUST_BRANCH_CODE <>", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeGreaterThan(String value) {
            addCriterion("TRUST_BRANCH_CODE >", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRUST_BRANCH_CODE >=", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeLessThan(String value) {
            addCriterion("TRUST_BRANCH_CODE <", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("TRUST_BRANCH_CODE <=", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeLike(String value) {
            addCriterion("TRUST_BRANCH_CODE like", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeNotLike(String value) {
            addCriterion("TRUST_BRANCH_CODE not like", value, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeIn(List<String> values) {
            addCriterion("TRUST_BRANCH_CODE in", values, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeNotIn(List<String> values) {
            addCriterion("TRUST_BRANCH_CODE not in", values, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeBetween(String value1, String value2) {
            addCriterion("TRUST_BRANCH_CODE between", value1, value2, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andTrustBranchCodeNotBetween(String value1, String value2) {
            addCriterion("TRUST_BRANCH_CODE not between", value1, value2, "trustBranchCode");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIsNull() {
            addCriterion("REMAIN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIsNotNull() {
            addCriterion("REMAIN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andRemainDaysEqualTo(Integer value) {
            addCriterion("REMAIN_DAYS =", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotEqualTo(Integer value) {
            addCriterion("REMAIN_DAYS <>", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysGreaterThan(Integer value) {
            addCriterion("REMAIN_DAYS >", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_DAYS >=", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysLessThan(Integer value) {
            addCriterion("REMAIN_DAYS <", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysLessThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_DAYS <=", value, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysIn(List<Integer> values) {
            addCriterion("REMAIN_DAYS in", values, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotIn(List<Integer> values) {
            addCriterion("REMAIN_DAYS not in", values, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_DAYS between", value1, value2, "remainDays");
            return (Criteria) this;
        }

        public Criteria andRemainDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_DAYS not between", value1, value2, "remainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysIsNull() {
            addCriterion("DUE_REMAIN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysIsNotNull() {
            addCriterion("DUE_REMAIN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysEqualTo(Integer value) {
            addCriterion("DUE_REMAIN_DAYS =", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysNotEqualTo(Integer value) {
            addCriterion("DUE_REMAIN_DAYS <>", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysGreaterThan(Integer value) {
            addCriterion("DUE_REMAIN_DAYS >", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("DUE_REMAIN_DAYS >=", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysLessThan(Integer value) {
            addCriterion("DUE_REMAIN_DAYS <", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysLessThanOrEqualTo(Integer value) {
            addCriterion("DUE_REMAIN_DAYS <=", value, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysIn(List<Integer> values) {
            addCriterion("DUE_REMAIN_DAYS in", values, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysNotIn(List<Integer> values) {
            addCriterion("DUE_REMAIN_DAYS not in", values, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysBetween(Integer value1, Integer value2) {
            addCriterion("DUE_REMAIN_DAYS between", value1, value2, "dueRemainDays");
            return (Criteria) this;
        }

        public Criteria andDueRemainDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("DUE_REMAIN_DAYS not between", value1, value2, "dueRemainDays");
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

        public Criteria andScrRelationFlagIsNull() {
            addCriterion("SCR_RELATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagIsNotNull() {
            addCriterion("SCR_RELATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagEqualTo(String value) {
            addCriterion("SCR_RELATION_FLAG =", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagNotEqualTo(String value) {
            addCriterion("SCR_RELATION_FLAG <>", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagGreaterThan(String value) {
            addCriterion("SCR_RELATION_FLAG >", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SCR_RELATION_FLAG >=", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagLessThan(String value) {
            addCriterion("SCR_RELATION_FLAG <", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagLessThanOrEqualTo(String value) {
            addCriterion("SCR_RELATION_FLAG <=", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagLike(String value) {
            addCriterion("SCR_RELATION_FLAG like", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagNotLike(String value) {
            addCriterion("SCR_RELATION_FLAG not like", value, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagIn(List<String> values) {
            addCriterion("SCR_RELATION_FLAG in", values, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagNotIn(List<String> values) {
            addCriterion("SCR_RELATION_FLAG not in", values, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagBetween(String value1, String value2) {
            addCriterion("SCR_RELATION_FLAG between", value1, value2, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andScrRelationFlagNotBetween(String value1, String value2) {
            addCriterion("SCR_RELATION_FLAG not between", value1, value2, "scrRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagIsNull() {
            addCriterion("PRE_RELATION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagIsNotNull() {
            addCriterion("PRE_RELATION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagEqualTo(String value) {
            addCriterion("PRE_RELATION_FLAG =", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagNotEqualTo(String value) {
            addCriterion("PRE_RELATION_FLAG <>", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagGreaterThan(String value) {
            addCriterion("PRE_RELATION_FLAG >", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_RELATION_FLAG >=", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagLessThan(String value) {
            addCriterion("PRE_RELATION_FLAG <", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagLessThanOrEqualTo(String value) {
            addCriterion("PRE_RELATION_FLAG <=", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagLike(String value) {
            addCriterion("PRE_RELATION_FLAG like", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagNotLike(String value) {
            addCriterion("PRE_RELATION_FLAG not like", value, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagIn(List<String> values) {
            addCriterion("PRE_RELATION_FLAG in", values, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagNotIn(List<String> values) {
            addCriterion("PRE_RELATION_FLAG not in", values, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagBetween(String value1, String value2) {
            addCriterion("PRE_RELATION_FLAG between", value1, value2, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andPreRelationFlagNotBetween(String value1, String value2) {
            addCriterion("PRE_RELATION_FLAG not between", value1, value2, "preRelationFlag");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Long value) {
            addCriterion("BILL_ID =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Long value) {
            addCriterion("BILL_ID <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Long value) {
            addCriterion("BILL_ID >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_ID >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Long value) {
            addCriterion("BILL_ID <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Long value) {
            addCriterion("BILL_ID <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Long> values) {
            addCriterion("BILL_ID in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Long> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Long value1, Long value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Long value1, Long value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagIsNull() {
            addCriterion("FREEZN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagIsNotNull() {
            addCriterion("FREEZN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagEqualTo(String value) {
            addCriterion("FREEZN_FLAG =", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagNotEqualTo(String value) {
            addCriterion("FREEZN_FLAG <>", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagGreaterThan(String value) {
            addCriterion("FREEZN_FLAG >", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FREEZN_FLAG >=", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagLessThan(String value) {
            addCriterion("FREEZN_FLAG <", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagLessThanOrEqualTo(String value) {
            addCriterion("FREEZN_FLAG <=", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagLike(String value) {
            addCriterion("FREEZN_FLAG like", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagNotLike(String value) {
            addCriterion("FREEZN_FLAG not like", value, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagIn(List<String> values) {
            addCriterion("FREEZN_FLAG in", values, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagNotIn(List<String> values) {
            addCriterion("FREEZN_FLAG not in", values, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagBetween(String value1, String value2) {
            addCriterion("FREEZN_FLAG between", value1, value2, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andFreeznFlagNotBetween(String value1, String value2) {
            addCriterion("FREEZN_FLAG not between", value1, value2, "freeznFlag");
            return (Criteria) this;
        }

        public Criteria andGathTypeIsNull() {
            addCriterion("GATH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGathTypeIsNotNull() {
            addCriterion("GATH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGathTypeEqualTo(String value) {
            addCriterion("GATH_TYPE =", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeNotEqualTo(String value) {
            addCriterion("GATH_TYPE <>", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeGreaterThan(String value) {
            addCriterion("GATH_TYPE >", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GATH_TYPE >=", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeLessThan(String value) {
            addCriterion("GATH_TYPE <", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeLessThanOrEqualTo(String value) {
            addCriterion("GATH_TYPE <=", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeLike(String value) {
            addCriterion("GATH_TYPE like", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeNotLike(String value) {
            addCriterion("GATH_TYPE not like", value, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeIn(List<String> values) {
            addCriterion("GATH_TYPE in", values, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeNotIn(List<String> values) {
            addCriterion("GATH_TYPE not in", values, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeBetween(String value1, String value2) {
            addCriterion("GATH_TYPE between", value1, value2, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathTypeNotBetween(String value1, String value2) {
            addCriterion("GATH_TYPE not between", value1, value2, "gathType");
            return (Criteria) this;
        }

        public Criteria andGathDateIsNull() {
            addCriterion("GATH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGathDateIsNotNull() {
            addCriterion("GATH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGathDateEqualTo(Date value) {
            addCriterionForJDBCDate("GATH_DATE =", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("GATH_DATE <>", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateGreaterThan(Date value) {
            addCriterionForJDBCDate("GATH_DATE >", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GATH_DATE >=", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateLessThan(Date value) {
            addCriterionForJDBCDate("GATH_DATE <", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GATH_DATE <=", value, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateIn(List<Date> values) {
            addCriterionForJDBCDate("GATH_DATE in", values, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("GATH_DATE not in", values, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GATH_DATE between", value1, value2, "gathDate");
            return (Criteria) this;
        }

        public Criteria andGathDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GATH_DATE not between", value1, value2, "gathDate");
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