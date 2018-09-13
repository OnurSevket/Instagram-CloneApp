package io.github.onursevket.instagramcloneui.Activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import io.github.onursevket.instagramcloneui.R;


public class LoginActivity extends AppCompatActivity {

    TextView textView;
    Typeface typeface;//ALt+Enter yap importlar için

    EditText etEmail,etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        typeface=Typeface.createFromAsset(getAssets(),"font/Billabong.ttf");
        textView=(TextView)findViewById(R.id.textView2);
        textView.setTypeface(typeface);


        btnLogin=(Button)findViewById(R.id.btnLogin);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPassword=(EditText)findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=etEmail.getText().toString();
                String password=etPassword.getText().toString();

                if("root".equals(email)&&"1234".equals(password)){
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Login Error",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
