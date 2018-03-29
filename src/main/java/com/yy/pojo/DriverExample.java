package com.yy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        public Criteria andDriveridIsNull() {
            addCriterion("driverID is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("driverID is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("driverID =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("driverID <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("driverID >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverID >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("driverID <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("driverID <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("driverID in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("driverID not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("driverID between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("driverID not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("drivername is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("drivername is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("drivername =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("drivername <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("drivername >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("drivername >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("drivername <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("drivername <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("drivername like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("drivername not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("drivername in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("drivername not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("drivername between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("drivername not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WeChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WeChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WeChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WeChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WeChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WeChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneIsNull() {
            addCriterion("exigencyphone is null");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneIsNotNull() {
            addCriterion("exigencyphone is not null");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneEqualTo(String value) {
            addCriterion("exigencyphone =", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneNotEqualTo(String value) {
            addCriterion("exigencyphone <>", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneGreaterThan(String value) {
            addCriterion("exigencyphone >", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("exigencyphone >=", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneLessThan(String value) {
            addCriterion("exigencyphone <", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneLessThanOrEqualTo(String value) {
            addCriterion("exigencyphone <=", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneLike(String value) {
            addCriterion("exigencyphone like", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneNotLike(String value) {
            addCriterion("exigencyphone not like", value, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneIn(List<String> values) {
            addCriterion("exigencyphone in", values, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneNotIn(List<String> values) {
            addCriterion("exigencyphone not in", values, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneBetween(String value1, String value2) {
            addCriterion("exigencyphone between", value1, value2, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andExigencyphoneNotBetween(String value1, String value2) {
            addCriterion("exigencyphone not between", value1, value2, "exigencyphone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIsNull() {
            addCriterion("driverStatus is null");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIsNotNull() {
            addCriterion("driverStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDriverstatusEqualTo(Integer value) {
            addCriterion("driverStatus =", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotEqualTo(Integer value) {
            addCriterion("driverStatus <>", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusGreaterThan(Integer value) {
            addCriterion("driverStatus >", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverStatus >=", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusLessThan(Integer value) {
            addCriterion("driverStatus <", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusLessThanOrEqualTo(Integer value) {
            addCriterion("driverStatus <=", value, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusIn(List<Integer> values) {
            addCriterion("driverStatus in", values, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotIn(List<Integer> values) {
            addCriterion("driverStatus not in", values, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusBetween(Integer value1, Integer value2) {
            addCriterion("driverStatus between", value1, value2, "driverstatus");
            return (Criteria) this;
        }

        public Criteria andDriverstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("driverStatus not between", value1, value2, "driverstatus");
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