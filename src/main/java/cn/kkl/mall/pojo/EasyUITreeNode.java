package cn.kkl.mall.pojo;

import java.io.Serializable;

public class EasyUITreeNode implements Serializable {

	/**
	 * need network transmit
	 */
	private static final long serialVersionUID = 8068012721528898792L;
	
	private long id;
	
	private String state;
	
	private String text;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
