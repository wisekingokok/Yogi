package cn.singwin.library.yogi.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cn.singwin.library.yogi.constants.Prefer;

/**
 * A base Activity base on AppCompatActivity.
 * Created by Yogi on 2015/12/3.
 */
public class BaseAppCompatActivity extends AppCompatActivity {
    protected Context ctx;
    protected SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.ctx = this;
        this.preferences = getPreferences(MODE_PRIVATE);
    }

    protected  void setDebug(boolean debugable){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(Prefer.DEBUG, debugable);
        editor.commit();
    }

    /**
     * easy to show toast
     * @param res content resource id
     */
    protected void toastMsg(int res){
        Toast.makeText(ctx, res, Toast.LENGTH_SHORT).show();
    }

    /**
     * easy to show toast
     * @param res content
     */
    protected void toastMsg(String res){
        Toast.makeText(ctx, res, Toast.LENGTH_SHORT).show();
    }
}
