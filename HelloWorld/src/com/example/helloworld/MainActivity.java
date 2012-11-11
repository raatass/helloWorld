package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	/* Variables */
	int counter = 0;
	Button add, sub;
	TextView display;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // init
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSubtract);
        display = (TextView) findViewById(R.id.tvDisplay);
        display.setText("Total sum is " + counter);
        add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				counter++;
				display.setText("Total sum is " + counter);
				
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Total sum is " + counter);
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
