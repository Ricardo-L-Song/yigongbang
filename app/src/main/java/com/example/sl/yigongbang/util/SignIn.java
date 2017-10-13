package com.example.sl.yigongbang.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sl.yigongbang.R;

import org.w3c.dom.Text;

public class SignIn extends AppCompatActivity {
    ImageView back;
    TextView LoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        back = (ImageView)findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SignIn.this,LoginMain.class);
                startActivity(it);
            }
        });
        LoginButton=(TextView)findViewById(R.id.signin2);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent im=new Intent(SignIn.this,MainActivity.class);
                startActivity(im);
            }
        });

    }
}
