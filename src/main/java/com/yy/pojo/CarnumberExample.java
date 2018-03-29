package com.yy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarnumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarnumberExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStartsiteIsNull() {
            addCriterion("startsite is null");
            return (Criteria) this;
        }

        public Criteria andStartsiteIsNotNull() {
            addCriterion("startsite is not null");
            return (Criteria) this;
        }

        public Criteria andStartsiteEqualTo(String value) {
            addCriterion("startsite =", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotEqualTo(String value) {
            addCriterion("startsite <>", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteGreaterThan(String value) {
            addCriterion("startsite >", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteGreaterThanOrEqualTo(String value) {
            addCriterion("startsite >=", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLessThan(String value) {
            addCriterion("startsite <", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLessThanOrEqualTo(String value) {
            addCriterion("startsite <=", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteLike(String value) {
            addCriterion("startsite like", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotLike(String value) {
            addCriterion("startsite not like", value, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteIn(List<String> values) {
            addCriterion("startsite in", values, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotIn(List<String> values) {
            addCriterion("startsite not in", values, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteBetween(String value1, String value2) {
            addCriterion("startsite between", value1, value2, "startsite");
            return (Criteria) this;
        }

        public Criteria andStartsiteNotBetween(String value1, String value2) {
            addCriterion("startsite not between", value1, value2, "startsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteIsNull() {
            addCriterion("endsite is null");
            return (Criteria) this;
        }

        public Criteria andEndsiteIsNotNull() {
            addCriterion("endsite is not null");
            return (Criteria) this;
        }

        public Criteria andEndsiteEqualTo(String value) {
            addCriterion("endsite =", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotEqualTo(String value) {
            addCriterion("endsite <>", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteGreaterThan(String value) {
            addCriterion("endsite >", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteGreaterThanOrEqualTo(String value) {
            addCriterion("endsite >=", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLessThan(String value) {
            addCriterion("endsite <", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLessThanOrEqualTo(String value) {
            addCriterion("endsite <=", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteLike(String value) {
            addCriterion("endsite like", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotLike(String value) {
            addCriterion("endsite not like", value, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteIn(List<String> values) {
            addCriterion("endsite in", values, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotIn(List<String> values) {
            addCriterion("endsite not in", values, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteBetween(String value1, String value2) {
            addCriterion("endsite between", value1, value2, "endsite");
            return (Criteria) this;
        }

        public Criteria andEndsiteNotBetween(String value1, String value2) {
            addCriterion("endsite not between", value1, value2, "endsite");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNull() {
            addCriterion("driverid is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("driverid is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("driverid =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("driverid <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("driverid >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverid >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("driverid <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("driverid <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("driverid in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("driverid not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("driverid between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("driverid not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andCatidIsNull() {
            addCriterion("catid is null");
            return (Criteria) this;
        }

        public Criteria andCatidIsNotNull() {
            addCriterion("catid is not null");
            return (Criteria) this;
        }

        public Criteria andCatidEqualTo(String value) {
            addCriterion("catid =", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotEqualTo(String value) {
            addCriterion("catid <>", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThan(String value) {
            addCriterion("catid >", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidGreaterThanOrEqualTo(String value) {
            addCriterion("catid >=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThan(String value) {
            addCriterion("catid <", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLessThanOrEqualTo(String value) {
            addCriterion("catid <=", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidLike(String value) {
            addCriterion("catid like", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotLike(String value) {
            addCriterion("catid not like", value, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidIn(List<String> values) {
            addCriterion("catid in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotIn(List<String> values) {
            addCriterion("catid not in", values, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidBetween(String value1, String value2) {
            addCriterion("catid between", value1, value2, "catid");
            return (Criteria) this;
        }

        public Criteria andCatidNotBetween(String value1, String value2) {
            addCriterion("catid not between", value1, value2, "catid");
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