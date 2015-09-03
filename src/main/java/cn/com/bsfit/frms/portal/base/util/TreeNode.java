package cn.com.bsfit.frms.portal.base.util;

import java.io.Serializable;
import java.util.List;

import cn.com.bsfit.frms.portal.base.util.TreeNode;

public class TreeNode implements Serializable {
	
	private Integer id;// 资源ID
	private String text;// 资源名称
	private Integer parentId;// 父级ID
	private Integer level;// 资源级别
	private boolean leaf;// 是否是叶子节点
	private boolean expanded;// 是否展开
	private boolean checked;// 是否选中
	private String iconCls;// 资源图标
	private List<TreeNode> children;// 下级资源
	private static final long serialVersionUID = 1L;
	
	public TreeNode() {
		super();
	}
	
	public TreeNode(Integer id, String text, Integer parentId, Integer level,
			boolean leaf, boolean expanded, boolean checked, String iconCls,
			List<TreeNode> children) {
		this.id = id;
		this.text = text;
		this.parentId = parentId;
		this.level = level;
		this.leaf = leaf;
		this.expanded = expanded;
		this.checked = checked;
		this.iconCls = iconCls;
		this.children = children;
	}
	
	public TreeNode(Integer id, String text, Integer parentId, Integer level,
			boolean leaf, boolean expanded, boolean checked, String iconCls) {
		this.id = id;
		this.text = text;
		this.parentId = parentId;
		this.level = level;
		this.leaf = leaf;
		this.expanded = expanded;
		this.checked = checked;
		this.iconCls = iconCls;
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
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
}