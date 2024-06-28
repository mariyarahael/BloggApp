package com.example.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.signinbut);
        b2=(AppCompatButton) findViewById(R.id.signupbut);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String getUserName = e1.getText().toString();
              String getPassword = e2.getText().toString();

              if((getUserName.equals("admin"))&&(getPassword.equals("12345")))
              {
                  Intent i = new Intent(getApplicationContext(),SignInMenu.class);
                  startActivity(i);
              }
              else
              {
                  Toast.makeText(getApplicationContext(),"invalid",Toast.LENGTH_LONG).show();
              }
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent ir=new Intent(getApplicationContext(),SignUpPage.class);
            startActivity(ir);
            }
        });

    }
}