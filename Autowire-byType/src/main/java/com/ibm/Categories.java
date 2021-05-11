package com.ibm;

public class Categories {
	private String name;
	private Book bk;
	private Sample sk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public Sample getSk() {
		return sk;
	}

	public void setSk(Sample sk) {
		this.sk = sk;
	}

	public void show() {
		System.out.println("categories name" + name);
		System.out.println("bookname" + bk.getBookname() + "and bookprice" + bk.getBookprice());
		System.out.println("samplename" + sk.getSamplename() + "and sampleprice" + sk.getSampleprice());
	}

	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + ", sk=" + sk + "]";
	}

}