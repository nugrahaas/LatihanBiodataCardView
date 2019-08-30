package com.example.latihanbiodatacardview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    int followers = 763;
    String polow = "Follow";
    TextView tv_followers;
    Button btn_polow;
    int kode_polow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void terKlik(View view) {
        tv_followers = findViewById(R.id.tv_followers);
        btn_polow = findViewById(R.id.btn_follow);

        if (kode_polow == 0) {
            followers += 1;
            polow = "Followed";

            System.out.println("tv");

            tv_followers.setText(followers + "");

            System.out.println("btn");
            btn_polow.setText(polow);

            kode_polow = 1;

            Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();
        }
        else if (kode_polow == 1 ){
            followers -= 1;
            polow = "Follow";

            System.out.println("tv");

            tv_followers.setText(followers + "");

            System.out.println("btn");
            btn_polow.setText(polow);

            kode_polow = 0;
            Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_SHORT).show();
        }
    }
}
