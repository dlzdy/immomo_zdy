package com.jeenms.momo;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnReturn;
    private Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        initEvents();
    }

    private void initViews() {
        mBtnReturn = (Button)findViewById(R.id.btn_return);
        mBtnLogin = (Button)findViewById(R.id.btn_login);
    }

    private void initEvents() {
        mBtnReturn.setOnClickListener(this);
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case R.id.btn_return:
               finish();
               break;
           case R.id.btn_login:
               login();
               break;

       }
    }

    /**
     * 登录操作-->MainTabActivity
     */
    private void login() {
        //“启动任务执行的输入参数”、“后台任务执行的进度”、“后台计算结果的类型”
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... voids) {
                return true;
            }

            @Override
            protected void onPostExecute(Boolean result) {
                super.onPostExecute(result);
                if (result){
                    Intent intent = new Intent(LoginActivity.this, MainTabActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }.execute();
    }
}
