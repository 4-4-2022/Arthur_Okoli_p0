package com.acemusicstore;

public abstract class Recording {

	public Integer id;
	public String artist;
	public String song;
	public Integer year;
	public String producer;
	
	public Recording() {
		
	}
	
	protected abstract void initDb(Integer id, String artist, String song, Integer year, String producer);
	
}
