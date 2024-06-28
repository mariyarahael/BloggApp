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

public class AddPostPage extends AppCompatActivity {
EditText eap;
AppCompatButton bap1,bap2,bap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_post_page);

        eap=(EditText) findViewById(R.id.write);
        bap1=(AppCompatButton) findViewById(R.id.afgbut);
        bap2=(AppCompatButton) findViewById(R.id.postbut);
        bap3=(AppCompatButton) findViewById(R.id.backbut);

        bap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Select",Toast.LENGTH_SHORT).show();

            }
        });
        bap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Posted",Toast.LENGTH_SHORT).show();
            }
        });

        bap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), SignInMenu.class);
                startActivity(i);
            }
        });

    }
}