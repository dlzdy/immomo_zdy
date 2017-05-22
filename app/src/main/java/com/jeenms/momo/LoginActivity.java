package com.jeenms.momo;

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
               //TODO
               break;

       }
    }
}
