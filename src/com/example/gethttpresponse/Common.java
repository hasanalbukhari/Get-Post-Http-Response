package com.example.gethttpresponse;

import android.util.Log;

public class Common {

	static final boolean LOG = true;
	
	public static void loggingError(String logString, Exception ex) {
		if (LOG)
			Log.e("KORA.COM", logString, ex);
	}

	public static void logging(String logString) {
		if (LOG) {
			int maxLogSize = 999;
			for (int i = 0; i <= logString.length() / maxLogSize; i++) {
				int start = i * maxLogSize;
				int end = (i + 1) * maxLogSize;
				end = end > logString.length() ? logString.length() : end;
				Log.d("KORA.COM", logString.substring(start, end));
			}
		}
	}
	
}
