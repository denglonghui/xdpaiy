package xdpaiy.stock.vo;

public class LianxuReport {
	private String date;
	private String code;
	private String type;//指标类型
	private int days;
	private double pChange;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getpChange() {
		return pChange;
	}
	public void setpChange(double pChange) {
		this.pChange = pChange;
	}
	

}
