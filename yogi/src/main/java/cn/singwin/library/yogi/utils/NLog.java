package cn.singwin.library.yogi.utils;

import android.content.Context;
import android.util.Log;

import cn.singwin.library.yogi.constants.Constants;
import cn.singwin.library.yogi.constants.Prefer;


/**
 * Print log on logcat.
 * Created by Yogi on 2015/12/3.
 */
public final class NLog {

	/**
	 * info level
	 * @param ctx context
	 * @param obj message
	 */
	public static final void i(Context ctx, Object obj){
		boolean debug = ctx.getSharedPreferences(Prefer.NAME, Context.MODE_PRIVATE).getBoolean(Prefer.DEBUG, false);
		if(debug) {
			Log.i(Constants.TAG, obj == null ? "is null" : obj.toString());
		}
	}

	/**
	 * error level
	 * @param ctx context
	 * @param t message
	 */
	public static final void e(Context ctx, Throwable t){
		boolean debug = ctx.getSharedPreferences(Prefer.NAME, Context.MODE_PRIVATE).getBoolean(Prefer.DEBUG, false);
		if(debug) {
            Log.e(Constants.TAG, t == null ? "exception is null" : t.getMessage(), t);
        }
	}
}
