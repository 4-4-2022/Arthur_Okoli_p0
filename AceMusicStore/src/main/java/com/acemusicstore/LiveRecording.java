package com.acemusicstore;

import java.util.ArrayList;
import java.util.Collections;

public class LiveRecording {

	public LiveRecording() {
		ArrayList <String> LiveRecording1 = new ArrayList<String> ();
		Collections.addAll(LiveRecording1, "Ben", "Martin", "Sales", "Sales Associate");
		ArrayList <String> LiveRecording2 = new ArrayList<String> ();
		Collections.addAll(LiveRecording2, "Will", "Hartnet", "Sales", "Sales Associate");
		ArrayList <String> LiveRecording3 = new ArrayList<String> ();
		Collections.addAll(LiveRecording3, "Jim", "Whittle", "Admin", "Sales Manager");
		System.out.println(LiveRecording1);
		System.out.println(LiveRecording2);
		System.out.println(LiveRecording3);
	}

}
