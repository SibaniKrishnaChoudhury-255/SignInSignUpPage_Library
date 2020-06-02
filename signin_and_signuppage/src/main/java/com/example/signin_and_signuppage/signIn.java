package com.example.signin_and_signuppage;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class signIn extends LinearLayout {
    EditText editText_one,editText_two;
    Button login_button;
    TextView move_toAnotherPage,headerTitle;

    public signIn(Context context) {
        super(context);
        init(context);
    }

    public signIn(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public signIn(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context){

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.signin,this,true);

        editText_one=findViewById(R.id.email);
        editText_two=findViewById(R.id.password);
        login_button=findViewById(R.id.signIn_button);
        move_toAnotherPage=findViewById(R.id.move_to_signUp_Page);
        headerTitle=findViewById(R.id.header_title);
    }

    public  String getfromEditTextOne(){
        return editText_one.getText().toString();
    }

    public  String getfromEditTextTwo(){
        return editText_two.getText().toString();
    }

    public signIn moveToSignUpScreen(final ClickedListner clickedListner){
        move_toAnotherPage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedListner.onClick();
            }
        });
        return this;
    }

    public signIn setEditTextOnehint(String hint1){
        editText_one.setHint(hint1);
        return this;
    }

    public signIn setEditTextTwohint(String hint2){
        editText_two.setHint(hint2);
        return this;
    }

    public signIn setButtonBackgroundColor(String buttonBackgroundColor){
        login_button.setBackgroundColor(Color.parseColor(buttonBackgroundColor));
        return this;
    }
    public signIn setButtonText(String buttontext){
        login_button.setText(buttontext);
        return this;
    }

    public signIn setButtonTextColor(String buttontextColor){
        login_button.setTextColor(Color.parseColor(buttontextColor));
        return this;
    }

    public signIn setheaderTitle(String headertitle){
        headerTitle.setText(headertitle);
        return this;
    }
    public signIn setheaderColor(String headerColor){
        headerTitle.setTextColor(Color.parseColor(headerColor));
        return this;
    }

    public signIn setFootertextColor(String footertextColor){
        move_toAnotherPage.setTextColor(Color.parseColor(footertextColor));
        return this;
    }

    public signIn setFootertext(String footertext){
        move_toAnotherPage.setText(footertext);
        return this;
    }
    public void setSignInClickListener(final ClickedListner clickListener){
        login_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick();
            }
        });
    }

}
