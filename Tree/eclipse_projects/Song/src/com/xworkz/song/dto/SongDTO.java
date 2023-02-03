package com.xworkz.song.dto;

import com.xworkz.song.constants.Lang;

public class SongDTO {
	private Integer id;
	private String name;
	private String singerName;
	private Double duration;
	private Integer year;
	private Lang lang;
	 
	public SongDTO()
	{
		System.out.println("song dto no args");
	}
	@Override
	public String toString() {
		return "Song";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Lang getLang() {
		return lang;
	}
	public void setLang(Lang lang) {
		this.lang = lang;
	}
	
	
	

}
