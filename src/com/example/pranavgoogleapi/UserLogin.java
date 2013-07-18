package com.example.pranavgoogleapi;

import com.google.android.gms.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserLogin extends Activity {

	final static String USERNAME = "Pranav";
	final static String PASSWORD = "123456";
	private Context context;
	EditText username, password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.rootactivity);
		context = this;
		username = (EditText) findViewById(R.id.login_id);
		password = (EditText) findViewById(R.id.ed_passowrd);

	}
	
	
	public void bt_Submit(View v){
		Log.d("Username", username.getText().toString());
		
		if(username.getText().toString().equalsIgnoreCase(USERNAME))
		{
			if(password.getText().toString().equalsIgnoreCase(PASSWORD)){
				Intent intent = new Intent(this,Main.class);
				startActivity(intent);
				
			}else{
				Toast.makeText(context, "You Entered Wrong Password", Toast.LENGTH_LONG).show();
			}
				
		}else{
			Toast.makeText(context, "You Entered Wrong Username", Toast.LENGTH_LONG).show();
		}
		
		
	}

}
