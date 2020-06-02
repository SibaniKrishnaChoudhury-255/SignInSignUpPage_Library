package com.example.signin_and_signuppage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class signUp extends LinearLayout {
    EditText editText_one,editText_two,getEditText_three;
    Button signUp_button;
    TextView move_toAnotherPage,headerTitle;

    public signUp(Context context) {
        super(context);
        init(context);
    }

    public signUp(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public signUp(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.signup,this,true);
        editText_one=findViewById(R.id.register_email);
        editText_two=findViewById(R.id.password_register);
        getEditText_three=findViewById(R.id.name);
        signUp_button=findViewById(R.id.signUp_btn);
        move_toAnotherPage=findViewById(R.id.move_to_signIn_page);
        headerTitle=findViewById(R.id.register_header_title);
    }

    public  String getfromEditTextOne(){
        return editText_one.getText().toString();
    }

    public  String getfromEditTextTwo(){
        return editText_two.getText().toString();
    }
    public  String getfromEditTextThree(){
        return getEditText_three.getText().toString();
    }

    public signUp setEditTextOnehint(String hint1){
        editText_one.setHint(hint1);
        return this;
    }

    public signUp moveToSignInScreen(final ClickedListner clickedListner){
       move_toAnotherPage.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               clickedListner.onClick();
           }
       });
       return this;
    }

    public signUp setEditTextTwohint(String hint2){
        editText_two.setHint(hint2);
        return this;
    }

    public signUp setEditTextThreehint(String hint3){
        getEditText_three.setHint(hint3);
        return this;
    }

    public signUp setButtonBackgroundColor(String buttonBackgroundColor){
        signUp_button.setBackgroundColor(Color.parseColor(buttonBackgroundColor));
        return this;
    }
    public signUp setButtonText(String buttontext){
        signUp_button.setText(buttontext);
        return this;
    }

    public signUp setButtonTextColor(String buttontextColor){
        signUp_button.setTextColor(Color.parseColor(buttontextColor));
        return this;
    }

    public signUp setheaderTitle(String headertitle){
        headerTitle.setText(headertitle);
        return this;
    }
    public signUp setheaderColor(String headerColor){
        headerTitle.setTextColor(Color.parseColor(headerColor));
        return this;
    }

    public signUp setFootertextColor(String footertextColor){
        move_toAnotherPage.setTextColor(Color.parseColor(footertextColor));
        return this;
    }

    public signUp setFootertext(String footertext){
        move_toAnotherPage.setText(footertext);
        return this;
    }

    public signUp setSignUpButtonClickListner(final ClickedListner clickListner){
        signUp_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListner.onClick();
            }
        });
        return this;
    }
}
