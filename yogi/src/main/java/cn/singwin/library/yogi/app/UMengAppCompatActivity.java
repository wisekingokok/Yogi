package cn.singwin.library.yogi.app;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;

import cn.singwin.library.yogi.constants.Prefer;

/**
 * Base on BaseAppCompatActivity, this Activity support Umeng Analysis. Of cause, use this Activity need manual set key of Umeng in own project.
 * Created by Yogi on 2015/12/3.
 */
public class UMengAppCompatActivity extends BaseAppCompatActivity{



    @Override
    protected void onResume() {
        super.onResume();
        boolean debug = ctx.getSharedPreferences(Prefer.NAME, Context.MODE_PRIVATE).getBoolean(Prefer.DEBUG, false);
        if(!debug) {
            MobclickAgent.onResume(ctx);
        }
    }

    @Override
    protected void onPause() {
        boolean debug = ctx.getSharedPreferences(Prefer.NAME, Context.MODE_PRIVATE).getBoolean(Prefer.DEBUG, false);
        if(!debug) {
            MobclickAgent.onPause(ctx);
        }
        super.onPause();
    }

}
