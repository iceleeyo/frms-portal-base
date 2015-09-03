package cn.com.bsfit.frms.portal.base.pojo;

import java.io.Serializable;

/**
 * 资源按钮POJO
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
public class ResourcesButton implements Serializable {
	
	private String key;// 键
	private int value;// 值
	private String code;// 资源编号 
	private static final long serialVersionUID = 1L;
	
	public ResourcesButton(String key, int value, String code) {
		super();
		this.key = key;
		this.value = value;
		this.code = code;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResourcesButton other = (ResourcesButton) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResourcesButton [key=" + key + ", value=" + value + ", code=" + code + "]";
	}
}
