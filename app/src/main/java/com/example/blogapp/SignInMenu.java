package com.example.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInMenu extends AppCompatActivity {
AppCompatButton bsi1,bsi2,bsi3,bsi4,bsi5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in_menu);

        bsi1=(AppCompatButton) findViewById(R.id.addbut);
        bsi2=(AppCompatButton) findViewById(R.id.srchbut);
        bsi3=(AppCompatButton) findViewById(R.id.dltbut);
        bsi4=(AppCompatButton) findViewById(R.id.viewbut);
        bsi5=(AppCompatButton) findViewById(R.id.logoutbut);

        bsi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(), AddPostPage.class);
                startActivity(i1);
            }
        });

        bsi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(), SearchPostPage.class);
                startActivity(i2);
            }
        });

        bsi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(), DeletePostPage.class);
                startActivity(i3);
            }
        });

        bsi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(), ViewPostPage.class);
                startActivity(i4);
            }
        });

        bsi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref=getSharedPreferences("logg",MODE_PRIVATE);
                SharedPreferences.Editor editor=pref.edit();
                editor.clear();
                editor.apply();
                Intent i5= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i5);
            }
        });

    }
}