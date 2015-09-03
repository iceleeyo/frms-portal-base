package cn.com.bsfit.frms.portal.base.util;

/**
 * 系统中的状态
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
@Deprecated
public enum Status {
	
	DELETED(0, "删除"),
    NORMAL(1, "正常"),
    DISABLE(2, "禁用");
	
	private Integer index;
    private String text;
    
    private Status(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}