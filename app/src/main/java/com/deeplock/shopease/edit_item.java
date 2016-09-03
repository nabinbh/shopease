package com.deeplock.shopease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;


public class edit_item extends AppCompatActivity {

    Button mButton;
    ShoppingItem s = new ShoppingItem();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        mButton = (Button)findViewById(R.id.button);
        Date date = new Date(System.currentTimeMillis());
        s.setDate(date);
        mButton.setText(s.getDate().toString());
    }
}
