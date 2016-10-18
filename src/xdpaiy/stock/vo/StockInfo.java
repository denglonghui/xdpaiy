package xdpaiy.stock.vo;

public class StockInfo {
	private String code;
	private String name;
	private String industry;
	private String area;
	private double pe;
	private double outstanding;
	private double totals;//总股本(万)
	private double totalAssets;//总资产(万)
	private double reservedPerShare;//每股公积金
	private double eps;//每股收益
	private double bvps;//每股净资
	private double pb;
	private String timeToMarket;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getPe() {
		return pe;
	}
	public void setPe(double pe) {
		this.pe = pe;
	}
	public double getOutstanding() {
		return outstanding;
	}
	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}
	public double getTotals() {
		return totals;
	}
	public void setTotals(double totals) {
		this.totals = totals;
	}
	public double getPb() {
		return pb;
	}
	public void setPb(double pb) {
		this.pb = pb;
	}
	public double getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(double totalAssets) {
		this.totalAssets = totalAssets;
	}
	public double getReservedPerShare() {
		return reservedPerShare;
	}
	public void setReservedPerShare(double reservedPerShare) {
		this.reservedPerShare = reservedPerShare;
	}
	public double getEps() {
		return eps;
	}
	public void setEps(double eps) {
		this.eps = eps;
	}
	public double getBvps() {
		return bvps;
	}
	public void setBvps(double bvps) {
		this.bvps = bvps;
	}
	public String getTimeToMarket() {
		return timeToMarket;
	}
	public void setTimeToMarket(String timeToMarket) {
		this.timeToMarket = timeToMarket;
	}
	
	

}
