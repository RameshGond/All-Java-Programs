package com.xworkz.song.dao;

import com.xworkz.song.constants.Lang;
import com.xworkz.song.dto.SongDTO;

public class SongDAO {
	private SongDTO[] dtos=new SongDTO[10];
	private int index;
	public boolean save(SongDTO dto)
	{
		System.out.println("storing "+ dto);
		if(index<this.dtos.length){
			
			this.dtos[index]=dto;
			index++;
			
			System.out.println("new song added");
			return true;
		}
		else
		{
			System.out.println("array out of index");
		}
		return false;
	}
	public void saveMultiple(SongDTO[] dtos) {
		System.out.println("storing songs");
		for(int index=0;index<dtos.length;index++) {
			SongDTO songDTO=dtos[index];
			this.save(songDTO);
		}
	}
	//updateDurationByName
	public boolean updateDurationByName(Double duration,String name) {
		for(int index=0;index<this.dtos.length;index++) {
			SongDTO dto1=dtos[index];
					System.out.println("name is "+name);
			if(dto1.getName().equals(name)) {
				dto1.setDuration(duration);
				
				System.out.println("duration is "+duration);
				return true;
			}
			else
			{
				System.out.println("duration cant update by name");
			}
		}
		return false;	
	}
	//updateSingerNameByName
	public boolean updateSingerNameByName(String singerName,String name) {
		for(int index=0;index<this.dtos.length;index++) {
			SongDTO dto2=dtos[index];
					System.out.println("name is "+name);
			if(dto2.getName().equals(name)) {
				dto2.setSingerName(singerName);
				
				System.out.println("singer name  is "+singerName);
				return true;
			}
			else
			{
				System.out.println("singerName cant update by name");
			}
		}
		return false;	
	}
	
	//updateNameById
	public boolean updateNameById(String name,Integer id) {
		for(int index=0;index<this.dtos.length;index++) {
			SongDTO dto3=dtos[index];
					System.out.println("id is "+id);
			if(dto3.getName().equals(id)) {
				dto3.setName(name);
				
				System.out.println("name  is "+name);
				return true;
			}
			else
			{
				System.out.println("Name cant update by id");
			}
			
		}
		return false;	
	}
	
	//findDurationByName
	public Double findDurationByName(String name) {
		for(int index=0;index<this.dtos.length;index++) {
			SongDTO dto4=dtos[index];
					System.out.println("name is "+name);
			if(dto4.getName().equals(name)) {
				System.out.println("name  is "+name);
				return dto4.getDuration();
			}
			else
			{
				System.out.println("Duration cant update by "+name);
			}
		
	}
		return null;
			
	}
	//findSingerNameByName
	public String findSingerNameByName(String name) {
		for(int index=0;index<this.dtos.length;index++) {
			SongDTO dto5=dtos[index];
					System.out.println("name is "+name);
			if(dto5.getName().equals(name)) {
				System.out.println("name  is "+name);
				return dto5.getSingerName();
			}
			else
			{
				System.out.println("Singer Name cant update by "+name);
			}
		
	}
		return null;
			
	}
	//findBySingerName
	public SongDTO findBySingerName(String singerName) {
		for(int index = 0;index<dtos.length;index++) {
			SongDTO dto6=dtos[index];
			System.out.println("Singer Name "+singerName);
			if(dto6.getSingerName().equals(singerName)) {
				System.out.println("Singer name is found "+singerName);
				break;
			}
			else
			{
				System.out.println("singer name not found "+singerName);
			}
		}
		return null;
	}
	//findLangByName
	public Lang findLangByName(String name) {
		for(int index = 0;index<dtos.length;index++) {
			SongDTO dto7=dtos[index];
			System.out.println("Name is "+name);
			if(dto7.getName().equals(name)) {
				SongDTO dtos7 = null;
				return dtos7.getLang();
			}
			else
			{
				System.out.println("name not found ");
			}
		}
		return null;
	}
	//findByMaxDuration
	public Double findByMaxDuration(double d) {
		double Max=0d;
		for(int index = 0;index<dtos.length;index++) {
			SongDTO dto8=dtos[index];
			double duration=dto8.getDuration();
			System.out.println(Max+"  " +duration);
			Max=Math.max(Max, duration);
			}
			return Max;
		}
	//findByMinDuration
	public Double findByMinDuration(double d) {
		double Min=0d;
		for(int index = 0;index<dtos.length;index++) {
			SongDTO dto9=dtos[index];
			double duration=dto9.getDuration();
			System.out.println(Min+"  " +duration);
			Min=Math.min(Min, duration);
			}
			return Min;
		}
	
	
	
		
	}
	
	


