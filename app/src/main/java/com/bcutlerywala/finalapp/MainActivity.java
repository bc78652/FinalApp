package com.bcutlerywala.finalapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void tryLogin(View view) {

        EditText usernameEditText = (EditText) findViewById(R.id.emailText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordText);

        String username = usernameEditText.getText().toString();
        String passwordEntered = passwordEditText.getText().toString();

        Log.i("Info", "Username is:" + username);
        Log.i("Info", "Password entered is:" + passwordEntered);
    }

    public void goToRegister(View view) {
        //Create and Intent in order ot launch the Register Activity
        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.bcutlerywala.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("test@test.com", "password").apply();

    }

}
