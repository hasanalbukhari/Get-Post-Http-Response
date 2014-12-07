package com.example.gethttpresponse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements HttpResponsered {

	public TextView stateTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		stateTextView = (TextView)findViewById(R.id.stateTextView);
		
		new HttpClientThread().execute(this, "https://api.uniparthenope.it/user/radius/auth", 
				new String[]{"user", "passw"}, new String[]{"user", "pass"});
		
		stateTextView.setText("Getting Data...");
	}

	@Override
	public void responseWithError(String error, Object... parameters) {
		stateTextView.setText("Getting Data Fail... " + error);
	}

	@Override
	public void response(String response, Object... parameters) {
		stateTextView.setText(response);
	}
}
