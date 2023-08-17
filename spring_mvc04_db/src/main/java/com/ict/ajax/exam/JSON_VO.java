package com.ict.ajax.exam;

public class JSON_VO {
	private String city;
	private long totalcount, firstcount, secondcount;
	private double firstpercent, secondpercent;
	
	public JSON_VO(String city, long totalcount, long firstcount, long secondcount, double firstpercent,
			double secondpercent) {
		super();
		this.city = city;
		this.totalcount = totalcount;
		this.firstcount = firstcount;
		this.secondcount = secondcount;
		this.firstpercent = firstpercent;
		this.secondpercent = secondpercent;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(long totalcount) {
		this.totalcount = totalcount;
	}

	public long getFirstcount() {
		return firstcount;
	}

	public void setFirstcount(long firstcount) {
		this.firstcount = firstcount;
	}

	public long getSecondcount() {
		return secondcount;
	}

	public void setSecondcount(long secondcount) {
		this.secondcount = secondcount;
	}

	public double getFirstpercent() {
		return firstpercent;
	}

	public void setFirstpercent(double firstpercent) {
		this.firstpercent = firstpercent;
	}

	public double getSecondpercent() {
		return secondpercent;
	}

	public void setSecondpercent(double secondpercent) {
		this.secondpercent = secondpercent;
	}
	
	
}
