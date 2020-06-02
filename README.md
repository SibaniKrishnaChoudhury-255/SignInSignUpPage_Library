# SignInSignUpPage_Library
[![platform](https://img.shields.io/badge/platform-android-green)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/SibaniKrishnaChoudhury-255/SignInSignUpPage_Library.svg)](https://jitpack.io/#SibaniKrishnaChoudhury-255/SignInSignUpPage_Library)


## Screenshots

**Please click the image below to enlarge.**


<a href="https://user-images.githubusercontent.com/66129155/83489123-9696c100-a4cb-11ea-8600-760b0e31071c.jpg"><img src="https://user-images.githubusercontent.com/66129155/83489123-9696c100-a4cb-11ea-8600-760b0e31071c.jpg" title="SignInSignUpPage" height=400/></a>



## Prerequisites

```
allProjects{
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	... 
  implementation 'com.github.SibaniKrishnaChoudhury-255:SignInSignUpPage_Library:1.0.1'
}
```

## How to use?

- #### Add in XML layout file

- ###### For SignUpPage

      <com.example.signin_and_signuppage.signUp
        android:id="@+id/signup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

- ###### For SignInPage

       <com.example.signin_and_signuppage.signIn
        android:id="@+id/signin"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

		
- #### Add in Java file

- ###### For SignUpPage

      signUp signUpPage=findViewById(R.id.signup);
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

 - ###### For SignInPage   
 
        signIn signInPage = findViewById(R.id.signin);
        signInPage.setButtonText("Login")
                .setEditTextOnehint("phone Number")
                .setEditTextTwohint("Password");

        signInPage.setSignInClickListener(new ClickedListner() {
            @Override
            public void onClick() {
                final String name = signInPage.getfromEditTextOne();
                final String password = signInPage.getfromEditTextTwo();
                Toast.makeText(signInActivity.this, "" + name + " " + password, Toast.LENGTH_SHORT).show();
            }
        }).moveToSignUpScreen(new ClickedListner() {
            @Override
            public void onClick() {
                Toast.makeText(signInActivity.this, "moveToSignUpScreen", Toast.LENGTH_SHORT).show();
            }
        });
        
## Props

#### Page props

  ###### SignIn Page

    - getfromEditTextOne() : Get first EditText Value
    - getfromEditTextTwo() : Get second EditText Value
    - moveToSignUpScreen(ClickedListner) : FooterText clickListner
    - setEditTextOnehint(String) : first EditText hint
    - setEditTextTwohint(String) : second EditText hint
    - setButtonBackgroundColor(String) : SignInButton BackgroundColor
    - setButtonText(String) : SignInButton Text
    - setButtonTextColor(String) : SignInButton TextColor
    - setheaderTitle(String) : Header Text
    - setheaderColor(String) : Header TextColor
    - setFootertextColor(String) : FooterText Color
    - setFootertext(String) : Footer Text
    - setSignInClickListener(ClickedListner) : SignInButton clickListner
    
  ###### SignUp Page

    - getfromEditTextOne() : Get first EditText Value
    - getfromEditTextTwo() : Get second EditText Value
    - getfromEditTextThree() : Get third EditText Value
    - moveToSignInScreen(ClickedListner) : FooterText clickListner
    - setEditTextOnehint(String) : first EditText hint
    - setEditTextTwohint(String) : second EditText hint
    - setEditTextThreehint(String) : third EditText hint
    - setButtonBackgroundColor(String) : SignUpButton BackgroundColor
    - setButtonText(String) : SignUpButton Text
    - setButtonTextColor(String) : SignUpButton TextColor
    - setheaderTitle(String) : Header Text
    - setheaderColor(String) : Header TextColor
    - setFootertextColor(String) : FooterText Color
    - setFootertext(String) : Footer Text
    - setSignUpClickListener(ClickedListner) : SignUpButton clickListner

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/SibaniKrishnaChoudhury-255/SignInSignUpPage_Library/pulls).

Any contributions (large or small/ major or minor/ new features/ bug fixes) are welcomed and appreciated
but will be thoroughly reviewed.

### Contact - Let's become friend

- [Github](https://github.com/SibaniKrishnaChoudhury-255/)
- [Linkedin](https://www.linkedin.com/in/sibani-krishna-choudhury/)


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


      Copyright 2020 Sibanikrishna Choudhury

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
