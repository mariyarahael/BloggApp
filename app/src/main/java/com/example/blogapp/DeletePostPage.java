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

public class DeletePostPage extends AppCompatActivity {
    EditText edp;
    AppCompatButton bdp1,bdp2,bdp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete_post_page);


        edp=(EditText) findViewById(R.id.search);
        bdp1=(AppCompatButton) findViewById(R.id.searchbut);
        bdp2=(AppCompatButton) findViewById(R.id.deletebut);
        bdp3=(AppCompatButton) findViewById(R.id.backbut);

        bdp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getSearch= edp.getText().toString();
                Toast.makeText(getApplicationContext(),getSearch,Toast.LENGTH_SHORT).show();
            }
        });

        bdp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selected post deleted",Toast.LENGTH_SHORT).show();
            }
        });

        bdp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), SignInMenu.class);
                startActivity(i);
            }
        });


    }
}