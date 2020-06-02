package com.example.signin_and_signup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.signin_and_signuppage.ClickedListner;
import com.example.signin_and_signuppage.signIn;

public class signInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

       final signIn  signInPage=findViewById(R.id.signin);
        signInPage.setButtonText("Login")
        .setEditTextOnehint("phone Number")
        .setEditTextTwohint("Password");

        signInPage.setSignInClickListener(new ClickedListner() {
            @Override
            public void onClick() {
                final  String name=signInPage.getfromEditTextOne();
                final String password=signInPage.getfromEditTextTwo();
                Toast.makeText(signInActivity.this, ""+name+" "+password , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
