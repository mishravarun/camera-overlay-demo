package com.varunmishra.test;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.varunmishra.catcameraoverlay.CameraViewActivity;
import com.varunmishra.catcameraoverlay.Config;
import com.varunmishra.catcameraoverlay.OnCatPetListener;

public class MainActivity extends AppCompatActivity implements OnCatPetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view) {
        Config.catName = "Kitty";
        Config.catLatitude = 43.706844;
        Config.catLongitude = -72.2876208;
        Config.locDistanceRange = 30;
        Config.useLocationFilter = false; // use this only for testing. This should be true in the final app.
        Config.onCatPetListener = this;
        Intent i = new Intent(this, CameraViewActivity.class);
        startActivity(i);
    }

    @Override
    public void onCatPet(String catName) {
        Toast.makeText(this,"You just Pet - " + catName, Toast.LENGTH_LONG).show();
    }
}
