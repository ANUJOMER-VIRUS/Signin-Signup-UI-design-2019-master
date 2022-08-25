package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SignInActivity extends AppCompatActivity {

    TextView textView;
    EditText inputMobile;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

         final EditText inputMobile = findViewById(R.id.inputmobile);
         FloatingActionButton buttononGetOTP = findViewById(R.id.buttonGetOTP);

         buttononGetOTP.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (inputMobile.getText().toString().trim().isEmpty()){
                     Toast.makeText(SignInActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                     return;
                 }
                 Intent intent = new Intent(getApplicationContext(),OtpActivity.class);
                 intent.putExtra("mobile",inputMobile.getText().toString());
                 startActivity(intent);
             }
         });


    }
}