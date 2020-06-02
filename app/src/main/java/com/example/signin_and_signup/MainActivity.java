package com.example.signin_and_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.signin_and_signuppage.ClickedListner;
import com.example.signin_and_signuppage.signUp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     final signUp signUpPage=findViewById(R.id.signup);

        signUpPage.setButtonText("Sign Up")
        .setSignUpButtonClickListner(new ClickedListner() {
            @Override
            public void onClick() {
                String name = signUpPage.getfromEditTextThree();
                String email = signUpPage.getfromEditTextOne();
                String password = signUpPage.getfromEditTextTwo();
                Toast.makeText(MainActivity.this, " "+name+" "+email+" "+password, Toast.LENGTH_SHORT).show();
            }
        })
        .moveToSignInScreen(new ClickedListner() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "Attach your Screen", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
