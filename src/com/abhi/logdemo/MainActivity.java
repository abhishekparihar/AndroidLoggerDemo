package com.abhi.logdemo;

import com.abhi.logdemo.helpers.LogUtils;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private static String  TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onResume() {
		LogUtils.LOGV(TAG, "In onResume...");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		LogUtils.LOGI(TAG, "In onPause...");
		super.onPause();
	}

}
