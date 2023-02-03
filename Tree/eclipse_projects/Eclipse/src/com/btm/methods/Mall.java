package com.btm.methods;

public class Mall {
	private int no;
	private String name;
	private String location;
	private long pinCode;
	private boolean pvr;
	
	public String toString()
	{
		System.out.println("running tostring");
		return "patel";
		}
	public int hashCode()
	{
		System.out.println("running hashcode");
		return 5117;
	}
	public boolean equals(Object obj)
	{
		if(obj !=null)
		{
			System.out.println("it is not null");
		if (obj instanceof Mall)
		{
			System.out.println("it is instance of mall");
		    Mall satya=(Mall)obj;
		if(this.name.equals(satya.name) && this.location.equals(satya.location))
		{
			System.out.println("mall is open");
			return true;
		}
				
		}
		}
	
		else
		{
			System.out.println("mall is not open");
		}	
			return false;
		
	}
			


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public boolean isPvr() {
		return pvr;
	}
	public void setPvr(boolean pvr) {
		this.pvr = pvr;
	}
	}



