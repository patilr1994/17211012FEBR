package com.codekul.uixml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(new Click());
    }

    private class Click implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            TextView txtDate = (TextView) findViewById(R.id.txtDate);
            txtDate.setText(new Date().toString());
        }
    }
}
