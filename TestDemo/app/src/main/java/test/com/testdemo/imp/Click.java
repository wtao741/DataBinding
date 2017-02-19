package test.com.testdemo.imp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import test.com.testdemo.MainActivity;

/**
 * Created by Ling、 on 2017/2/18.
 */

public class Click {
    private Context mContext;

    public Click(Context context) {
        mContext = context;
    }

    public void onClick(View view) {
        Toast.makeText(mContext, "Hello!", Toast.LENGTH_LONG).show();
    }
}
