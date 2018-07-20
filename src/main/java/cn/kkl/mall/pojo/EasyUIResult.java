package cn.kkl.mall.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * easyUI dataGrid data format
 * @author Admin
 *
 */
public class EasyUIResult implements Serializable{

	/**
	 * need network transmit
	 */
	private static final long serialVersionUID = 381011401262880255L;

	private Integer total;
	
	private List<?> rows;
	
	public EasyUIResult(Integer total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}
	
	public EasyUIResult(long total, List<?> rows) {
		this.total = (int) total;
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
