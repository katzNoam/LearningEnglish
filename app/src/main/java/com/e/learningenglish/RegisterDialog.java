package com.e.learningenglish;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterDialog extends AppCompatActivity implements View.OnClickListener
{
    EditText name;
    EditText email;
    EditText password;
    EditText confirm_password;
    Button register;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_register);
    }




    @Override
    public void onStart()
    {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = auth.getCurrentUser();
     //  updateUI(currentUser);
    }

    @Override
    public void onClick(View v)
    {
        if(v == register)
        {
            if(!password.getText().toString().equals(confirm_password.getText().toString()))
            {
                Toast.makeText(this, "problem at your password",Toast.LENGTH_LONG).show();
            }
            else
            {
                auth.createUserWithEmailAndPassword(email.getText() + "", password.getText() + "")
                        .addOnCompleteListener(RegisterDialog.this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(RegisterDialog.this, "Successfully registered", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(RegisterDialog.this, "Registration Error", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        }
    }
}
