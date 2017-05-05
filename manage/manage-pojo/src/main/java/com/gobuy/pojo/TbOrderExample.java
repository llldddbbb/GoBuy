package com.gobuy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_typeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeLessThan(Integer value) {
            addCriterion("payment_type <", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPayment_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "payment_type");
            return (Criteria) this;
        }

        public Criteria andPost_feeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPost_feeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPost_feeEqualTo(String value) {
            addCriterion("post_fee =", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotEqualTo(String value) {
            addCriterion("post_fee <>", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeGreaterThan(String value) {
            addCriterion("post_fee >", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeGreaterThanOrEqualTo(String value) {
            addCriterion("post_fee >=", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeLessThan(String value) {
            addCriterion("post_fee <", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeLessThanOrEqualTo(String value) {
            addCriterion("post_fee <=", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeLike(String value) {
            addCriterion("post_fee like", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotLike(String value) {
            addCriterion("post_fee not like", value, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeIn(List<String> values) {
            addCriterion("post_fee in", values, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotIn(List<String> values) {
            addCriterion("post_fee not in", values, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeBetween(String value1, String value2) {
            addCriterion("post_fee between", value1, value2, "post_fee");
            return (Criteria) this;
        }

        public Criteria andPost_feeNotBetween(String value1, String value2) {
            addCriterion("post_fee not between", value1, value2, "post_fee");
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

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeEqualTo(Date value) {
            addCriterion("payment_time =", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThan(Date value) {
            addCriterion("payment_time <", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIn(List<Date> values) {
            addCriterion("payment_time in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeIsNull() {
            addCriterion("consign_time is null");
            return (Criteria) this;
        }

        public Criteria andConsign_timeIsNotNull() {
            addCriterion("consign_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsign_timeEqualTo(Date value) {
            addCriterion("consign_time =", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotEqualTo(Date value) {
            addCriterion("consign_time <>", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeGreaterThan(Date value) {
            addCriterion("consign_time >", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("consign_time >=", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeLessThan(Date value) {
            addCriterion("consign_time <", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeLessThanOrEqualTo(Date value) {
            addCriterion("consign_time <=", value, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeIn(List<Date> values) {
            addCriterion("consign_time in", values, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotIn(List<Date> values) {
            addCriterion("consign_time not in", values, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeBetween(Date value1, Date value2) {
            addCriterion("consign_time between", value1, value2, "consign_time");
            return (Criteria) this;
        }

        public Criteria andConsign_timeNotBetween(Date value1, Date value2) {
            addCriterion("consign_time not between", value1, value2, "consign_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andClose_timeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andClose_timeEqualTo(Date value) {
            addCriterion("close_time =", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeGreaterThan(Date value) {
            addCriterion("close_time >", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeLessThan(Date value) {
            addCriterion("close_time <", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeIn(List<Date> values) {
            addCriterion("close_time in", values, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "close_time");
            return (Criteria) this;
        }

        public Criteria andClose_timeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "close_time");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_nameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThan(String value) {
            addCriterion("shipping_name <", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameLike(String value) {
            addCriterion("shipping_name like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_nameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shipping_name");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_codeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeLessThan(String value) {
            addCriterion("shipping_code <", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeLike(String value) {
            addCriterion("shipping_code like", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andShipping_codeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shipping_code");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Long value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Long value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Long value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Long> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageLike(String value) {
            addCriterion("buyer_message like", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_messageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyer_message");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIsNull() {
            addCriterion("buyer_nick is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIsNotNull() {
            addCriterion("buyer_nick is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickEqualTo(String value) {
            addCriterion("buyer_nick =", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotEqualTo(String value) {
            addCriterion("buyer_nick <>", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickGreaterThan(String value) {
            addCriterion("buyer_nick >", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nick >=", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLessThan(String value) {
            addCriterion("buyer_nick <", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLessThanOrEqualTo(String value) {
            addCriterion("buyer_nick <=", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickLike(String value) {
            addCriterion("buyer_nick like", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotLike(String value) {
            addCriterion("buyer_nick not like", value, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickIn(List<String> values) {
            addCriterion("buyer_nick in", values, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotIn(List<String> values) {
            addCriterion("buyer_nick not in", values, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickBetween(String value1, String value2) {
            addCriterion("buyer_nick between", value1, value2, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_nickNotBetween(String value1, String value2) {
            addCriterion("buyer_nick not between", value1, value2, "buyer_nick");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIsNull() {
            addCriterion("buyer_rate is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIsNotNull() {
            addCriterion("buyer_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateEqualTo(Integer value) {
            addCriterion("buyer_rate =", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotEqualTo(Integer value) {
            addCriterion("buyer_rate <>", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateGreaterThan(Integer value) {
            addCriterion("buyer_rate >", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_rate >=", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLessThan(Integer value) {
            addCriterion("buyer_rate <", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_rate <=", value, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateIn(List<Integer> values) {
            addCriterion("buyer_rate in", values, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotIn(List<Integer> values) {
            addCriterion("buyer_rate not in", values, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateBetween(Integer value1, Integer value2) {
            addCriterion("buyer_rate between", value1, value2, "buyer_rate");
            return (Criteria) this;
        }

        public Criteria andBuyer_rateNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_rate not between", value1, value2, "buyer_rate");
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