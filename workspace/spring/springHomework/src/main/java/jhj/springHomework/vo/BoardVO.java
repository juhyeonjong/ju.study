package jhj.springHomework.vo;

public class BoardVO {
	private int bno;
	private String btitle;
	private String bcontent;
	private String rdate;
	private int bhit;
	private int mno;
	private String delyn;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", rdate=" + rdate + ", bhit="
				+ bhit + ", mno=" + mno + ", delyn=" + delyn + "]";
	}
	
	
}
