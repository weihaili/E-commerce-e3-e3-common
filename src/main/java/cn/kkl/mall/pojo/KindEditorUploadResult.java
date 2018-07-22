package cn.kkl.mall.pojo;

import java.io.Serializable;

public class KindEditorUploadResult implements Serializable{

	/**
	 * need network transmit
	 */
	private static final long serialVersionUID = 8545526359401706369L;
	
	private int error;
	
	private String url;
	
	private String message;

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
