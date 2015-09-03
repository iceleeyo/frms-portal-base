package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Resources implements Serializable {

	private Integer id;// 资源ID,主键,自动递增
	private Integer parentId;// 父级资源ID
	private Short enabled;// 状态:0删除,1正常,2禁用
	private String resourceName;// 资源名称
	private Integer resourceLevel;// 资源级别
	private Integer resourceType;// 资源类型  1 菜单 0 非菜单
	private String resourceDesc;// 资源描述
	private String resourceCode;// 方法上的code,用来控制权限
	private String resourceUrl;// 资源链接地址
	private String resourceIcon;// 资源图片
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private String modifer;// 更新者
	private Long orderField;// 排序字段
	private List<Resources> childrenList;// 下级资源
	private static final long serialVersionUID = 1L;

	public Resources() {
		super();
	}

	public Resources(Integer id, Integer parentId, Short enabled,
			String resourceName, Integer resourceLevel, Integer resourceType,
			String resourceDesc, String resourceCode, String resourceUrl,
			String resourceIcon, Date createTime, Date updateTime,
			String modifer, Long orderField) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.enabled = enabled;
		this.resourceName = resourceName;
		this.resourceLevel = resourceLevel;
		this.resourceType = resourceType;
		this.resourceDesc = resourceDesc;
		this.resourceCode = resourceCode;
		this.resourceUrl = resourceUrl;
		this.resourceIcon = resourceIcon;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.modifer = modifer;
		this.orderField = orderField;
	}
	
	public Resources(Integer id, Short enabled, String resourceName, 
			Integer resourceLevel, Integer resourceType, String resourceDesc, 
			String resourceCode, String resourceUrl,
			String resourceIcon, Long orderField, List<Resources> childrenList) {
		super();
		this.id = id;
		this.enabled = enabled;
		this.resourceName = resourceName;
		this.resourceLevel = resourceLevel;
		this.resourceType = resourceType;
		this.resourceDesc = resourceDesc;
		this.resourceCode = resourceCode;
		this.resourceUrl = resourceUrl;
		this.resourceIcon = resourceIcon;
		this.orderField = orderField;
		this.childrenList = childrenList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName == null ? null : resourceName.trim();
	}

	public Integer getResourceLevel() {
		return resourceLevel;
	}

	public void setResourceLevel(Integer resourceLevel) {
		this.resourceLevel = resourceLevel;
	}

	public Integer getResourceType() {
		return resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc == null ? null : resourceDesc.trim();
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode == null ? null : resourceCode.trim();
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
	}

	public String getResourceIcon() {
		return resourceIcon;
	}

	public void setResourceIcon(String resourceIcon) {
		this.resourceIcon = resourceIcon == null ? null : resourceIcon.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getModifer() {
		return modifer;
	}

	public void setModifer(String modifer) {
		this.modifer = modifer == null ? null : modifer.trim();
	}

	public Long getOrderField() {
		return orderField;
	}

	public void setOrderField(Long orderField) {
		this.orderField = orderField;
	}

	public List<Resources> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<Resources> childrenList) {
		this.childrenList = childrenList;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Resources other = (Resources) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getParentId() == null ? other.getParentId() == null
						: this.getParentId().equals(other.getParentId()))
				&& (this.getEnabled() == null ? other.getEnabled() == null
						: this.getEnabled().equals(other.getEnabled()))
				&& (this.getResourceName() == null ? other.getResourceName() == null
						: this.getResourceName()
								.equals(other.getResourceName()))
				&& (this.getResourceLevel() == null ? other.getResourceLevel() == null
						: this.getResourceLevel().equals(
								other.getResourceLevel()))
				&& (this.getResourceType() == null ? other.getResourceType() == null
						: this.getResourceType()
								.equals(other.getResourceType()))
				&& (this.getResourceDesc() == null ? other.getResourceDesc() == null
						: this.getResourceDesc()
								.equals(other.getResourceDesc()))
				&& (this.getResourceCode() == null ? other.getResourceCode() == null
						: this.getResourceCode()
								.equals(other.getResourceCode()))
				&& (this.getResourceUrl() == null ? other.getResourceUrl() == null
						: this.getResourceUrl().equals(other.getResourceUrl()))
				&& (this.getResourceIcon() == null ? other.getResourceIcon() == null
						: this.getResourceIcon()
								.equals(other.getResourceIcon()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getModifer() == null ? other.getModifer() == null
						: this.getModifer().equals(other.getModifer()))
				&& (this.getOrderField() == null ? other.getOrderField() == null
						: this.getOrderField().equals(other.getOrderField()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getParentId() == null) ? 0 : getParentId().hashCode());
		result = prime * result
				+ ((getEnabled() == null) ? 0 : getEnabled().hashCode());
		result = prime
				* result
				+ ((getResourceName() == null) ? 0 : getResourceName()
						.hashCode());
		result = prime
				* result
				+ ((getResourceLevel() == null) ? 0 : getResourceLevel()
						.hashCode());
		result = prime
				* result
				+ ((getResourceType() == null) ? 0 : getResourceType()
						.hashCode());
		result = prime
				* result
				+ ((getResourceDesc() == null) ? 0 : getResourceDesc()
						.hashCode());
		result = prime
				* result
				+ ((getResourceCode() == null) ? 0 : getResourceCode()
						.hashCode());
		result = prime
				* result
				+ ((getResourceUrl() == null) ? 0 : getResourceUrl().hashCode());
		result = prime
				* result
				+ ((getResourceIcon() == null) ? 0 : getResourceIcon()
						.hashCode());
		result = prime * result
				+ ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result
				+ ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result
				+ ((getModifer() == null) ? 0 : getModifer().hashCode());
		result = prime * result
				+ ((getOrderField() == null) ? 0 : getOrderField().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Resources [id=" + id + ", parentId=" + parentId + ", enabled=" + enabled + ", resourceName="
				+ resourceName + ", resourceLevel=" + resourceLevel + ", resourceType=" + resourceType
				+ ", resourceDesc=" + resourceDesc + ", resourceCode=" + resourceCode + ", resourceUrl=" + resourceUrl
				+ ", resourceIcon=" + resourceIcon + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", modifer=" + modifer + ", orderField=" + orderField + ", childrenList=" + childrenList + "]";
	}
}