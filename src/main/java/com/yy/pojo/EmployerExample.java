package com.yy.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployerExample() {
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

        public Criteria andEmployeridIsNull() {
            addCriterion("employerID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeridIsNotNull() {
            addCriterion("employerID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeridEqualTo(Integer value) {
            addCriterion("employerID =", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotEqualTo(Integer value) {
            addCriterion("employerID <>", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridGreaterThan(Integer value) {
            addCriterion("employerID >", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("employerID >=", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridLessThan(Integer value) {
            addCriterion("employerID <", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridLessThanOrEqualTo(Integer value) {
            addCriterion("employerID <=", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridIn(List<Integer> values) {
            addCriterion("employerID in", values, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotIn(List<Integer> values) {
            addCriterion("employerID not in", values, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridBetween(Integer value1, Integer value2) {
            addCriterion("employerID between", value1, value2, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotBetween(Integer value1, Integer value2) {
            addCriterion("employerID not between", value1, value2, "employerid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
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

        public Criteria andTaolu1IsNull() {
            addCriterion("taolu1 is null");
            return (Criteria) this;
        }

        public Criteria andTaolu1IsNotNull() {
            addCriterion("taolu1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaolu1EqualTo(String value) {
            addCriterion("taolu1 =", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1NotEqualTo(String value) {
            addCriterion("taolu1 <>", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1GreaterThan(String value) {
            addCriterion("taolu1 >", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1GreaterThanOrEqualTo(String value) {
            addCriterion("taolu1 >=", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1LessThan(String value) {
            addCriterion("taolu1 <", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1LessThanOrEqualTo(String value) {
            addCriterion("taolu1 <=", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1Like(String value) {
            addCriterion("taolu1 like", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1NotLike(String value) {
            addCriterion("taolu1 not like", value, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1In(List<String> values) {
            addCriterion("taolu1 in", values, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1NotIn(List<String> values) {
            addCriterion("taolu1 not in", values, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1Between(String value1, String value2) {
            addCriterion("taolu1 between", value1, value2, "taolu1");
            return (Criteria) this;
        }

        public Criteria andTaolu1NotBetween(String value1, String value2) {
            addCriterion("taolu1 not between", value1, value2, "taolu1");
            return (Criteria) this;
        }

        public Criteria andExigencephoneIsNull() {
            addCriterion("exigencephone is null");
            return (Criteria) this;
        }

        public Criteria andExigencephoneIsNotNull() {
            addCriterion("exigencephone is not null");
            return (Criteria) this;
        }

        public Criteria andExigencephoneEqualTo(String value) {
            addCriterion("exigencephone =", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneNotEqualTo(String value) {
            addCriterion("exigencephone <>", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneGreaterThan(String value) {
            addCriterion("exigencephone >", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneGreaterThanOrEqualTo(String value) {
            addCriterion("exigencephone >=", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneLessThan(String value) {
            addCriterion("exigencephone <", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneLessThanOrEqualTo(String value) {
            addCriterion("exigencephone <=", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneLike(String value) {
            addCriterion("exigencephone like", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneNotLike(String value) {
            addCriterion("exigencephone not like", value, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneIn(List<String> values) {
            addCriterion("exigencephone in", values, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneNotIn(List<String> values) {
            addCriterion("exigencephone not in", values, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneBetween(String value1, String value2) {
            addCriterion("exigencephone between", value1, value2, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andExigencephoneNotBetween(String value1, String value2) {
            addCriterion("exigencephone not between", value1, value2, "exigencephone");
            return (Criteria) this;
        }

        public Criteria andTaolu2IsNull() {
            addCriterion("taolu2 is null");
            return (Criteria) this;
        }

        public Criteria andTaolu2IsNotNull() {
            addCriterion("taolu2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaolu2EqualTo(String value) {
            addCriterion("taolu2 =", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2NotEqualTo(String value) {
            addCriterion("taolu2 <>", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2GreaterThan(String value) {
            addCriterion("taolu2 >", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2GreaterThanOrEqualTo(String value) {
            addCriterion("taolu2 >=", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2LessThan(String value) {
            addCriterion("taolu2 <", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2LessThanOrEqualTo(String value) {
            addCriterion("taolu2 <=", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2Like(String value) {
            addCriterion("taolu2 like", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2NotLike(String value) {
            addCriterion("taolu2 not like", value, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2In(List<String> values) {
            addCriterion("taolu2 in", values, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2NotIn(List<String> values) {
            addCriterion("taolu2 not in", values, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2Between(String value1, String value2) {
            addCriterion("taolu2 between", value1, value2, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu2NotBetween(String value1, String value2) {
            addCriterion("taolu2 not between", value1, value2, "taolu2");
            return (Criteria) this;
        }

        public Criteria andTaolu3IsNull() {
            addCriterion("taolu3 is null");
            return (Criteria) this;
        }

        public Criteria andTaolu3IsNotNull() {
            addCriterion("taolu3 is not null");
            return (Criteria) this;
        }

        public Criteria andTaolu3EqualTo(String value) {
            addCriterion("taolu3 =", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3NotEqualTo(String value) {
            addCriterion("taolu3 <>", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3GreaterThan(String value) {
            addCriterion("taolu3 >", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3GreaterThanOrEqualTo(String value) {
            addCriterion("taolu3 >=", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3LessThan(String value) {
            addCriterion("taolu3 <", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3LessThanOrEqualTo(String value) {
            addCriterion("taolu3 <=", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3Like(String value) {
            addCriterion("taolu3 like", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3NotLike(String value) {
            addCriterion("taolu3 not like", value, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3In(List<String> values) {
            addCriterion("taolu3 in", values, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3NotIn(List<String> values) {
            addCriterion("taolu3 not in", values, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3Between(String value1, String value2) {
            addCriterion("taolu3 between", value1, value2, "taolu3");
            return (Criteria) this;
        }

        public Criteria andTaolu3NotBetween(String value1, String value2) {
            addCriterion("taolu3 not between", value1, value2, "taolu3");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andAnnotationIsNull() {
            addCriterion("annotation is null");
            return (Criteria) this;
        }

        public Criteria andAnnotationIsNotNull() {
            addCriterion("annotation is not null");
            return (Criteria) this;
        }

        public Criteria andAnnotationEqualTo(String value) {
            addCriterion("annotation =", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationNotEqualTo(String value) {
            addCriterion("annotation <>", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationGreaterThan(String value) {
            addCriterion("annotation >", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationGreaterThanOrEqualTo(String value) {
            addCriterion("annotation >=", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationLessThan(String value) {
            addCriterion("annotation <", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationLessThanOrEqualTo(String value) {
            addCriterion("annotation <=", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationLike(String value) {
            addCriterion("annotation like", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationNotLike(String value) {
            addCriterion("annotation not like", value, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationIn(List<String> values) {
            addCriterion("annotation in", values, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationNotIn(List<String> values) {
            addCriterion("annotation not in", values, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationBetween(String value1, String value2) {
            addCriterion("annotation between", value1, value2, "annotation");
            return (Criteria) this;
        }

        public Criteria andAnnotationNotBetween(String value1, String value2) {
            addCriterion("annotation not between", value1, value2, "annotation");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalIsNull() {
            addCriterion("customerprincipal is null");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalIsNotNull() {
            addCriterion("customerprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalEqualTo(String value) {
            addCriterion("customerprincipal =", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalNotEqualTo(String value) {
            addCriterion("customerprincipal <>", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalGreaterThan(String value) {
            addCriterion("customerprincipal >", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("customerprincipal >=", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalLessThan(String value) {
            addCriterion("customerprincipal <", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalLessThanOrEqualTo(String value) {
            addCriterion("customerprincipal <=", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalLike(String value) {
            addCriterion("customerprincipal like", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalNotLike(String value) {
            addCriterion("customerprincipal not like", value, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalIn(List<String> values) {
            addCriterion("customerprincipal in", values, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalNotIn(List<String> values) {
            addCriterion("customerprincipal not in", values, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalBetween(String value1, String value2) {
            addCriterion("customerprincipal between", value1, value2, "customerprincipal");
            return (Criteria) this;
        }

        public Criteria andCustomerprincipalNotBetween(String value1, String value2) {
            addCriterion("customerprincipal not between", value1, value2, "customerprincipal");
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