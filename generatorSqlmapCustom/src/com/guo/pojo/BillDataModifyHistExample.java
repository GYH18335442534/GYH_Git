package com.guo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillDataModifyHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillDataModifyHistExample() {
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

        public Criteria andIssuDateIsNull() {
            addCriterion("ISSU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIssuDateIsNotNull() {
            addCriterion("ISSU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIssuDateEqualTo(Date value) {
            addCriterion("ISSU_DATE =", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotEqualTo(Date value) {
            addCriterion("ISSU_DATE <>", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateGreaterThan(Date value) {
            addCriterion("ISSU_DATE >", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ISSU_DATE >=", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateLessThan(Date value) {
            addCriterion("ISSU_DATE <", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateLessThanOrEqualTo(Date value) {
            addCriterion("ISSU_DATE <=", value, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateIn(List<Date> values) {
            addCriterion("ISSU_DATE in", values, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotIn(List<Date> values) {
            addCriterion("ISSU_DATE not in", values, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateBetween(Date value1, Date value2) {
            addCriterion("ISSU_DATE between", value1, value2, "issuDate");
            return (Criteria) this;
        }

        public Criteria andIssuDateNotBetween(Date value1, Date value2) {
            addCriterion("ISSU_DATE not between", value1, value2, "issuDate");
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

        public Criteria andRemitterAcctNoIsNull() {
            addCriterion("REMITTER_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoIsNotNull() {
            addCriterion("REMITTER_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoEqualTo(String value) {
            addCriterion("REMITTER_ACCT_NO =", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoNotEqualTo(String value) {
            addCriterion("REMITTER_ACCT_NO <>", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoGreaterThan(String value) {
            addCriterion("REMITTER_ACCT_NO >", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("REMITTER_ACCT_NO >=", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoLessThan(String value) {
            addCriterion("REMITTER_ACCT_NO <", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoLessThanOrEqualTo(String value) {
            addCriterion("REMITTER_ACCT_NO <=", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoLike(String value) {
            addCriterion("REMITTER_ACCT_NO like", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoNotLike(String value) {
            addCriterion("REMITTER_ACCT_NO not like", value, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoIn(List<String> values) {
            addCriterion("REMITTER_ACCT_NO in", values, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoNotIn(List<String> values) {
            addCriterion("REMITTER_ACCT_NO not in", values, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoBetween(String value1, String value2) {
            addCriterion("REMITTER_ACCT_NO between", value1, value2, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andRemitterAcctNoNotBetween(String value1, String value2) {
            addCriterion("REMITTER_ACCT_NO not between", value1, value2, "remitterAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("PAYEE is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("PAYEE is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("PAYEE =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("PAYEE <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("PAYEE >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("PAYEE <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("PAYEE <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("PAYEE like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("PAYEE not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("PAYEE in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("PAYEE not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("PAYEE between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("PAYEE not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
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

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME not between", value1, value2, "creatTime");
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

        public Criteria andRebuybillIdIsNull() {
            addCriterion("REBUYBILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdIsNotNull() {
            addCriterion("REBUYBILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdEqualTo(Integer value) {
            addCriterion("REBUYBILL_ID =", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdNotEqualTo(Integer value) {
            addCriterion("REBUYBILL_ID <>", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdGreaterThan(Integer value) {
            addCriterion("REBUYBILL_ID >", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REBUYBILL_ID >=", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdLessThan(Integer value) {
            addCriterion("REBUYBILL_ID <", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdLessThanOrEqualTo(Integer value) {
            addCriterion("REBUYBILL_ID <=", value, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdIn(List<Integer> values) {
            addCriterion("REBUYBILL_ID in", values, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdNotIn(List<Integer> values) {
            addCriterion("REBUYBILL_ID not in", values, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdBetween(Integer value1, Integer value2) {
            addCriterion("REBUYBILL_ID between", value1, value2, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andRebuybillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REBUYBILL_ID not between", value1, value2, "rebuybillId");
            return (Criteria) this;
        }

        public Criteria andInitalTypeIsNull() {
            addCriterion("INITAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInitalTypeIsNotNull() {
            addCriterion("INITAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInitalTypeEqualTo(String value) {
            addCriterion("INITAL_TYPE =", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeNotEqualTo(String value) {
            addCriterion("INITAL_TYPE <>", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeGreaterThan(String value) {
            addCriterion("INITAL_TYPE >", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INITAL_TYPE >=", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeLessThan(String value) {
            addCriterion("INITAL_TYPE <", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeLessThanOrEqualTo(String value) {
            addCriterion("INITAL_TYPE <=", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeLike(String value) {
            addCriterion("INITAL_TYPE like", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeNotLike(String value) {
            addCriterion("INITAL_TYPE not like", value, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeIn(List<String> values) {
            addCriterion("INITAL_TYPE in", values, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeNotIn(List<String> values) {
            addCriterion("INITAL_TYPE not in", values, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeBetween(String value1, String value2) {
            addCriterion("INITAL_TYPE between", value1, value2, "initalType");
            return (Criteria) this;
        }

        public Criteria andInitalTypeNotBetween(String value1, String value2) {
            addCriterion("INITAL_TYPE not between", value1, value2, "initalType");
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