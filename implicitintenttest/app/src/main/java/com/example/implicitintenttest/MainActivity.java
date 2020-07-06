package com.example.implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenURL(View view) {
        Uri u = Uri.parse("https://www.google.com");
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }

    public void Call(View view) {
        Uri uri = Uri.parse("tel:123456789");
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void mylocation(View view) {
        //To Zoom
        // Uri mapsuri = Uri.parse("geo:16.4649° N, 80.5078?z=21");
        //searching restaurants
       //Uri mapsuri = Uri.parse("geo:16.4649° N, 80.5078?q=<16.4649>,<80.5078>");
        Uri mapsuri = Uri.parse("geo:16.4649° N, 80.5078?q=restaurants");
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW,mapsuri);
                if (mapsIntent.resolveActivity(getPackageManager())!= null){
                    startActivity(mapsIntent);
                }
    }
}