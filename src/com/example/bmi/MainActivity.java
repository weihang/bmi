package com.example.bmi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText height;
	private EditText weight;
	private Button button;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		height=(EditText) findViewById(R.id.editText1);
		weight=(EditText) findViewById(R.id.editText2);
		button = (Button) findViewById(R.id.button1);
		textView=(TextView) findViewById(R.id.textView2);
		button.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				String text = height.getText().toString();
				textView.setText(text);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
