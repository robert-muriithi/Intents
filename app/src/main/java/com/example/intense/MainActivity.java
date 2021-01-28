package com.example.intense;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.intense.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        mainBinding.btnStartCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone= "+254705381655";
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.fromParts("Tel",phone,null));
                startActivity(intent);
            }
        });
        mainBinding.btnStartText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Uri uri= Uri.parse("+254705381655");
             Intent intent= new Intent(Intent.ACTION_SENDTO,uri);
             intent.putExtra("sms_body","Goodnight");
             startActivity(intent);
            }
        });
        mainBinding.btnGoToGithubActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("https://www.github.com/robert-muriithi"));
               startActivity(intent);
            }
        });
    }
}