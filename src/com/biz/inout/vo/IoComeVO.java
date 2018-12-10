package com.biz.inout.vo;

public class IoComeVO {

	// private 으로 멤버 변수 선언
	private String strDate;
	private String strInout;
	private String strPum;

	private int intSu;
	private int intDan;
	private int intTotal;

	// getter, setter 선언
	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public String getStrInout() {
		return strInout;
	}

	public void setStrInout(String strInout) {
		this.strInout = strInout;
	}

	public String getStrPum() {
		return strPum;
	}

	public void setStrPum(String strPum) {
		this.strPum = strPum;
	}

	public int getIntSu() {
		return intSu;
	}

	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}

	public int getIntDan() {
		return intDan;
	}

	public void setIntDan(int intDan) {
		this.intDan = intDan;
	}

	public int getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "InComeVO [strDate=" + strDate + ", strInout=" + strInout + ", strPum=" + strPum + ", intSu=" + intSu
				+ ", intDan=" + intDan + ", intTotal=" + intTotal + "]";
	}

}
