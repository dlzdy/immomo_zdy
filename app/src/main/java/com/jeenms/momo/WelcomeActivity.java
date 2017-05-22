package com.jeenms.momo;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WelcomeActivity extends AppCompatActivity {

    private Button mBtnRegister;
    private Button mBtnLogin;
    private ImageButton mIbtnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
        initEvents();
    }

    private void initViews() {
        //register
        mBtnRegister = (Button)findViewById(R.id.btn_register);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(RegisterActivity.class);
            }
        });
        //login
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(LoginActivity.class);
            }
        });
        //about
        mIbtnAbout = (ImageButton)findViewById(R.id.ibtn_about);
        mIbtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(AboutActivity.class);
            }
        });

    }


    private void startActivity(Class activityClass) {
        Intent intent = new Intent();
        intent.setClass(WelcomeActivity.this, activityClass);
        startActivity(intent);
    }

    private void initEvents() {
    }

}
