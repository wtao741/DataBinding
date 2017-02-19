package test.com.testdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import test.com.testdemo.bean.User;
import test.com.testdemo.databinding.ActivityMainBinding;
import test.com.testdemo.imp.Click;

public class MainActivity extends AppCompatActivity{

    private User user;
    private ActivityMainBinding mainBinding;
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMainBinding 根据layout文件名而来
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        user = new User("赵子龙",""+26);
        mainBinding.setUser(user);
        mainBinding.setPresenter(new Presenter());
    }

    public class Presenter{
        //内容改变监听
        public void onTextChanged(CharSequence s, int start, int before, int count){
            user.name = s.toString();
            mainBinding.setUser(user);
        }
        //点击事件
        public void onClick(View view){
            Toast.makeText(MainActivity.this,"Hello!",Toast.LENGTH_LONG).show();
        }

        public void onClickBinding(User user){
            Toast.makeText(MainActivity.this,"Hello!"+user.name,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
    }
}
