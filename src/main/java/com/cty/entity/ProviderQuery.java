package com.cty.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public ProviderQuery() {
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

        public Criteria andProCodeIsNull() {
            addCriterion("pro_code is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("pro_code is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("pro_code =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("pro_code <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("pro_code >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_code >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("pro_code <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("pro_code <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("pro_code like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("pro_code not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("pro_code in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("pro_code not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("pro_code between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("pro_code not between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("pro_desc is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("pro_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("pro_desc =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("pro_desc <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("pro_desc >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("pro_desc >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("pro_desc <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("pro_desc <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("pro_desc like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("pro_desc not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("pro_desc in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("pro_desc not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("pro_desc between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("pro_desc not between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProContactIsNull() {
            addCriterion("pro_contact is null");
            return (Criteria) this;
        }

        public Criteria andProContactIsNotNull() {
            addCriterion("pro_contact is not null");
            return (Criteria) this;
        }

        public Criteria andProContactEqualTo(String value) {
            addCriterion("pro_contact =", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotEqualTo(String value) {
            addCriterion("pro_contact <>", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactGreaterThan(String value) {
            addCriterion("pro_contact >", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactGreaterThanOrEqualTo(String value) {
            addCriterion("pro_contact >=", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLessThan(String value) {
            addCriterion("pro_contact <", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLessThanOrEqualTo(String value) {
            addCriterion("pro_contact <=", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactLike(String value) {
            addCriterion("pro_contact like", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotLike(String value) {
            addCriterion("pro_contact not like", value, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactIn(List<String> values) {
            addCriterion("pro_contact in", values, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotIn(List<String> values) {
            addCriterion("pro_contact not in", values, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactBetween(String value1, String value2) {
            addCriterion("pro_contact between", value1, value2, "proContact");
            return (Criteria) this;
        }

        public Criteria andProContactNotBetween(String value1, String value2) {
            addCriterion("pro_contact not between", value1, value2, "proContact");
            return (Criteria) this;
        }

        public Criteria andProPhoneIsNull() {
            addCriterion("pro_phone is null");
            return (Criteria) this;
        }

        public Criteria andProPhoneIsNotNull() {
            addCriterion("pro_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProPhoneEqualTo(String value) {
            addCriterion("pro_phone =", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotEqualTo(String value) {
            addCriterion("pro_phone <>", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneGreaterThan(String value) {
            addCriterion("pro_phone >", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pro_phone >=", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLessThan(String value) {
            addCriterion("pro_phone <", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLessThanOrEqualTo(String value) {
            addCriterion("pro_phone <=", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneLike(String value) {
            addCriterion("pro_phone like", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotLike(String value) {
            addCriterion("pro_phone not like", value, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneIn(List<String> values) {
            addCriterion("pro_phone in", values, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotIn(List<String> values) {
            addCriterion("pro_phone not in", values, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneBetween(String value1, String value2) {
            addCriterion("pro_phone between", value1, value2, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProPhoneNotBetween(String value1, String value2) {
            addCriterion("pro_phone not between", value1, value2, "proPhone");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNull() {
            addCriterion("pro_address is null");
            return (Criteria) this;
        }

        public Criteria andProAddressIsNotNull() {
            addCriterion("pro_address is not null");
            return (Criteria) this;
        }

        public Criteria andProAddressEqualTo(String value) {
            addCriterion("pro_address =", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotEqualTo(String value) {
            addCriterion("pro_address <>", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThan(String value) {
            addCriterion("pro_address >", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_address >=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThan(String value) {
            addCriterion("pro_address <", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLessThanOrEqualTo(String value) {
            addCriterion("pro_address <=", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressLike(String value) {
            addCriterion("pro_address like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotLike(String value) {
            addCriterion("pro_address not like", value, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressIn(List<String> values) {
            addCriterion("pro_address in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotIn(List<String> values) {
            addCriterion("pro_address not in", values, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressBetween(String value1, String value2) {
            addCriterion("pro_address between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProAddressNotBetween(String value1, String value2) {
            addCriterion("pro_address not between", value1, value2, "proAddress");
            return (Criteria) this;
        }

        public Criteria andProFaxIsNull() {
            addCriterion("pro_fax is null");
            return (Criteria) this;
        }

        public Criteria andProFaxIsNotNull() {
            addCriterion("pro_fax is not null");
            return (Criteria) this;
        }

        public Criteria andProFaxEqualTo(String value) {
            addCriterion("pro_fax =", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotEqualTo(String value) {
            addCriterion("pro_fax <>", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxGreaterThan(String value) {
            addCriterion("pro_fax >", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxGreaterThanOrEqualTo(String value) {
            addCriterion("pro_fax >=", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLessThan(String value) {
            addCriterion("pro_fax <", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLessThanOrEqualTo(String value) {
            addCriterion("pro_fax <=", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxLike(String value) {
            addCriterion("pro_fax like", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotLike(String value) {
            addCriterion("pro_fax not like", value, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxIn(List<String> values) {
            addCriterion("pro_fax in", values, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotIn(List<String> values) {
            addCriterion("pro_fax not in", values, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxBetween(String value1, String value2) {
            addCriterion("pro_fax between", value1, value2, "proFax");
            return (Criteria) this;
        }

        public Criteria andProFaxNotBetween(String value1, String value2) {
            addCriterion("pro_fax not between", value1, value2, "proFax");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("modifyBy not between", value1, value2, "modifyby");
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