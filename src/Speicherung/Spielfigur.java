package Speicherung;

import java.io.*;

public class Spielfigur implements Serializable {
	
	int st�rke;
	String typ;
	String[] waffen;
	
	public Spielfigur(int s, String t, String[] w)  {
		st�rke = s;
		typ = t;
		waffen = w;
	}
	
	public int getSt�rke()  {
		return st�rke;
	}
	
	public String getTyp()  {
		return typ;
	}
	
	public String getWaffen()  {
		String waffenliste ="";
		
		for (int i = 0; i < waffen.length; i++)  {
			waffenliste += waffen[i] + " ";
		}
		return waffenliste;
	}
	
	
}
