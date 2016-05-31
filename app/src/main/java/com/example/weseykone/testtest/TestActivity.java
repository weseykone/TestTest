package com.example.weseykone.testtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView testText;
    BluetoothArduino mBlue = BluetoothArduino.getInstance("bullshibrenjqorfw'kqdlmerkt");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        testText = (TextView) findViewById(R.id.testText);

        mBlue.Connect();
    }

    public void test(View view) {
        String message = mBlue.getLastMessage();
        testText.setText(message);
    }

}
