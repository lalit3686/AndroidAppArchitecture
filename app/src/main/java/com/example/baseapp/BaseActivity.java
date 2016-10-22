package com.example.baseapp;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {

	private static final String TAG = BaseActivity.class.getSimpleName();

	abstract void initComponents();
	abstract void addListeners();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
}
