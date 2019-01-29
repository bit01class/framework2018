package com.bit.spr.model.entity;

public class Bbs06Vo {
	private int num, userNum;
	private String name, sub, content;
	private int cnt;
	
	public Bbs06Vo() {
	}

	public Bbs06Vo(int num, String name, String sub, String content, int cnt) {
		super();
		this.num = num;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Bbs06Vo [num=" + num + ", userNum=" + userNum + ", name="
				+ name + ", sub=" + sub + ", content=" + content + ", cnt="
				+ cnt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cnt;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + num;
		result = prime * result + ((sub == null) ? 0 : sub.hashCode());
		result = prime * result + userNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bbs06Vo other = (Bbs06Vo) obj;
		if (cnt != other.cnt)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (num != other.num)
			return false;
		if (sub == null) {
			if (other.sub != null)
				return false;
		} else if (!sub.equals(other.sub))
			return false;
		if (userNum != other.userNum)
			return false;
		return true;
	}

	
}
