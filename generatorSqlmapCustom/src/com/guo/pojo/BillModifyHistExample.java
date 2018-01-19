package com.guo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillModifyHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillModifyHistExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("BILL_ID =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("BILL_ID <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("BILL_ID >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_ID >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("BILL_ID <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_ID <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("BILL_ID in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
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

        public Criteria andModifyProrNameIsNull() {
            addCriterion("MODIFY_PROR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameIsNotNull() {
            addCriterion("MODIFY_PROR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameEqualTo(String value) {
            addCriterion("MODIFY_PROR_NAME =", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameNotEqualTo(String value) {
            addCriterion("MODIFY_PROR_NAME <>", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameGreaterThan(String value) {
            addCriterion("MODIFY_PROR_NAME >", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_PROR_NAME >=", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameLessThan(String value) {
            addCriterion("MODIFY_PROR_NAME <", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_PROR_NAME <=", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameLike(String value) {
            addCriterion("MODIFY_PROR_NAME like", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameNotLike(String value) {
            addCriterion("MODIFY_PROR_NAME not like", value, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameIn(List<String> values) {
            addCriterion("MODIFY_PROR_NAME in", values, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameNotIn(List<String> values) {
            addCriterion("MODIFY_PROR_NAME not in", values, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameBetween(String value1, String value2) {
            addCriterion("MODIFY_PROR_NAME between", value1, value2, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyProrNameNotBetween(String value1, String value2) {
            addCriterion("MODIFY_PROR_NAME not between", value1, value2, "modifyProrName");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNull() {
            addCriterion("MODIFY_DT is null");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNotNull() {
            addCriterion("MODIFY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDtEqualTo(Date value) {
            addCriterion("MODIFY_DT =", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotEqualTo(Date value) {
            addCriterion("MODIFY_DT <>", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThan(Date value) {
            addCriterion("MODIFY_DT >", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DT >=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThan(Date value) {
            addCriterion("MODIFY_DT <", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DT <=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtIn(List<Date> values) {
            addCriterion("MODIFY_DT in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotIn(List<Date> values) {
            addCriterion("MODIFY_DT not in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DT between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DT not between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeIsNull() {
            addCriterion("MODIFY_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeIsNotNull() {
            addCriterion("MODIFY_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeEqualTo(String value) {
            addCriterion("MODIFY_BEFORE =", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeNotEqualTo(String value) {
            addCriterion("MODIFY_BEFORE <>", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeGreaterThan(String value) {
            addCriterion("MODIFY_BEFORE >", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_BEFORE >=", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeLessThan(String value) {
            addCriterion("MODIFY_BEFORE <", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_BEFORE <=", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeLike(String value) {
            addCriterion("MODIFY_BEFORE like", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeNotLike(String value) {
            addCriterion("MODIFY_BEFORE not like", value, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeIn(List<String> values) {
            addCriterion("MODIFY_BEFORE in", values, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeNotIn(List<String> values) {
            addCriterion("MODIFY_BEFORE not in", values, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeBetween(String value1, String value2) {
            addCriterion("MODIFY_BEFORE between", value1, value2, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyBeforeNotBetween(String value1, String value2) {
            addCriterion("MODIFY_BEFORE not between", value1, value2, "modifyBefore");
            return (Criteria) this;
        }

        public Criteria andModifyAfterIsNull() {
            addCriterion("MODIFY_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andModifyAfterIsNotNull() {
            addCriterion("MODIFY_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyAfterEqualTo(String value) {
            addCriterion("MODIFY_AFTER =", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterNotEqualTo(String value) {
            addCriterion("MODIFY_AFTER <>", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterGreaterThan(String value) {
            addCriterion("MODIFY_AFTER >", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_AFTER >=", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterLessThan(String value) {
            addCriterion("MODIFY_AFTER <", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_AFTER <=", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterLike(String value) {
            addCriterion("MODIFY_AFTER like", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterNotLike(String value) {
            addCriterion("MODIFY_AFTER not like", value, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterIn(List<String> values) {
            addCriterion("MODIFY_AFTER in", values, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterNotIn(List<String> values) {
            addCriterion("MODIFY_AFTER not in", values, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterBetween(String value1, String value2) {
            addCriterion("MODIFY_AFTER between", value1, value2, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyAfterNotBetween(String value1, String value2) {
            addCriterion("MODIFY_AFTER not between", value1, value2, "modifyAfter");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("MODIFY_USER like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("MODIFY_USER not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andBillSourceIsNull() {
            addCriterion("BILL_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBillSourceIsNotNull() {
            addCriterion("BILL_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBillSourceEqualTo(String value) {
            addCriterion("BILL_SOURCE =", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotEqualTo(String value) {
            addCriterion("BILL_SOURCE <>", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceGreaterThan(String value) {
            addCriterion("BILL_SOURCE >", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_SOURCE >=", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLessThan(String value) {
            addCriterion("BILL_SOURCE <", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLessThanOrEqualTo(String value) {
            addCriterion("BILL_SOURCE <=", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLike(String value) {
            addCriterion("BILL_SOURCE like", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotLike(String value) {
            addCriterion("BILL_SOURCE not like", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceIn(List<String> values) {
            addCriterion("BILL_SOURCE in", values, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotIn(List<String> values) {
            addCriterion("BILL_SOURCE not in", values, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceBetween(String value1, String value2) {
            addCriterion("BILL_SOURCE between", value1, value2, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotBetween(String value1, String value2) {
            addCriterion("BILL_SOURCE not between", value1, value2, "billSource");
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