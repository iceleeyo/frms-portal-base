package cn.com.bsfit.frms.portal.base.pojo;

import cn.com.bsfit.frms.portal.base.util.Page;
import java.util.ArrayList;
import java.util.List;

public class AssignDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AssignDeptExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIsNull() {
            addCriterion("ASSIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIsNotNull() {
            addCriterion("ASSIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeEqualTo(String value) {
            addCriterion("ASSIGN_TYPE =", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotEqualTo(String value) {
            addCriterion("ASSIGN_TYPE <>", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThan(String value) {
            addCriterion("ASSIGN_TYPE >", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TYPE >=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThan(String value) {
            addCriterion("ASSIGN_TYPE <", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TYPE <=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLike(String value) {
            addCriterion("ASSIGN_TYPE like", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotLike(String value) {
            addCriterion("ASSIGN_TYPE not like", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIn(List<String> values) {
            addCriterion("ASSIGN_TYPE in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotIn(List<String> values) {
            addCriterion("ASSIGN_TYPE not in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeBetween(String value1, String value2) {
            addCriterion("ASSIGN_TYPE between", value1, value2, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_TYPE not between", value1, value2, "assignType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andAssignTypeLikeInsensitive(String value) {
            addCriterion("upper(ASSIGN_TYPE) like", value.toUpperCase(), "assignType");
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