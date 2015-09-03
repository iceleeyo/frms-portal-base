package cn.com.bsfit.frms.portal.base.pojo;

import cn.com.bsfit.frms.portal.base.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public CurrencyCodeExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andLetterCodeIsNull() {
            addCriterion("LETTER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLetterCodeIsNotNull() {
            addCriterion("LETTER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLetterCodeEqualTo(String value) {
            addCriterion("LETTER_CODE =", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotEqualTo(String value) {
            addCriterion("LETTER_CODE <>", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeGreaterThan(String value) {
            addCriterion("LETTER_CODE >", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LETTER_CODE >=", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLessThan(String value) {
            addCriterion("LETTER_CODE <", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLessThanOrEqualTo(String value) {
            addCriterion("LETTER_CODE <=", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLike(String value) {
            addCriterion("LETTER_CODE like", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotLike(String value) {
            addCriterion("LETTER_CODE not like", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeIn(List<String> values) {
            addCriterion("LETTER_CODE in", values, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotIn(List<String> values) {
            addCriterion("LETTER_CODE not in", values, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeBetween(String value1, String value2) {
            addCriterion("LETTER_CODE between", value1, value2, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotBetween(String value1, String value2) {
            addCriterion("LETTER_CODE not between", value1, value2, "letterCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeIsNull() {
            addCriterion("DIGITAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeIsNotNull() {
            addCriterion("DIGITAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeEqualTo(String value) {
            addCriterion("DIGITAL_CODE =", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeNotEqualTo(String value) {
            addCriterion("DIGITAL_CODE <>", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeGreaterThan(String value) {
            addCriterion("DIGITAL_CODE >", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DIGITAL_CODE >=", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeLessThan(String value) {
            addCriterion("DIGITAL_CODE <", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeLessThanOrEqualTo(String value) {
            addCriterion("DIGITAL_CODE <=", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeLike(String value) {
            addCriterion("DIGITAL_CODE like", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeNotLike(String value) {
            addCriterion("DIGITAL_CODE not like", value, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeIn(List<String> values) {
            addCriterion("DIGITAL_CODE in", values, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeNotIn(List<String> values) {
            addCriterion("DIGITAL_CODE not in", values, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeBetween(String value1, String value2) {
            addCriterion("DIGITAL_CODE between", value1, value2, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andDigitalCodeNotBetween(String value1, String value2) {
            addCriterion("DIGITAL_CODE not between", value1, value2, "digitalCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andModiferIsNull() {
            addCriterion("MODIFER is null");
            return (Criteria) this;
        }

        public Criteria andModiferIsNotNull() {
            addCriterion("MODIFER is not null");
            return (Criteria) this;
        }

        public Criteria andModiferEqualTo(String value) {
            addCriterion("MODIFER =", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferNotEqualTo(String value) {
            addCriterion("MODIFER <>", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferGreaterThan(String value) {
            addCriterion("MODIFER >", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFER >=", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferLessThan(String value) {
            addCriterion("MODIFER <", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferLessThanOrEqualTo(String value) {
            addCriterion("MODIFER <=", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferLike(String value) {
            addCriterion("MODIFER like", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferNotLike(String value) {
            addCriterion("MODIFER not like", value, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferIn(List<String> values) {
            addCriterion("MODIFER in", values, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferNotIn(List<String> values) {
            addCriterion("MODIFER not in", values, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferBetween(String value1, String value2) {
            addCriterion("MODIFER between", value1, value2, "modifer");
            return (Criteria) this;
        }

        public Criteria andModiferNotBetween(String value1, String value2) {
            addCriterion("MODIFER not between", value1, value2, "modifer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andLetterCodeLikeInsensitive(String value) {
            addCriterion("upper(LETTER_CODE) like", value.toUpperCase(), "letterCode");
            return this;
        }

        public Criteria andDigitalCodeLikeInsensitive(String value) {
            addCriterion("upper(DIGITAL_CODE) like", value.toUpperCase(), "digitalCode");
            return this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return this;
        }

        public Criteria andModiferLikeInsensitive(String value) {
            addCriterion("upper(MODIFER) like", value.toUpperCase(), "modifer");
            return this;
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