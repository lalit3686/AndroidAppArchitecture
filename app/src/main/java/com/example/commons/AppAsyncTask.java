package com.example.commons;

import android.os.AsyncTask;

import com.example.listeners.OnAsyncTaskListener;

public class AppAsyncTask extends AsyncTask<Object, Object, Object>{

	private static final String TAG = AppAsyncTask.class.getSimpleName();
	private OnAsyncTaskListener onAsyncTaskListener;
	private int taskType;

	public AppAsyncTask(OnAsyncTaskListener onAsyncTaskListener) {
		this.onAsyncTaskListener = onAsyncTaskListener;
	}

	public AppAsyncTask addTaskType(int taskType) {
		this.taskType = taskType;
		return this;
	}
	
	@Override
	protected void onPreExecute() {
		onAsyncTaskListener.onAsyncTaskPreExecute(taskType);
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		switch (taskType) {
		}
		return null;
	}
	
	@Override
	protected void onProgressUpdate(Object... values) {
		switch (taskType) {
		}
		onAsyncTaskListener.onAsyncTaskProgressUpdate(taskType, values);
	}

	@Override
	protected void onPostExecute(Object result) {
		switch (taskType) {
		}
		onAsyncTaskListener.onAsyncTaskPostExecute(taskType, result);
	}
	
	@Override
	protected void onCancelled(Object result) {
		onAsyncTaskListener.onAsyncTaskCancelled(taskType, result);
	}
}
