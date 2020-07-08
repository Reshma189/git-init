package com.example.zoomkart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etMob,etPassword;
    private Button btnLogin;
    String Mobstring,passstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etMob=(EditText)findViewById(R.id.etMob);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Mobstring=etMob.getText().toString();
                passstring=etPassword.getText().toString();

                if(Mobstring.equals("0123456789") && passstring.equals("1234"))
                {
                    startActivity(new Intent(LoginActivity.this,ShopActivity.class));
                }
                else
                    {
                    Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}