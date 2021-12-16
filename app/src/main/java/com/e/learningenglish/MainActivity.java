package com.e.learningenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button register;
    Dialog register_dialog;
    Button log_in;
    EditText name;
    EditText password;

    EditText register_name;
    EditText register_email;
    EditText register_password;
    EditText register_confirm_password;
    Button register_action;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        register.setOnClickListener(this);
        log_in = findViewById(R.id.log_in);
        log_in.setOnClickListener(this);
    }


    public void createRegisterDialog() {
        register_dialog = new Dialog(this);
        register_dialog.setContentView(R.layout.dialog_register);
        register_name = register_dialog.findViewById(R.id.register_name);
        register_email = register_dialog.findViewById(R.id.register_email);
        register_password = register_dialog.findViewById(R.id.register_password1);
        register_confirm_password = register_dialog.findViewById(R.id.register_password2);
        register_action = register_dialog.findViewById(R.id.register2);
        register_action.setOnClickListener(this);
        auth = FirebaseAuth.getInstance();
        register_dialog.show();
    }

    @Override
    public void onClick(View v) {
        if (register == v) {
            createRegisterDialog();
        } else if (log_in == v) {
            Intent intent = new Intent(this, OpeningActivity.class);
            intent.putExtra("hello2", name.getText().toString());
            startActivity(intent);
        } else if (v == register_action) {
            if(register_password.getText().toString().equals("")|| register_email.getText().toString().equals("") || register_name.getText().toString().equals("") || register_confirm_password.getText().toString().equals("") ){
                Toast.makeText(MainActivity.this, "Please fill all the form.", Toast.LENGTH_SHORT).show();
            } else if (!register_password.getText().toString().equals(register_confirm_password.getText().toString())) {
                Toast.makeText(this, "problem at your password", Toast.LENGTH_LONG).show();
            } else {

                auth.createUserWithEmailAndPassword(register_email.getText().toString(), register_password.getText().toString())
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "Successfully registered", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(MainActivity.this, "Registration Error", Toast.LENGTH_LONG).show();
                                }
                            }
                        });

            }
        }
    }
}

