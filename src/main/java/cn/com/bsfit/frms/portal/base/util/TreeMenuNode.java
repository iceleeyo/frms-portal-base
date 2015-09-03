package cn.com.bsfit.frms.portal.base.util;

import java.io.Serializable;
import java.util.List;

import cn.com.bsfit.frms.portal.base.util.TreeMenuNode;

/**
 * 资源的树形菜单
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class TreeMenuNode implements Serializable {

	private Integer id;// 资源ID
	private String text;// 资源名称
	private Integer parentId;// 父级ID
	private Integer level;// 资源级别
	private boolean leaf;// 是否是叶子节点
	private boolean expanded;// 是否展开
	private String iconCls;// 资源图标
	private String qtitle;// 资源url地址
	private String code;// 资源编号,用于判断权限
	private Integer type;// 菜单类型 1 菜单 0 非菜单
	private Long orderField;// 排序字段
	private Short openType;// 打开方式  1 新窗口打开 0 原窗口打开
	private List<TreeMenuNode> children;// 下级资源
	private static final long serialVersionUID = 1L;
	
	public TreeMenuNode() {
		super();
	}
	
	public TreeMenuNode(Integer id, String text, Integer parentId,
			Integer level, boolean leaf, boolean expanded, String iconCls,
			String qtitle, String code, Integer type, Long orderField, Short openType, 
			List<TreeMenuNode> children) {
		this.id = id;
		this.text = text;
		this.parentId = parentId;
		this.level = level;
		this.leaf = leaf;
		this.expanded = expanded;
		this.iconCls = iconCls;
		this.qtitle = qtitle;
		this.code = code;
		this.type = type;
		this.orderField = orderField;
		this.openType = openType;
		this.children = children;
	}
	
	public TreeMenuNode(Integer id, String text, Integer parentId,
			Integer level, boolean leaf, boolean expanded, String iconCls,
			String qtitle, String code, Integer type, Long orderField, Short openType) {
		this.id = id;
		this.text = text;
		this.parentId = parentId;
		this.level = level;
		this.leaf = leaf;
		this.expanded = expanded;
		this.iconCls = iconCls;
		this.qtitle = qtitle;
		this.code = code;
		this.type = type;
		this.openType = openType;
		this.orderField = orderField;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getQtitle() {
		return qtitle;
	}
	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Long getOrderField() {
		return orderField;
	}
	public void setOrderField(Long orderField) {
		this.orderField = orderField;
	}
	public Short getOpenType() {
		return openType;
	}
	public void setOpenType(Short openType) {
		this.openType = openType;
	}
	public List<TreeMenuNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeMenuNode> children) {
		this.children = children;
	}
}