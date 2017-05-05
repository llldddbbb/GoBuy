package com.gobuy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderShippingExample() {
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

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(String value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(String value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(String value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(String value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLike(String value) {
            addCriterion("order_id like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotLike(String value) {
            addCriterion("order_id not like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<String> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<String> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLike(String value) {
            addCriterion("receiver_name like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_mobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiver_mobile");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateIsNull() {
            addCriterion("receiver_state is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateIsNotNull() {
            addCriterion("receiver_state is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateEqualTo(String value) {
            addCriterion("receiver_state =", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateNotEqualTo(String value) {
            addCriterion("receiver_state <>", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateGreaterThan(String value) {
            addCriterion("receiver_state >", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_state >=", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateLessThan(String value) {
            addCriterion("receiver_state <", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateLessThanOrEqualTo(String value) {
            addCriterion("receiver_state <=", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateLike(String value) {
            addCriterion("receiver_state like", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateNotLike(String value) {
            addCriterion("receiver_state not like", value, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateIn(List<String> values) {
            addCriterion("receiver_state in", values, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateNotIn(List<String> values) {
            addCriterion("receiver_state not in", values, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateBetween(String value1, String value2) {
            addCriterion("receiver_state between", value1, value2, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_stateNotBetween(String value1, String value2) {
            addCriterion("receiver_state not between", value1, value2, "receiver_state");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLike(String value) {
            addCriterion("receiver_city like", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtIsNull() {
            addCriterion("receiver_district is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtIsNotNull() {
            addCriterion("receiver_district is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtEqualTo(String value) {
            addCriterion("receiver_district =", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtNotEqualTo(String value) {
            addCriterion("receiver_district <>", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtGreaterThan(String value) {
            addCriterion("receiver_district >", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_district >=", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtLessThan(String value) {
            addCriterion("receiver_district <", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtLessThanOrEqualTo(String value) {
            addCriterion("receiver_district <=", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtLike(String value) {
            addCriterion("receiver_district like", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtNotLike(String value) {
            addCriterion("receiver_district not like", value, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtIn(List<String> values) {
            addCriterion("receiver_district in", values, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtNotIn(List<String> values) {
            addCriterion("receiver_district not in", values, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtBetween(String value1, String value2) {
            addCriterion("receiver_district between", value1, value2, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_districtNotBetween(String value1, String value2) {
            addCriterion("receiver_district not between", value1, value2, "receiver_district");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLike(String value) {
            addCriterion("receiver_address like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipIsNull() {
            addCriterion("receiver_zip is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipIsNotNull() {
            addCriterion("receiver_zip is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipEqualTo(String value) {
            addCriterion("receiver_zip =", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipNotEqualTo(String value) {
            addCriterion("receiver_zip <>", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipGreaterThan(String value) {
            addCriterion("receiver_zip >", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_zip >=", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipLessThan(String value) {
            addCriterion("receiver_zip <", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipLessThanOrEqualTo(String value) {
            addCriterion("receiver_zip <=", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipLike(String value) {
            addCriterion("receiver_zip like", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipNotLike(String value) {
            addCriterion("receiver_zip not like", value, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipIn(List<String> values) {
            addCriterion("receiver_zip in", values, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipNotIn(List<String> values) {
            addCriterion("receiver_zip not in", values, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipBetween(String value1, String value2) {
            addCriterion("receiver_zip between", value1, value2, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andReceiver_zipNotBetween(String value1, String value2) {
            addCriterion("receiver_zip not between", value1, value2, "receiver_zip");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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