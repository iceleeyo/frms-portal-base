package cn.com.bsfit.frms.portal.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourcesExample {

	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;
	
	public ResourcesExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andParentIdIsNull() {
			addCriterion("PARENT_ID is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("PARENT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("PARENT_ID =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("PARENT_ID <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("PARENT_ID >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("PARENT_ID >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("PARENT_ID <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("PARENT_ID <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("PARENT_ID in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("PARENT_ID not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("PARENT_ID between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("PARENT_ID not between", value1, value2, "parentId");
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

		public Criteria andResourceNameIsNull() {
			addCriterion("RESOURCE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andResourceNameIsNotNull() {
			addCriterion("RESOURCE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andResourceNameEqualTo(String value) {
			addCriterion("RESOURCE_NAME =", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotEqualTo(String value) {
			addCriterion("RESOURCE_NAME <>", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameGreaterThan(String value) {
			addCriterion("RESOURCE_NAME >", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
			addCriterion("RESOURCE_NAME >=", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLessThan(String value) {
			addCriterion("RESOURCE_NAME <", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLessThanOrEqualTo(String value) {
			addCriterion("RESOURCE_NAME <=", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLike(String value) {
			addCriterion("RESOURCE_NAME like", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotLike(String value) {
			addCriterion("RESOURCE_NAME not like", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameIn(List<String> values) {
			addCriterion("RESOURCE_NAME in", values, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotIn(List<String> values) {
			addCriterion("RESOURCE_NAME not in", values, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameBetween(String value1, String value2) {
			addCriterion("RESOURCE_NAME between", value1, value2,
					"resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotBetween(String value1, String value2) {
			addCriterion("RESOURCE_NAME not between", value1, value2,
					"resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceLevelIsNull() {
			addCriterion("RESOURCE_LEVEL is null");
			return (Criteria) this;
		}

		public Criteria andResourceLevelIsNotNull() {
			addCriterion("RESOURCE_LEVEL is not null");
			return (Criteria) this;
		}

		public Criteria andResourceLevelEqualTo(Integer value) {
			addCriterion("RESOURCE_LEVEL =", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelNotEqualTo(Integer value) {
			addCriterion("RESOURCE_LEVEL <>", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelGreaterThan(Integer value) {
			addCriterion("RESOURCE_LEVEL >", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("RESOURCE_LEVEL >=", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelLessThan(Integer value) {
			addCriterion("RESOURCE_LEVEL <", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelLessThanOrEqualTo(Integer value) {
			addCriterion("RESOURCE_LEVEL <=", value, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelIn(List<Integer> values) {
			addCriterion("RESOURCE_LEVEL in", values, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelNotIn(List<Integer> values) {
			addCriterion("RESOURCE_LEVEL not in", values, "resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelBetween(Integer value1, Integer value2) {
			addCriterion("RESOURCE_LEVEL between", value1, value2,
					"resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceLevelNotBetween(Integer value1,
				Integer value2) {
			addCriterion("RESOURCE_LEVEL not between", value1, value2,
					"resourceLevel");
			return (Criteria) this;
		}

		public Criteria andResourceTypeIsNull() {
			addCriterion("RESOURCE_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andResourceTypeIsNotNull() {
			addCriterion("RESOURCE_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andResourceTypeEqualTo(Integer value) {
			addCriterion("RESOURCE_TYPE =", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeNotEqualTo(Integer value) {
			addCriterion("RESOURCE_TYPE <>", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeGreaterThan(Integer value) {
			addCriterion("RESOURCE_TYPE >", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("RESOURCE_TYPE >=", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeLessThan(Integer value) {
			addCriterion("RESOURCE_TYPE <", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
			addCriterion("RESOURCE_TYPE <=", value, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeIn(List<Integer> values) {
			addCriterion("RESOURCE_TYPE in", values, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeNotIn(List<Integer> values) {
			addCriterion("RESOURCE_TYPE not in", values, "resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
			addCriterion("RESOURCE_TYPE between", value1, value2,
					"resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("RESOURCE_TYPE not between", value1, value2,
					"resourceType");
			return (Criteria) this;
		}

		public Criteria andResourceDescIsNull() {
			addCriterion("RESOURCE_DESC is null");
			return (Criteria) this;
		}

		public Criteria andResourceDescIsNotNull() {
			addCriterion("RESOURCE_DESC is not null");
			return (Criteria) this;
		}

		public Criteria andResourceDescEqualTo(String value) {
			addCriterion("RESOURCE_DESC =", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescNotEqualTo(String value) {
			addCriterion("RESOURCE_DESC <>", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescGreaterThan(String value) {
			addCriterion("RESOURCE_DESC >", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescGreaterThanOrEqualTo(String value) {
			addCriterion("RESOURCE_DESC >=", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescLessThan(String value) {
			addCriterion("RESOURCE_DESC <", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescLessThanOrEqualTo(String value) {
			addCriterion("RESOURCE_DESC <=", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescLike(String value) {
			addCriterion("RESOURCE_DESC like", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescNotLike(String value) {
			addCriterion("RESOURCE_DESC not like", value, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescIn(List<String> values) {
			addCriterion("RESOURCE_DESC in", values, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescNotIn(List<String> values) {
			addCriterion("RESOURCE_DESC not in", values, "resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescBetween(String value1, String value2) {
			addCriterion("RESOURCE_DESC between", value1, value2,
					"resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceDescNotBetween(String value1, String value2) {
			addCriterion("RESOURCE_DESC not between", value1, value2,
					"resourceDesc");
			return (Criteria) this;
		}

		public Criteria andResourceCodeIsNull() {
			addCriterion("RESOURCE_CODE is null");
			return (Criteria) this;
		}

		public Criteria andResourceCodeIsNotNull() {
			addCriterion("RESOURCE_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andResourceCodeEqualTo(String value) {
			addCriterion("RESOURCE_CODE =", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeNotEqualTo(String value) {
			addCriterion("RESOURCE_CODE <>", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeGreaterThan(String value) {
			addCriterion("RESOURCE_CODE >", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
			addCriterion("RESOURCE_CODE >=", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeLessThan(String value) {
			addCriterion("RESOURCE_CODE <", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeLessThanOrEqualTo(String value) {
			addCriterion("RESOURCE_CODE <=", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeLike(String value) {
			addCriterion("RESOURCE_CODE like", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeNotLike(String value) {
			addCriterion("RESOURCE_CODE not like", value, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeIn(List<String> values) {
			addCriterion("RESOURCE_CODE in", values, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeNotIn(List<String> values) {
			addCriterion("RESOURCE_CODE not in", values, "resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeBetween(String value1, String value2) {
			addCriterion("RESOURCE_CODE between", value1, value2,
					"resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceCodeNotBetween(String value1, String value2) {
			addCriterion("RESOURCE_CODE not between", value1, value2,
					"resourceCode");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIsNull() {
			addCriterion("RESOURCE_URL is null");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIsNotNull() {
			addCriterion("RESOURCE_URL is not null");
			return (Criteria) this;
		}

		public Criteria andResourceUrlEqualTo(String value) {
			addCriterion("RESOURCE_URL =", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotEqualTo(String value) {
			addCriterion("RESOURCE_URL <>", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlGreaterThan(String value) {
			addCriterion("RESOURCE_URL >", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
			addCriterion("RESOURCE_URL >=", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLessThan(String value) {
			addCriterion("RESOURCE_URL <", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLessThanOrEqualTo(String value) {
			addCriterion("RESOURCE_URL <=", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLike(String value) {
			addCriterion("RESOURCE_URL like", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotLike(String value) {
			addCriterion("RESOURCE_URL not like", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIn(List<String> values) {
			addCriterion("RESOURCE_URL in", values, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotIn(List<String> values) {
			addCriterion("RESOURCE_URL not in", values, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlBetween(String value1, String value2) {
			addCriterion("RESOURCE_URL between", value1, value2, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotBetween(String value1, String value2) {
			addCriterion("RESOURCE_URL not between", value1, value2,
					"resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceIconIsNull() {
			addCriterion("RESOURCE_ICON is null");
			return (Criteria) this;
		}

		public Criteria andResourceIconIsNotNull() {
			addCriterion("RESOURCE_ICON is not null");
			return (Criteria) this;
		}

		public Criteria andResourceIconEqualTo(String value) {
			addCriterion("RESOURCE_ICON =", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconNotEqualTo(String value) {
			addCriterion("RESOURCE_ICON <>", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconGreaterThan(String value) {
			addCriterion("RESOURCE_ICON >", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconGreaterThanOrEqualTo(String value) {
			addCriterion("RESOURCE_ICON >=", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconLessThan(String value) {
			addCriterion("RESOURCE_ICON <", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconLessThanOrEqualTo(String value) {
			addCriterion("RESOURCE_ICON <=", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconLike(String value) {
			addCriterion("RESOURCE_ICON like", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconNotLike(String value) {
			addCriterion("RESOURCE_ICON not like", value, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconIn(List<String> values) {
			addCriterion("RESOURCE_ICON in", values, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconNotIn(List<String> values) {
			addCriterion("RESOURCE_ICON not in", values, "resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconBetween(String value1, String value2) {
			addCriterion("RESOURCE_ICON between", value1, value2,
					"resourceIcon");
			return (Criteria) this;
		}

		public Criteria andResourceIconNotBetween(String value1, String value2) {
			addCriterion("RESOURCE_ICON not between", value1, value2,
					"resourceIcon");
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
			addCriterion("CREATE_TIME not between", value1, value2,
					"createTime");
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
			addCriterion("UPDATE_TIME not between", value1, value2,
					"updateTime");
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

		public Criteria andOrderFieldIsNull() {
			addCriterion("ORDER_FIELD is null");
			return (Criteria) this;
		}

		public Criteria andOrderFieldIsNotNull() {
			addCriterion("ORDER_FIELD is not null");
			return (Criteria) this;
		}

		public Criteria andOrderFieldEqualTo(Long value) {
			addCriterion("ORDER_FIELD =", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldNotEqualTo(Long value) {
			addCriterion("ORDER_FIELD <>", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldGreaterThan(Long value) {
			addCriterion("ORDER_FIELD >", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldGreaterThanOrEqualTo(Long value) {
			addCriterion("ORDER_FIELD >=", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldLessThan(Long value) {
			addCriterion("ORDER_FIELD <", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldLessThanOrEqualTo(Long value) {
			addCriterion("ORDER_FIELD <=", value, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldIn(List<Long> values) {
			addCriterion("ORDER_FIELD in", values, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldNotIn(List<Long> values) {
			addCriterion("ORDER_FIELD not in", values, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldBetween(Long value1, Long value2) {
			addCriterion("ORDER_FIELD between", value1, value2, "orderField");
			return (Criteria) this;
		}

		public Criteria andOrderFieldNotBetween(Long value1, Long value2) {
			addCriterion("ORDER_FIELD not between", value1, value2,
					"orderField");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}

		public Criteria andResourceNameLikeInsensitive(String value) {
			addCriterion("upper(RESOURCE_NAME) like", value.toUpperCase(),
					"resourceName");
			return this;
		}

		public Criteria andResourceDescLikeInsensitive(String value) {
			addCriterion("upper(RESOURCE_DESC) like", value.toUpperCase(),
					"resourceDesc");
			return this;
		}

		public Criteria andResourceCodeLikeInsensitive(String value) {
			addCriterion("upper(RESOURCE_CODE) like", value.toUpperCase(),
					"resourceCode");
			return this;
		}

		public Criteria andResourceUrlLikeInsensitive(String value) {
			addCriterion("upper(RESOURCE_URL) like", value.toUpperCase(),
					"resourceUrl");
			return this;
		}

		public Criteria andResourceIconLikeInsensitive(String value) {
			addCriterion("upper(RESOURCE_ICON) like", value.toUpperCase(),
					"resourceIcon");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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