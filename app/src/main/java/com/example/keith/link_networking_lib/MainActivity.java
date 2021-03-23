package com.example.keith.link_networking_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.ConnectivityCheck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lets check on connectivity
        ConnectivityCheck mc = new ConnectivityCheck(this);
        boolean b = mc.isNetworkReachable();
        b= mc.isWifiReachable();
    }
}
