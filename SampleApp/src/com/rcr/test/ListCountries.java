package com.rcr.test;

import java.util.Locale;

public class ListCountries {
	Locale locale[]=Locale.getAvailableLocales();
	public void getCountries(){
		for(int i=0;i<locale.length;i++){
			System.out.println(locale[i].getDisplayCountry());
		}
	}
}
