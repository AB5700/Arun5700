package com.example.tabapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost host=(TabHost)findViewById(R.id.tabHost);
		host.setup();
		
		// Tab First
		TabHost.TabSpec spec= host.newTabSpec("Personal Info");
		spec.setContent(R.id.tab1);
		spec.setIndicator("Personal Information");
		host.addTab(spec);
		//Tab 2
        spec = host.newTabSpec("Account Info");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Account Information");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Order Info");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Order Information");
        host.addTab(spec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
