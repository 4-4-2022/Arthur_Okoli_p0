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
	
	public Record(Integer rec_id, String artist, String song, Integer year, String producer) {
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
	
	/*
	private void initDB(Integer rec_id, String artist, String song, Integer year, String producer) {
		TreeSet <String> mixtape1 = new TreeSet <String> ();
		Collections.addAll(mixtape1, "Ben", "Martin", "Sales", "Sales Associate");
		System.out.println(mixtape1);
	}
	*/

	@Override
	protected void initDb(Integer id, String artist, String song, Integer year, String producer) {
		// TODO Auto-generated method stub
		TreeSet <String> mixtape1 = new TreeSet <String> ();
		Collections.addAll(mixtape1, "Ben", "Martin", "Sales", "Sales Associate");
		System.out.println(mixtape1);
	}
	
	
	/*
	public static Set <Record> initDb() {
		for (int i=0; i<2; i++) {
			if (i==0) {
				TreeSet <String> ts = new TreeSet <String> ();
				record1 = rec.addAll("12",);
		System.out.println(record1);
		return record1;
			} else if (i==1) {
		ArrayList <String> record2 = new ArrayList<String> ();
		Collections.addAll(record2, "Will", "Hartnet", "Sales", "Sales Associate");
		System.out.println(record2);
		return record2;
			} 
		break;	
			}
		ArrayList <String> record3 = new ArrayList<String> ();
		Collections.addAll(record3, "Jim", "Whittle", "Admin", "Sales Manager");
		System.out.println(record3);
		return record3;
	}
	
	*/
	
	
}

