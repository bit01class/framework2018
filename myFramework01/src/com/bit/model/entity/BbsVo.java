package com.bit.model.entity;

public class BbsVo {
	private int num;
	private String sub,content;
	private int cnt;
	
	public BbsVo() {
		// TODO Auto-generated constructor stub
	}

	public BbsVo(int num, String sub, String content, int cnt) {
		super();
		this.num = num;
		this.sub = sub;
		this.content = content;
		this.cnt = cnt;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "BbsVo [num=" + num + ", sub=" + sub + ", content=" + content
				+ ", cnt=" + cnt + "]";
	}
	
	
}
