package com.bwie.bean;
/**
 *@作者：刘佳
 *@时间：2017年8月25日上午10:04:10
 *@功能：food实体类
 */

public class Food {
	//定义属性并且私有化属性
	private int fid;
	private String sname;
	private double sprice;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSprice() {
		return sprice;
	}
	public void setSprice(double sprice) {
		this.sprice = sprice;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int fid, String sname, double sprice) {
		super();
		this.fid = fid;
		this.sname = sname;
		this.sprice = sprice;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", sname=" + sname + ", sprice=" + sprice + "]";
	}
	
}
