package com.xworkz.springfw.annotation.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieBean {
	private String movieName;
	private String heroName;
	private String heroineName;
	private String directedBy;
	private String producedBy;
	private String musicDirctor;
	private String lyricist;
	private String choreoghrapher;
	private String editedBy;
	private String productionCompany;
	private String lang;
	private String distributedBy;
	// private LocalDate date;
	private double budset;

	public MovieBean() {
		System.out.println("created default constructor");
	}

	public MovieBean(@Value("KGF") String movieName, @Value("Yashvant") String heroName,
			@Value("Ranjita") String heroineName, @Value("satya") String directedBy, @Value("Ramesh") String producedBy,
			@Value("Sanjay") String musicDirctor, @Value("Jaynth Kaikini") String lyricist,
			@Value("Harsha") String choreoghrapher, @Value("Deepu") String editedBy,
			@Value("E.K.Entertainers") String productionCompany, @Value("Hindi") String lang,
			@Value("Sweta") String distributedBy, @Value("70d") double budset) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.directedBy = directedBy;
		this.producedBy = producedBy;
		this.musicDirctor = musicDirctor;
		this.lyricist = lyricist;
		this.choreoghrapher = choreoghrapher;
		this.editedBy = editedBy;
		this.productionCompany = productionCompany;
		this.lang = lang;
		this.distributedBy = distributedBy;
		// this.date = date;
		this.budset = budset;
	}

	@Override
	public String toString() {
		return "MovieBean [movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", directedBy=" + directedBy + ", producedBy=" + producedBy + ", musicDirctor=" + musicDirctor
				+ ", lyricist=" + lyricist + ", choreoghrapher=" + choreoghrapher + ", editedBy=" + editedBy
				+ ", productionCompany=" + productionCompany + ", lang=" + lang + ", distributedBy=" + distributedBy
				+ ", budset=" + budset + "]";
	}

}
