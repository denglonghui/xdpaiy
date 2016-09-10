package xdpaiy.stock.vo;

public class StockDayInfo {
	private String code;
	private String date;
	private double open;
	private double high;
	private double close;
	private double low;
	private double pChange;//涨跌幅
	private double zfChange;//振幅
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getpChange() {
		return pChange;
	}
	public void setpChange(double pChange) {
		this.pChange = pChange;
	}
	public double getZfChange() {
		return zfChange;
	}
	public void setZfChange(double zfChange) {
		this.zfChange = zfChange;
	}

}
