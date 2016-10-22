package com.example.listeners;

public interface OnAsyncTaskListener {
	void onAsyncTaskPreExecute(int taskType);
	void onAsyncTaskProgressUpdate(int taskType, Object values);
	void onAsyncTaskPostExecute(int taskType, Object result);
	void onAsyncTaskCancelled(int taskType, Object result);
}
