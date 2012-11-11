package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Set splash.xml as content in the view
		setContentView(R.layout.splash);
	}
	
}
