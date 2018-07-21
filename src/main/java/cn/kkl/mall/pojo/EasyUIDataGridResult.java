package cn.kkl.mall.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * easyUI dataGrid data format
 * @author Admin
 *
 */
public class EasyUIDataGridResult implements Serializable{

	/**
	 * need network transmit
	 */
	private static final long serialVersionUID = 381011401262880255L;

	private long total;
	
	private List<?> rows;

	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
