package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    ConstraintLayout cs;
    ConstraintLayout cl;
    ConstraintLayout pr;
    ConstraintLayout tc;
    ConstraintLayout mo;
    ConstraintLayout ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cs=findViewById(R.id.cert);
        cl=findViewById(R.id.edu);
        pr=findViewById(R.id.pro);
        tc=findViewById(R.id.tech);
        mo=findViewById(R.id.more);
        ct=findViewById(R.id.cont);

        //navigate to certificate
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,cer.class);
                startActivity(intent);
            }
        });

        //navigate to education

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,edu.class);
                startActivity(intent);
            }
        });

        //navigate to projects

        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,project.class);
                startActivity(intent);
            }
        });

        //navigate to skills

        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,skills.class);
                startActivity(intent);
            }
        });

        //navigate to more of me

        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,myself.class);
                startActivity(intent);
            }
        });

        //navigate to contact me

        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,contact.class);
                startActivity(intent);
            }
        });
    }
}