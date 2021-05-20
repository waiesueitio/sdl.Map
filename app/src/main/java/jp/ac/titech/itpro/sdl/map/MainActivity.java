package jp.ac.titech.itpro.sdl.map;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import jp.ac.titech.itpro.sdl.map.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.button);

        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MapActivity.class);
            startActivity(intent);
        });
    }
}