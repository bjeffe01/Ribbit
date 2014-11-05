package com.MochaMan.ribbit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    protected TextView mSignUpTextView;
    protected EditText mUserName;
    protected EditText mPassword;
    protected Button mLoginButton;
//    protected TextView mPasswordReset;
//    protected EditText mPasswordResetEmail;
//    protected Button mPasswordResetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSignUpTextView = (TextView)findViewById(R.id.signupText);
        mUserName = (EditText)findViewById(R.id.usernameField);
        mPassword = (EditText)findViewById(R.id.passwordField);
        mLoginButton = (Button)findViewById(R.id.loginButton);
//        mPasswordReset = (TextView)findViewById(R.id.forgotPasswordText);
//        mPasswordResetEmail = (EditText)findViewById(R.id.resetemailField);
//        mPasswordResetButton = (Button)findViewById(R.id.passwordresetButton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
//                startActivity(intent);
//            }
//        });


//        mPasswordReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPasswordResetEmail.setVisibility(View.VISIBLE);
//                mPasswordResetButton.setVisibility(View.VISIBLE);
//            }
//        });
//
//        mPasswordResetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String email = mPasswordResetEmail.getText().toString();
//                email = email.trim();
//
//                if (email.isEmpty()) {
//
//                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                    builder.setMessage("Invalid email address.")
//                            .setTitle("Oops!")
//                            .setPositiveButton(android.R.string.ok, null);
//                    AlertDialog dialog = builder.create();
//                    dialog.show();
//
//                } else {
//
//                    ParseUser.requestPasswordResetInBackground(email,
//                            new RequestPasswordResetCallback() {
//                                public void done(ParseException e) {
//                                    if (e == null) {
//                                        // An email was successfully sent with reset instructions.
//                                        mPasswordResetEmail.setVisibility(View.INVISIBLE);
//                                        mPasswordResetButton.setVisibility(View.INVISIBLE);
//                                    } else {
//                                        // Something went wrong. Look at the ParseException to see what's up.
//                                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                                        builder.setMessage(e.getMessage())
//                                                .setTitle("Trouble with Reset")
//                                                .setPositiveButton(android.R.string.ok, null);
//                                        AlertDialog dialog = builder.create();
//                                        dialog.show();
//                                    }
//                                }
//                            }
//                    );
//                }
//            }
//        });


//        mLoginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String username = mUserName.getText().toString();
//                String password = mPassword.getText().toString();
//
//                username = username.trim();
//                password = password.trim();
//
//                if (username.isEmpty() || password.isEmpty()) {
//
//                    // EXAMPLE ALERT DIALOG
//
//                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                    builder.setMessage(R.string.login_error_message)
//                            .setTitle(R.string.login_error_title)
//                            .setPositiveButton(android.R.string.ok, null);
//                    AlertDialog dialog = builder.create();
//                    dialog.show();
//
//                } else {
//                    // Login
//                    //                   setProgressBarIndeterminateVisibility(true);
//                    ParseUser.logInInBackground(username, password, new LogInCallback() {
//                        @Override
//                        public void done(ParseUser user, ParseException e) {
////                            setProgressBarIndeterminateVisibility(false);
//                            if (e == null) {
//                                // Hooray! The user is logged in.
//                                Intent intent = new Intent(LoginActivity.this, MyActivity.class);
//                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                startActivity(intent);
//                            } else {
//                                //Login-up failure - popup alert
//                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                                builder.setMessage(e.getMessage())
//                                        .setTitle(R.string.login_error_title)
//                                        .setPositiveButton(android.R.string.ok, null);
//                                AlertDialog dialog = builder.create();
//                                dialog.show();
//                            }
//                        }
//                    });
//                }
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
    }
}
