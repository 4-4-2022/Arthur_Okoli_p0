package com.acemusicstore;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Collections;

public class Record extends Recording {
	
	private Integer rec_id;
	private String artist;
	private String song;
	private Integer year;
	private String producer;
	private String album;
	private String label;
	
	public Record() {
		
	}
	
	public Record(Integer rec_id, String artist, String song, String genre, String Category, Integer year, String producer) {
		super();
		this.rec_id = rec_id;
		this.artist = artist;
		this.song = song;
		this.year = year;
		this.producer = producer;
	}
	
	public int getRecid() {
		return this.rec_id;
	}
	
	public String getRecsong() {
		return this.song;
	}
	
	
	
	
}

