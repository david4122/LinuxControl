package com.example.linuxcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connect(View v){
        Intent intent=new Intent(this, ConnectActivity.class);
        EditText et=(EditText)findViewById(R.id.address);
        String addr=et.getText().toString();
        intent.putExtra("com.example.LinuxControl.ADDR", addr);
        EditText port=(EditText)findViewById(R.id.port);
        String p=port.getText().toString();
        intent.putExtra("com.example.LinuxControl.PORT", p);
        startActivity(intent);
    }
}
