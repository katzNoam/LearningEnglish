package com.e.learningenglish;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterDialog extends AppCompatActivity implements View.OnClickListener
{
    EditText name;
    EditText email;
    EditText password;
    EditText confirm_password;
    Button register;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_register);
        name=findViewById(R.id.register_name);
        email=findViewById(R.id.register_email);
        password=findViewById(R.id.register_password1);
        confirm_password=findViewById(R.id.register_password2);
        register=findViewById(R.id.register2);
        register.setOnClickListener(this);
        auth=FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View v)
    {
        if(register==v)
        {
            if(!password.equals(confirm_password))
            {
                Toast.makeText(this,"problem at your password",Toast.LENGTH_LONG).show();
            }
        }
    }
}
