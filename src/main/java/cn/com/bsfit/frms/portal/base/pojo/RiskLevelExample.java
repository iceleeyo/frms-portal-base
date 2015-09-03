package cn.com.bsfit.frms.portal.base.pojo;

import cn.com.bsfit.frms.portal.base.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public RiskLevelExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLevelValIsNull() {
            addCriterion("LEVEL_VAL is null");
            return (Criteria) this;
        }

        public Criteria andLevelValIsNotNull() {
            addCriterion("LEVEL_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelValEqualTo(Long value) {
            addCriterion("LEVEL_VAL =", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValNotEqualTo(Long value) {
            addCriterion("LEVEL_VAL <>", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValGreaterThan(Long value) {
            addCriterion("LEVEL_VAL >", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValGreaterThanOrEqualTo(Long value) {
            addCriterion("LEVEL_VAL >=", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValLessThan(Long value) {
            addCriterion("LEVEL_VAL <", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValLessThanOrEqualTo(Long value) {
            addCriterion("LEVEL_VAL <=", value, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValIn(List<Long> values) {
            addCriterion("LEVEL_VAL in", values, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValNotIn(List<Long> values) {
            addCriterion("LEVEL_VAL not in", values, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValBetween(Long value1, Long value2) {
            addCriterion("LEVEL_VAL between", value1, value2, "levelVal");
            return (Criteria) this;
        }

        public Criteria andLevelValNotBetween(Long value1, Long value2) {
            addCriterion("LEVEL_VAL not between", value1, value2, "levelVal");
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

        public Criteria andReadonlyIsNull() {
            addCriterion("READONLY is null");
            return (Criteria) this;
        }

        public Criteria andReadonlyIsNotNull() {
            addCriterion("READONLY is not null");
            return (Criteria) this;
        }

        public Criteria andReadonlyEqualTo(Short value) {
            addCriterion("READONLY =", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyNotEqualTo(Short value) {
            addCriterion("READONLY <>", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyGreaterThan(Short value) {
            addCriterion("READONLY >", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyGreaterThanOrEqualTo(Short value) {
            addCriterion("READONLY >=", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyLessThan(Short value) {
            addCriterion("READONLY <", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyLessThanOrEqualTo(Short value) {
            addCriterion("READONLY <=", value, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyIn(List<Short> values) {
            addCriterion("READONLY in", values, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyNotIn(List<Short> values) {
            addCriterion("READONLY not in", values, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyBetween(Short value1, Short value2) {
            addCriterion("READONLY between", value1, value2, "readonly");
            return (Criteria) this;
        }

        public Criteria andReadonlyNotBetween(Short value1, Short value2) {
            addCriterion("READONLY not between", value1, value2, "readonly");
            return (Criteria) this;
        }

        public Criteria andLevelMinIsNull() {
            addCriterion("LEVEL_MIN is null");
            return (Criteria) this;
        }

        public Criteria andLevelMinIsNotNull() {
            addCriterion("LEVEL_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andLevelMinEqualTo(Integer value) {
            addCriterion("LEVEL_MIN =", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinNotEqualTo(Integer value) {
            addCriterion("LEVEL_MIN <>", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinGreaterThan(Integer value) {
            addCriterion("LEVEL_MIN >", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_MIN >=", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinLessThan(Integer value) {
            addCriterion("LEVEL_MIN <", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_MIN <=", value, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinIn(List<Integer> values) {
            addCriterion("LEVEL_MIN in", values, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinNotIn(List<Integer> values) {
            addCriterion("LEVEL_MIN not in", values, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_MIN between", value1, value2, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMinNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_MIN not between", value1, value2, "levelMin");
            return (Criteria) this;
        }

        public Criteria andLevelMaxIsNull() {
            addCriterion("LEVEL_MAX is null");
            return (Criteria) this;
        }

        public Criteria andLevelMaxIsNotNull() {
            addCriterion("LEVEL_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andLevelMaxEqualTo(Integer value) {
            addCriterion("LEVEL_MAX =", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxNotEqualTo(Integer value) {
            addCriterion("LEVEL_MAX <>", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxGreaterThan(Integer value) {
            addCriterion("LEVEL_MAX >", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_MAX >=", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxLessThan(Integer value) {
            addCriterion("LEVEL_MAX <", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_MAX <=", value, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxIn(List<Integer> values) {
            addCriterion("LEVEL_MAX in", values, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxNotIn(List<Integer> values) {
            addCriterion("LEVEL_MAX not in", values, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_MAX between", value1, value2, "levelMax");
            return (Criteria) this;
        }

        public Criteria andLevelMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_MAX not between", value1, value2, "levelMax");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Short value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Short value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Short value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Short value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Short value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Short value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Short> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Short> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Short value1, Short value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Short value1, Short value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
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