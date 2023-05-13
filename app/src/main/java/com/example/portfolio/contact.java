package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class contact extends AppCompatActivity {
       private EditText nm,ms;
       private Firebase Ref;
       ConstraintLayout bt;
       ImageView instagram,linkd,facebook,twitter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        nm=findViewById(R.id.name);
        ms=findViewById(R.id.chat);
        bt=findViewById(R.id.button);
        instagram=findViewById(R.id.insta);
        linkd=findViewById(R.id.lin);
        facebook=findViewById(R.id.fb);
        twitter=findViewById(R.id.tw);

        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://portfolio-db03a-default-rtdb.firebaseio.com/");

        // feedback button
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=nm.getText().toString();
                String message=ms.getText().toString();
                Firebase rname=Ref.child("Username");
                rname.setValue(user);

                Firebase feedback=Ref.child("Feedback");
                feedback.setValue(message);

                Toast.makeText(contact.this, "Message Sended", Toast.LENGTH_LONG).show();

            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://instagram.com/guptaarastu?igshid=OTk0YzhjMDVlZA==");
            }
        });

        linkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/iamarastu");
            }
        });


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/arastu.gupta.7");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/arastugupta_?t=n7Q6-zCgEM8iJtx1OUJJvw&s=09");
            }
        });


    }



    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}