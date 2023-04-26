package com.example.projek_tam;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class login_page_activity extends Activity {

	
	private View _bg__login_page;
	private View rectangle_3;
	private TextView username_ek1;
	private View rectangle_5;
	private TextView password;
	private TextView hi;
	private TextView welcome_again_;
	private TextView please_fill_in_your_correct_details_;
	private View rectangle_5_ek1;
	private TextView login;
	private View rectangle_5_ek2;
	private TextView continue_with_google;
	private TextView or;
	private View rectangle_5_ek3;
	private TextView _create_new_account;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);

		
		_bg__login_page = (View) findViewById(R.id._bg__login_page);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		username_ek1 = (TextView) findViewById(R.id.username_ek1);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		password = (TextView) findViewById(R.id.password);
		hi = (TextView) findViewById(R.id.hi);
		welcome_again_ = (TextView) findViewById(R.id.welcome_again_);
		please_fill_in_your_correct_details_ = (TextView) findViewById(R.id.please_fill_in_your_correct_details_);
		rectangle_5_ek1 = (View) findViewById(R.id.rectangle_5_ek1);
		login = (TextView) findViewById(R.id.login);
		rectangle_5_ek2 = (View) findViewById(R.id.rectangle_5_ek2);
		continue_with_google = (TextView) findViewById(R.id.continue_with_google);
		or = (TextView) findViewById(R.id.or);
		rectangle_5_ek3 = (View) findViewById(R.id.rectangle_5_ek3);
		_create_new_account = (TextView) findViewById(R.id._create_new_account);
	
		
		_create_new_account.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), create_account_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	