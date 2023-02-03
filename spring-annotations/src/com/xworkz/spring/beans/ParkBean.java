package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class ParkBean {

	private String name;
	private String location;
	private int zone1Coverage;
	private int zone2Coverage;
	private int zone3Coverage;
	private int zone4Coverage;
	private int zone5Coverage;
	private int zone6Coverage;
	private int zone7Coverage;
	private int zone8Coverage;
	private int zone9Coverage;
	private int zone10Coverage;
	private int zone11Coverage;
	private int zone12Coverage;

	@Value("Bannerghatta National Park ")
	public void setName(String name) {
		this.name = name;
	}

	@Value("Bangalore")
	public void setLocation(String location) {
		this.location = location;
	}

	@Value("100")
	public void setZone1Coverage(int zone1Coverage) {
		this.zone1Coverage = zone1Coverage;
	}

	@Value("200")
	public void setZone2Coverage(int zone2Coverage) {
		this.zone2Coverage = zone2Coverage;
	}

	@Value("300")
	public void setZone3Coverage(int zone3Coverage) {
		this.zone3Coverage = zone3Coverage;
	}

	@Value("400")
	public void setZone4Coverage(int zone4Coverage) {
		this.zone4Coverage = zone4Coverage;
	}

	@Value("500")
	public void setZone5Coverage(int zone5Coverage) {
		this.zone5Coverage = zone5Coverage;
	}

	@Value("600")
	public void setZone6Coverage(int zone6Coverage) {
		this.zone6Coverage = zone6Coverage;
	}

	@Value("700")
	public void setZone7Coverage(int zone7Coverage) {
		this.zone7Coverage = zone7Coverage;
	}

	@Value("800")
	public void setZone8Coverage(int zone8Coverage) {
		this.zone8Coverage = zone8Coverage;
	}

	@Value("900")
	public void setZone9Coverage(int zone9Coverage) {
		this.zone9Coverage = zone9Coverage;
	}

	@Value("1000")
	public void setZone10Coverage(int zone10Coverage) {
		this.zone10Coverage = zone10Coverage;
	}

	@Value("1100")
	public void setZone11Coverage(int zone11Coverage) {
		this.zone11Coverage = zone11Coverage;
	}

	@Value("1200")
	public void setZone12Coverage(int zone12Coverage) {
		this.zone12Coverage = zone12Coverage;
	}

	@Override
	public String toString() {
		return "ParkBean [name=" + name + ", location=" + location + ", zone1Coverage=" + zone1Coverage
				+ ", zone2Coverage=" + zone2Coverage + ", zone3Coverage=" + zone3Coverage + ", zone4Coverage="
				+ zone4Coverage + ", zone5Coverage=" + zone5Coverage + ", zone6Coverage=" + zone6Coverage
				+ ", zone7Coverage=" + zone7Coverage + ", zone8Coverage=" + zone8Coverage + ", zone9Coverage="
				+ zone9Coverage + ", zone10Coverage=" + zone10Coverage + ", zone11Coverage=" + zone11Coverage
				+ ", zone12Coverage=" + zone12Coverage + "]";
	}

}
