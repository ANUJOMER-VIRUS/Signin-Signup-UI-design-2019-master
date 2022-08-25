package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chaos.view.PinView;

public class OtpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        TextView textMobile = findViewById(R.id.mobile);
        textMobile.setText(String.format(
                "+91-%s",getIntent().getStringExtra("mobile")
        ));

           Button verify =findViewById(R.id.verify) ;
           verify.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent =new Intent(OtpActivity.this,
                           HomeActivity.class);
                   startActivity(intent);
               }
           });
    }



}