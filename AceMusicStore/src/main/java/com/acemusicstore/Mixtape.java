package com.acemusicstore;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class Mixtape extends Recording {

	private Integer mix_id;
	private String engineer;
	
	public Mixtape() {
		
	}
	
	public  Mixtape(Integer mix_id, String artist, String song, Integer year, String producer) {
		super();
		this.mix_id = mix_id;
		this.artist = artist;
		this.song = song;
		this.year = year;
		this.producer = producer;
	}
	
	public int getRecid() {
		return this.mix_id;
	}
	
	public String getRecsong() {
		return this.song;
	}

	@Override
	protected void initDb(Integer id, String artist, String song, Integer year, String producer) {
		// TODO Auto-generated method stub
		TreeSet <String> mixtape1 = new TreeSet <String> ();
		Collections.addAll(mixtape1, "4", "Ben Jackson", "Sail Down the River", "2005", "Rodeo");
		System.out.println(mixtape1);
	}
	
	/*
	public Mixtape() {
		ArrayList <String> mixtape1 = new ArrayList<String> ();
		Collections.addAll(mixtape1, "Ben", "Martin", "Sales", "Sales Associate");
		ArrayList <String> mixtape2 = new ArrayList<String> ();
		Collections.addAll(mixtape2, "Will", "Hartnet", "Sales", "Sales Associate");
		ArrayList <String> mixtape3 = new ArrayList<String> ();
		Collections.addAll(mixtape3, "Jim", "Whittle", "Admin", "Sales Manager");
		System.out.println(mixtape1);
		System.out.println(mixtape2);
		System.out.println(mixtape3);
	}
	*/
}
