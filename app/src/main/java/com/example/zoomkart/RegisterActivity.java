package com.example.zoomkart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView tvCreateAcc;
    EditText etFullName,etPhone,etAddress,etMail,etPass,etConPass;
    Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tvCreateAcc=findViewById(R.id.tvCreateAcc);
        etFullName=findViewById(R.id.etFullName);
        etPhone=findViewById(R.id.etPhone);
        etAddress=findViewById(R.id.etAddress);
        etMail=findViewById(R.id.etMail);
        etPass=findViewById(R.id.etPass);
        etConPass=findViewById(R.id.etConPass);
        btnReg=findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}