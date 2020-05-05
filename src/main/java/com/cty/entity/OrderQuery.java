package com.cty.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public OrderQuery() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("product_unit is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("product_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("product_unit =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("product_unit <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("product_unit >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("product_unit >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("product_unit <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("product_unit <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("product_unit like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("product_unit not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("product_unit in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("product_unit not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("product_unit between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("product_unit not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(BigDecimal value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(BigDecimal value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(BigDecimal value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(BigDecimal value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<BigDecimal> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<BigDecimal> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNull() {
            addCriterion("is_payment is null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNotNull() {
            addCriterion("is_payment is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentEqualTo(Integer value) {
            addCriterion("is_payment =", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotEqualTo(Integer value) {
            addCriterion("is_payment <>", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThan(Integer value) {
            addCriterion("is_payment >", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_payment >=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThan(Integer value) {
            addCriterion("is_payment <", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("is_payment <=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIn(List<Integer> values) {
            addCriterion("is_payment in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotIn(List<Integer> values) {
            addCriterion("is_payment not in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentBetween(Integer value1, Integer value2) {
            addCriterion("is_payment between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_payment not between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andSalerIsNull() {
            addCriterion("saler is null");
            return (Criteria) this;
        }

        public Criteria andSalerIsNotNull() {
            addCriterion("saler is not null");
            return (Criteria) this;
        }

        public Criteria andSalerEqualTo(String value) {
            addCriterion("saler =", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerNotEqualTo(String value) {
            addCriterion("saler <>", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerGreaterThan(String value) {
            addCriterion("saler >", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerGreaterThanOrEqualTo(String value) {
            addCriterion("saler >=", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerLessThan(String value) {
            addCriterion("saler <", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerLessThanOrEqualTo(String value) {
            addCriterion("saler <=", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerLike(String value) {
            addCriterion("saler like", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerNotLike(String value) {
            addCriterion("saler not like", value, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerIn(List<String> values) {
            addCriterion("saler in", values, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerNotIn(List<String> values) {
            addCriterion("saler not in", values, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerBetween(String value1, String value2) {
            addCriterion("saler between", value1, value2, "saler");
            return (Criteria) this;
        }

        public Criteria andSalerNotBetween(String value1, String value2) {
            addCriterion("saler not between", value1, value2, "saler");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNull() {
            addCriterion("provider_id is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(Long value) {
            addCriterion("provider_id =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(Long value) {
            addCriterion("provider_id <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(Long value) {
            addCriterion("provider_id >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("provider_id >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(Long value) {
            addCriterion("provider_id <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(Long value) {
            addCriterion("provider_id <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<Long> values) {
            addCriterion("provider_id in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<Long> values) {
            addCriterion("provider_id not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(Long value1, Long value2) {
            addCriterion("provider_id between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(Long value1, Long value2) {
            addCriterion("provider_id not between", value1, value2, "providerId");
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