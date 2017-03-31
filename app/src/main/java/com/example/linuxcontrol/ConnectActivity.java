package com.example.linuxcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class ConnectActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        Intent intent=getIntent();
        String addr=intent.getStringExtra("com.example.LinuxControl.ADDR");
        TextView address=new TextView(this);
        address.setTextSize(40);
        address.setText(addr);

        String p=intent.getStringExtra("com.example.LinuxControl.PORT");
        TextView port=new TextView(this);
        port.setTextSize(30);
        port.setText(p);

        SeekBar volume=new SeekBar(this);
        Button mute=new Button(this);
        mute.setText("Mute");

        ViewGroup layout=(ViewGroup)findViewById(R.id.activity_connect);
        layout.addView(address);
        layout.addView(port);
        layout.addView(volume);
        layout.addView(mute);
    }
}
