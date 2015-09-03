package cn.com.bsfit.frms.portal.base.pojo;

import cn.com.bsfit.frms.portal.base.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public DeptExample() {
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

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNull() {
            addCriterion("DEPT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNotNull() {
            addCriterion("DEPT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelEqualTo(Short value) {
            addCriterion("DEPT_LEVEL =", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotEqualTo(Short value) {
            addCriterion("DEPT_LEVEL <>", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThan(Short value) {
            addCriterion("DEPT_LEVEL >", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPT_LEVEL >=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThan(Short value) {
            addCriterion("DEPT_LEVEL <", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThanOrEqualTo(Short value) {
            addCriterion("DEPT_LEVEL <=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIn(List<Short> values) {
            addCriterion("DEPT_LEVEL in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotIn(List<Short> values) {
            addCriterion("DEPT_LEVEL not in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelBetween(Short value1, Short value2) {
            addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotBetween(Short value1, Short value2) {
            addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdIsNull() {
            addCriterion("SUPER_DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdIsNotNull() {
            addCriterion("SUPER_DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdEqualTo(String value) {
            addCriterion("SUPER_DEPT_ID =", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdNotEqualTo(String value) {
            addCriterion("SUPER_DEPT_ID <>", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdGreaterThan(String value) {
            addCriterion("SUPER_DEPT_ID >", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPER_DEPT_ID >=", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdLessThan(String value) {
            addCriterion("SUPER_DEPT_ID <", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdLessThanOrEqualTo(String value) {
            addCriterion("SUPER_DEPT_ID <=", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdLike(String value) {
            addCriterion("SUPER_DEPT_ID like", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdNotLike(String value) {
            addCriterion("SUPER_DEPT_ID not like", value, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdIn(List<String> values) {
            addCriterion("SUPER_DEPT_ID in", values, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdNotIn(List<String> values) {
            addCriterion("SUPER_DEPT_ID not in", values, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdBetween(String value1, String value2) {
            addCriterion("SUPER_DEPT_ID between", value1, value2, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andSuperDeptIdNotBetween(String value1, String value2) {
            addCriterion("SUPER_DEPT_ID not between", value1, value2, "superDeptId");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelIsNull() {
            addCriterion("DISTRIBUTE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelIsNotNull() {
            addCriterion("DISTRIBUTE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelEqualTo(Short value) {
            addCriterion("DISTRIBUTE_LEVEL =", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelNotEqualTo(Short value) {
            addCriterion("DISTRIBUTE_LEVEL <>", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelGreaterThan(Short value) {
            addCriterion("DISTRIBUTE_LEVEL >", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("DISTRIBUTE_LEVEL >=", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelLessThan(Short value) {
            addCriterion("DISTRIBUTE_LEVEL <", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelLessThanOrEqualTo(Short value) {
            addCriterion("DISTRIBUTE_LEVEL <=", value, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelIn(List<Short> values) {
            addCriterion("DISTRIBUTE_LEVEL in", values, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelNotIn(List<Short> values) {
            addCriterion("DISTRIBUTE_LEVEL not in", values, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelBetween(Short value1, Short value2) {
            addCriterion("DISTRIBUTE_LEVEL between", value1, value2, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andDistributeLevelNotBetween(Short value1, Short value2) {
            addCriterion("DISTRIBUTE_LEVEL not between", value1, value2, "distributeLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelIsNull() {
            addCriterion("REVIEW_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andReviewLevelIsNotNull() {
            addCriterion("REVIEW_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andReviewLevelEqualTo(Short value) {
            addCriterion("REVIEW_LEVEL =", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotEqualTo(Short value) {
            addCriterion("REVIEW_LEVEL <>", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelGreaterThan(Short value) {
            addCriterion("REVIEW_LEVEL >", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("REVIEW_LEVEL >=", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelLessThan(Short value) {
            addCriterion("REVIEW_LEVEL <", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelLessThanOrEqualTo(Short value) {
            addCriterion("REVIEW_LEVEL <=", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelIn(List<Short> values) {
            addCriterion("REVIEW_LEVEL in", values, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotIn(List<Short> values) {
            addCriterion("REVIEW_LEVEL not in", values, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelBetween(Short value1, Short value2) {
            addCriterion("REVIEW_LEVEL between", value1, value2, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotBetween(Short value1, Short value2) {
            addCriterion("REVIEW_LEVEL not between", value1, value2, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNull() {
            addCriterion("PIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("PIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("PIC_NAME =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("PIC_NAME <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("PIC_NAME >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_NAME >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("PIC_NAME <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("PIC_NAME <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("PIC_NAME like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("PIC_NAME not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("PIC_NAME in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("PIC_NAME not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("PIC_NAME between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("PIC_NAME not between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionIsNull() {
            addCriterion("DEPT_DISCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionIsNotNull() {
            addCriterion("DEPT_DISCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionEqualTo(String value) {
            addCriterion("DEPT_DISCRIPTION =", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionNotEqualTo(String value) {
            addCriterion("DEPT_DISCRIPTION <>", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionGreaterThan(String value) {
            addCriterion("DEPT_DISCRIPTION >", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_DISCRIPTION >=", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionLessThan(String value) {
            addCriterion("DEPT_DISCRIPTION <", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("DEPT_DISCRIPTION <=", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionLike(String value) {
            addCriterion("DEPT_DISCRIPTION like", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionNotLike(String value) {
            addCriterion("DEPT_DISCRIPTION not like", value, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionIn(List<String> values) {
            addCriterion("DEPT_DISCRIPTION in", values, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionNotIn(List<String> values) {
            addCriterion("DEPT_DISCRIPTION not in", values, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionBetween(String value1, String value2) {
            addCriterion("DEPT_DISCRIPTION between", value1, value2, "deptDiscription");
            return (Criteria) this;
        }

        public Criteria andDeptDiscriptionNotBetween(String value1, String value2) {
            addCriterion("DEPT_DISCRIPTION not between", value1, value2, "deptDiscription");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andDeptIdLikeInsensitive(String value) {
            addCriterion("upper(DEPT_ID) like", value.toUpperCase(), "deptId");
            return this;
        }

        public Criteria andDeptNameLikeInsensitive(String value) {
            addCriterion("upper(DEPT_NAME) like", value.toUpperCase(), "deptName");
            return this;
        }

        public Criteria andSuperDeptIdLikeInsensitive(String value) {
            addCriterion("upper(SUPER_DEPT_ID) like", value.toUpperCase(), "superDeptId");
            return this;
        }

        public Criteria andPicNameLikeInsensitive(String value) {
            addCriterion("upper(PIC_NAME) like", value.toUpperCase(), "picName");
            return this;
        }

        public Criteria andContactLikeInsensitive(String value) {
            addCriterion("upper(CONTACT) like", value.toUpperCase(), "contact");
            return this;
        }

        public Criteria andDeptDiscriptionLikeInsensitive(String value) {
            addCriterion("upper(DEPT_DISCRIPTION) like", value.toUpperCase(), "deptDiscription");
            return this;
        }

        public Criteria andUpdateUserLikeInsensitive(String value) {
            addCriterion("upper(UPDATE_USER) like", value.toUpperCase(), "updateUser");
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