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

public class SearchPostPage extends AppCompatActivity {
    EditText esp;
    AppCompatButton bsp1,bsp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_post_page);

        esp=(EditText) findViewById(R.id.search);
        bsp1=(AppCompatButton) findViewById(R.id.searchbut);
        bsp2=(AppCompatButton) findViewById(R.id.backbut);

        bsp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getSearch= esp.getText().toString();
                Toast.makeText(getApplicationContext(),getSearch,Toast.LENGTH_SHORT).show();
            }
        });

        bsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), SignInMenu.class);
                startActivity(i);
            }
        });

    }
}