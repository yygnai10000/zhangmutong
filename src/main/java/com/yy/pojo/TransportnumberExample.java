package com.yy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransportnumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransportnumberExample() {
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

        public Criteria andTransportidIsNull() {
            addCriterion("transportID is null");
            return (Criteria) this;
        }

        public Criteria andTransportidIsNotNull() {
            addCriterion("transportID is not null");
            return (Criteria) this;
        }

        public Criteria andTransportidEqualTo(String value) {
            addCriterion("transportID =", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotEqualTo(String value) {
            addCriterion("transportID <>", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidGreaterThan(String value) {
            addCriterion("transportID >", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidGreaterThanOrEqualTo(String value) {
            addCriterion("transportID >=", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidLessThan(String value) {
            addCriterion("transportID <", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidLessThanOrEqualTo(String value) {
            addCriterion("transportID <=", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidLike(String value) {
            addCriterion("transportID like", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotLike(String value) {
            addCriterion("transportID not like", value, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidIn(List<String> values) {
            addCriterion("transportID in", values, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotIn(List<String> values) {
            addCriterion("transportID not in", values, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidBetween(String value1, String value2) {
            addCriterion("transportID between", value1, value2, "transportid");
            return (Criteria) this;
        }

        public Criteria andTransportidNotBetween(String value1, String value2) {
            addCriterion("transportID not between", value1, value2, "transportid");
            return (Criteria) this;
        }

        public Criteria andCatnumberIsNull() {
            addCriterion("catNumber is null");
            return (Criteria) this;
        }

        public Criteria andCatnumberIsNotNull() {
            addCriterion("catNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCatnumberEqualTo(Integer value) {
            addCriterion("catNumber =", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberNotEqualTo(Integer value) {
            addCriterion("catNumber <>", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberGreaterThan(Integer value) {
            addCriterion("catNumber >", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("catNumber >=", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberLessThan(Integer value) {
            addCriterion("catNumber <", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberLessThanOrEqualTo(Integer value) {
            addCriterion("catNumber <=", value, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberIn(List<Integer> values) {
            addCriterion("catNumber in", values, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberNotIn(List<Integer> values) {
            addCriterion("catNumber not in", values, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberBetween(Integer value1, Integer value2) {
            addCriterion("catNumber between", value1, value2, "catnumber");
            return (Criteria) this;
        }

        public Criteria andCatnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("catNumber not between", value1, value2, "catnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeridIsNull() {
            addCriterion("employerId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeridIsNotNull() {
            addCriterion("employerId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeridEqualTo(Integer value) {
            addCriterion("employerId =", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotEqualTo(Integer value) {
            addCriterion("employerId <>", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridGreaterThan(Integer value) {
            addCriterion("employerId >", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("employerId >=", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridLessThan(Integer value) {
            addCriterion("employerId <", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridLessThanOrEqualTo(Integer value) {
            addCriterion("employerId <=", value, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridIn(List<Integer> values) {
            addCriterion("employerId in", values, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotIn(List<Integer> values) {
            addCriterion("employerId not in", values, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridBetween(Integer value1, Integer value2) {
            addCriterion("employerId between", value1, value2, "employerid");
            return (Criteria) this;
        }

        public Criteria andEmployeridNotBetween(Integer value1, Integer value2) {
            addCriterion("employerId not between", value1, value2, "employerid");
            return (Criteria) this;
        }

        public Criteria andCargonameIsNull() {
            addCriterion("cargoName is null");
            return (Criteria) this;
        }

        public Criteria andCargonameIsNotNull() {
            addCriterion("cargoName is not null");
            return (Criteria) this;
        }

        public Criteria andCargonameEqualTo(String value) {
            addCriterion("cargoName =", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameNotEqualTo(String value) {
            addCriterion("cargoName <>", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameGreaterThan(String value) {
            addCriterion("cargoName >", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameGreaterThanOrEqualTo(String value) {
            addCriterion("cargoName >=", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameLessThan(String value) {
            addCriterion("cargoName <", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameLessThanOrEqualTo(String value) {
            addCriterion("cargoName <=", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameLike(String value) {
            addCriterion("cargoName like", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameNotLike(String value) {
            addCriterion("cargoName not like", value, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameIn(List<String> values) {
            addCriterion("cargoName in", values, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameNotIn(List<String> values) {
            addCriterion("cargoName not in", values, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameBetween(String value1, String value2) {
            addCriterion("cargoName between", value1, value2, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargonameNotBetween(String value1, String value2) {
            addCriterion("cargoName not between", value1, value2, "cargoname");
            return (Criteria) this;
        }

        public Criteria andCargosizeIsNull() {
            addCriterion("cargosize is null");
            return (Criteria) this;
        }

        public Criteria andCargosizeIsNotNull() {
            addCriterion("cargosize is not null");
            return (Criteria) this;
        }

        public Criteria andCargosizeEqualTo(Integer value) {
            addCriterion("cargosize =", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeNotEqualTo(Integer value) {
            addCriterion("cargosize <>", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeGreaterThan(Integer value) {
            addCriterion("cargosize >", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cargosize >=", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeLessThan(Integer value) {
            addCriterion("cargosize <", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeLessThanOrEqualTo(Integer value) {
            addCriterion("cargosize <=", value, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeIn(List<Integer> values) {
            addCriterion("cargosize in", values, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeNotIn(List<Integer> values) {
            addCriterion("cargosize not in", values, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeBetween(Integer value1, Integer value2) {
            addCriterion("cargosize between", value1, value2, "cargosize");
            return (Criteria) this;
        }

        public Criteria andCargosizeNotBetween(Integer value1, Integer value2) {
            addCriterion("cargosize not between", value1, value2, "cargosize");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonIsNull() {
            addCriterion("fetchCargoPerson is null");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonIsNotNull() {
            addCriterion("fetchCargoPerson is not null");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonEqualTo(String value) {
            addCriterion("fetchCargoPerson =", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonNotEqualTo(String value) {
            addCriterion("fetchCargoPerson <>", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonGreaterThan(String value) {
            addCriterion("fetchCargoPerson >", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonGreaterThanOrEqualTo(String value) {
            addCriterion("fetchCargoPerson >=", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonLessThan(String value) {
            addCriterion("fetchCargoPerson <", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonLessThanOrEqualTo(String value) {
            addCriterion("fetchCargoPerson <=", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonLike(String value) {
            addCriterion("fetchCargoPerson like", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonNotLike(String value) {
            addCriterion("fetchCargoPerson not like", value, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonIn(List<String> values) {
            addCriterion("fetchCargoPerson in", values, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonNotIn(List<String> values) {
            addCriterion("fetchCargoPerson not in", values, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonBetween(String value1, String value2) {
            addCriterion("fetchCargoPerson between", value1, value2, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargopersonNotBetween(String value1, String value2) {
            addCriterion("fetchCargoPerson not between", value1, value2, "fetchcargoperson");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneIsNull() {
            addCriterion("fetchCargoPhone is null");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneIsNotNull() {
            addCriterion("fetchCargoPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneEqualTo(Integer value) {
            addCriterion("fetchCargoPhone =", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneNotEqualTo(Integer value) {
            addCriterion("fetchCargoPhone <>", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneGreaterThan(Integer value) {
            addCriterion("fetchCargoPhone >", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("fetchCargoPhone >=", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneLessThan(Integer value) {
            addCriterion("fetchCargoPhone <", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneLessThanOrEqualTo(Integer value) {
            addCriterion("fetchCargoPhone <=", value, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneIn(List<Integer> values) {
            addCriterion("fetchCargoPhone in", values, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneNotIn(List<Integer> values) {
            addCriterion("fetchCargoPhone not in", values, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneBetween(Integer value1, Integer value2) {
            addCriterion("fetchCargoPhone between", value1, value2, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargophoneNotBetween(Integer value1, Integer value2) {
            addCriterion("fetchCargoPhone not between", value1, value2, "fetchcargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonIsNull() {
            addCriterion("receiveCargoPerson is null");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonIsNotNull() {
            addCriterion("receiveCargoPerson is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonEqualTo(String value) {
            addCriterion("receiveCargoPerson =", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonNotEqualTo(String value) {
            addCriterion("receiveCargoPerson <>", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonGreaterThan(String value) {
            addCriterion("receiveCargoPerson >", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonGreaterThanOrEqualTo(String value) {
            addCriterion("receiveCargoPerson >=", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonLessThan(String value) {
            addCriterion("receiveCargoPerson <", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonLessThanOrEqualTo(String value) {
            addCriterion("receiveCargoPerson <=", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonLike(String value) {
            addCriterion("receiveCargoPerson like", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonNotLike(String value) {
            addCriterion("receiveCargoPerson not like", value, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonIn(List<String> values) {
            addCriterion("receiveCargoPerson in", values, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonNotIn(List<String> values) {
            addCriterion("receiveCargoPerson not in", values, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonBetween(String value1, String value2) {
            addCriterion("receiveCargoPerson between", value1, value2, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargopersonNotBetween(String value1, String value2) {
            addCriterion("receiveCargoPerson not between", value1, value2, "receivecargoperson");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneIsNull() {
            addCriterion("receiveCargoPhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneIsNotNull() {
            addCriterion("receiveCargoPhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneEqualTo(Integer value) {
            addCriterion("receiveCargoPhone =", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneNotEqualTo(Integer value) {
            addCriterion("receiveCargoPhone <>", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneGreaterThan(Integer value) {
            addCriterion("receiveCargoPhone >", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveCargoPhone >=", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneLessThan(Integer value) {
            addCriterion("receiveCargoPhone <", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneLessThanOrEqualTo(Integer value) {
            addCriterion("receiveCargoPhone <=", value, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneIn(List<Integer> values) {
            addCriterion("receiveCargoPhone in", values, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneNotIn(List<Integer> values) {
            addCriterion("receiveCargoPhone not in", values, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneBetween(Integer value1, Integer value2) {
            addCriterion("receiveCargoPhone between", value1, value2, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andReceivecargophoneNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveCargoPhone not between", value1, value2, "receivecargophone");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressIsNull() {
            addCriterion("fetchCargoAddress is null");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressIsNotNull() {
            addCriterion("fetchCargoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressEqualTo(String value) {
            addCriterion("fetchCargoAddress =", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressNotEqualTo(String value) {
            addCriterion("fetchCargoAddress <>", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressGreaterThan(String value) {
            addCriterion("fetchCargoAddress >", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fetchCargoAddress >=", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressLessThan(String value) {
            addCriterion("fetchCargoAddress <", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressLessThanOrEqualTo(String value) {
            addCriterion("fetchCargoAddress <=", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressLike(String value) {
            addCriterion("fetchCargoAddress like", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressNotLike(String value) {
            addCriterion("fetchCargoAddress not like", value, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressIn(List<String> values) {
            addCriterion("fetchCargoAddress in", values, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressNotIn(List<String> values) {
            addCriterion("fetchCargoAddress not in", values, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressBetween(String value1, String value2) {
            addCriterion("fetchCargoAddress between", value1, value2, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andFetchcargoaddressNotBetween(String value1, String value2) {
            addCriterion("fetchCargoAddress not between", value1, value2, "fetchcargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressIsNull() {
            addCriterion("receiveCargoAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressIsNotNull() {
            addCriterion("receiveCargoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressEqualTo(String value) {
            addCriterion("receiveCargoAddress =", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressNotEqualTo(String value) {
            addCriterion("receiveCargoAddress <>", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressGreaterThan(String value) {
            addCriterion("receiveCargoAddress >", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiveCargoAddress >=", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressLessThan(String value) {
            addCriterion("receiveCargoAddress <", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressLessThanOrEqualTo(String value) {
            addCriterion("receiveCargoAddress <=", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressLike(String value) {
            addCriterion("receiveCargoAddress like", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressNotLike(String value) {
            addCriterion("receiveCargoAddress not like", value, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressIn(List<String> values) {
            addCriterion("receiveCargoAddress in", values, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressNotIn(List<String> values) {
            addCriterion("receiveCargoAddress not in", values, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressBetween(String value1, String value2) {
            addCriterion("receiveCargoAddress between", value1, value2, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andReceivecargoaddressNotBetween(String value1, String value2) {
            addCriterion("receiveCargoAddress not between", value1, value2, "receivecargoaddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusmsgIsNull() {
            addCriterion("statusMsg is null");
            return (Criteria) this;
        }

        public Criteria andStatusmsgIsNotNull() {
            addCriterion("statusMsg is not null");
            return (Criteria) this;
        }

        public Criteria andStatusmsgEqualTo(String value) {
            addCriterion("statusMsg =", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgNotEqualTo(String value) {
            addCriterion("statusMsg <>", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgGreaterThan(String value) {
            addCriterion("statusMsg >", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgGreaterThanOrEqualTo(String value) {
            addCriterion("statusMsg >=", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgLessThan(String value) {
            addCriterion("statusMsg <", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgLessThanOrEqualTo(String value) {
            addCriterion("statusMsg <=", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgLike(String value) {
            addCriterion("statusMsg like", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgNotLike(String value) {
            addCriterion("statusMsg not like", value, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgIn(List<String> values) {
            addCriterion("statusMsg in", values, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgNotIn(List<String> values) {
            addCriterion("statusMsg not in", values, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgBetween(String value1, String value2) {
            addCriterion("statusMsg between", value1, value2, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andStatusmsgNotBetween(String value1, String value2) {
            addCriterion("statusMsg not between", value1, value2, "statusmsg");
            return (Criteria) this;
        }

        public Criteria andClearingstatusIsNull() {
            addCriterion("clearingStatus is null");
            return (Criteria) this;
        }

        public Criteria andClearingstatusIsNotNull() {
            addCriterion("clearingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andClearingstatusEqualTo(Integer value) {
            addCriterion("clearingStatus =", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusNotEqualTo(Integer value) {
            addCriterion("clearingStatus <>", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusGreaterThan(Integer value) {
            addCriterion("clearingStatus >", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("clearingStatus >=", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusLessThan(Integer value) {
            addCriterion("clearingStatus <", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusLessThanOrEqualTo(Integer value) {
            addCriterion("clearingStatus <=", value, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusIn(List<Integer> values) {
            addCriterion("clearingStatus in", values, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusNotIn(List<Integer> values) {
            addCriterion("clearingStatus not in", values, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusBetween(Integer value1, Integer value2) {
            addCriterion("clearingStatus between", value1, value2, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("clearingStatus not between", value1, value2, "clearingstatus");
            return (Criteria) this;
        }

        public Criteria andClearingmsgIsNull() {
            addCriterion("clearingMsg is null");
            return (Criteria) this;
        }

        public Criteria andClearingmsgIsNotNull() {
            addCriterion("clearingMsg is not null");
            return (Criteria) this;
        }

        public Criteria andClearingmsgEqualTo(String value) {
            addCriterion("clearingMsg =", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgNotEqualTo(String value) {
            addCriterion("clearingMsg <>", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgGreaterThan(String value) {
            addCriterion("clearingMsg >", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgGreaterThanOrEqualTo(String value) {
            addCriterion("clearingMsg >=", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgLessThan(String value) {
            addCriterion("clearingMsg <", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgLessThanOrEqualTo(String value) {
            addCriterion("clearingMsg <=", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgLike(String value) {
            addCriterion("clearingMsg like", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgNotLike(String value) {
            addCriterion("clearingMsg not like", value, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgIn(List<String> values) {
            addCriterion("clearingMsg in", values, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgNotIn(List<String> values) {
            addCriterion("clearingMsg not in", values, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgBetween(String value1, String value2) {
            addCriterion("clearingMsg between", value1, value2, "clearingmsg");
            return (Criteria) this;
        }

        public Criteria andClearingmsgNotBetween(String value1, String value2) {
            addCriterion("clearingMsg not between", value1, value2, "clearingmsg");
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