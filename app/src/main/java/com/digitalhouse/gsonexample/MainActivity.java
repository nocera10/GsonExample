package com.digitalhouse.gsonexample;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            AssetManager assetManager = getAssets();
            InputStream myJson = assetManager.open("news.json");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myJson));
            Gson myGson = new Gson();
            NewsResponse newsResponse = myGson.fromJson(bufferedReader, NewsResponse.class);
            Log.i("TAG", "onCreate " + newsResponse.getNews().get(0).getTitle());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
