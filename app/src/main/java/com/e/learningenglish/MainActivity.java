package com.e.learningenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button register;
Dialog register_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register=findViewById(R.id.button);
        register.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (register==v)
        {
            register_dialog =new Dialog(this);
            register_dialog.setContentView(R.layout.dialog_register);
            register_dialog.show();
        }
    }
}

