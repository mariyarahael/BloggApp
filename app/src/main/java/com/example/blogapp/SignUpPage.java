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

public class SignUpPage extends AppCompatActivity {
EditText er1,er2,er3,er4,er5,er6;
AppCompatButton br1,br2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_page);

        er1=(EditText) findViewById(R.id.name);
        er2=(EditText) findViewById(R.id.mail);
        er3=(EditText) findViewById(R.id.mob);
        er4=(EditText) findViewById(R.id.username);
        er5=(EditText) findViewById(R.id.passw);
        er6=(EditText) findViewById(R.id.cpassw);
        br1=(AppCompatButton) findViewById(R.id.regsbut);
        br2=(AppCompatButton) findViewById(R.id.backbut);

        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
            }
        });

        br2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ib);
            }
        });

    }
}