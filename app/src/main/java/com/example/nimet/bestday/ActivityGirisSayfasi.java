package com.example.nimet.bestday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityGirisSayfasi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference myRef = database.getReference("users/");

    Button Kayıt = (Button) findViewById(R.id.Button);


        Kayıt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            myRef.child("Omuras").child("UserId").setValue("Murat");
            myRef.child("Omuras").child("Adı").setValue("Mert");
            myRef.child("Omuras").child("Soyadı").setValue("Ali");
            myRef.child("Omuras").child("Numara").setValue("124124");
            myRef.child("Omuras").child("Deneme").setValue("22");

        }
    });

    }


}



