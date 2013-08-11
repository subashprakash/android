package com.example.hey;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
   int counter;
	  Button add,sub;
	  TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=0;
        add = (Button) findViewById(R.id.Add);
        sub = (Button) findViewById(R.id.subtract);
        display = (TextView) findViewById(R.id.display);
        
        add.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter=counter+1;
				display.setText("your total now"+counter);
			}
		});
        
sub.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText(""+counter);
			}
		});
    }
    
    
}     
        
    

