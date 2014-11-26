package com.syncteam.sync;

import com.example.textmessagetest.R;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TextSender extends Activity {

	Button button;
	EditText editPhoneNum;
	EditText editSMS;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layoutdescription);

		button = (Button) findViewById(R.id.button);
		editPhoneNum = (EditText) findViewById(R.id.editPhoneNum);
		editSMS = (EditText) findViewById(R.id.editSMS);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String phoneNo = editPhoneNum.getText().toString();
				String sms = editSMS.getText().toString();

				try {
					SmsManager smsManager = SmsManager.getDefault();
					smsManager.sendTextMessage(phoneNo, null, sms, null, null);
					Toast.makeText(getApplicationContext(), "SMS Sent!",
							Toast.LENGTH_LONG).show();
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(),
							"SMS faild, please try again later!",
							Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}

			}
		});
	}
}

/*
 * import android.support.v7.app.ActionBarActivity; import android.os.Bundle;
 * import android.view.Menu; import android.view.MenuItem;
 * 
 * 
 * public class TextSender extends ActionBarActivity {
 * 
 * @Override protected void onCreate(Bundle savedInstanceState) {
 * super.onCreate(savedInstanceState);
 * setContentView(R.layout.layoutdescription); }
 * 
 * 
 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
 * menu; this adds items to the action bar if it is present.
 * getMenuInflater().inflate(R.menu.text_sender, menu); return true; }
 * 
 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
 * action bar item clicks here. The action bar will // automatically handle
 * clicks on the Home/Up button, so long // as you specify a parent activity in
 * AndroidManifest.xml. int id = item.getItemId(); if (id ==
 * R.id.action_settings) { return true; } return
 * super.onOptionsItemSelected(item); } }
 */
