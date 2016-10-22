package com.example.application;

import android.app.Application;

public class MyApplication extends Application{

	private static final String TAG = MyApplication.class.getSimpleName();
	private static MyApplication instance;

	@Override
	public void onCreate() {
		super.onCreate();
		
		instance = this;
	}
	
	public static MyApplication getApplicationInstance() {
		return instance;
	}
}
