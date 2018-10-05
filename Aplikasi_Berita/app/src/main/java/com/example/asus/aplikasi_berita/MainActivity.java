package com.example.asus.aplikasi_berita;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View view){
    Intent intent  = new Intent ( this, berita00,class);
     startActivity(Intent);
    }
    public void sendMessage2 (View view){
            Intent intent = new Intent( this, berita001,class);
}
}
