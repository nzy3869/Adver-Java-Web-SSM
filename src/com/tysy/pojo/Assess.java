package com.tysy.pojo;

public class Assess {
	private Integer id;
	private Integer memid;
	private Integer comid;
	private String text;
	public Assess() {
		super();
	}
	public Assess(Integer memid, Integer comid, String text) {
		super();
		this.memid = memid;
		this.comid = comid;
		this.text = text;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMemid() {
		return memid;
	}
	public void setMemid(Integer memid) {
		this.memid = memid;
	}
	public Integer getComid() {
		return comid;
	}
	public void setComid(Integer comid) {
		this.comid = comid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Assess [id=" + id + ", memid=" + memid + ", comid=" + comid + ", text=" + text + "]";
	}
	
}
