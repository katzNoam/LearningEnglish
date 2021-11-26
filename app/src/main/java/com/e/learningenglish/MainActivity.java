package com.e.learningenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button register;
Dialog register_dialog;
Button log_in;
EditText name;
EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        register=findViewById(R.id.register);
        register.setOnClickListener(this);
        log_in=(Button)findViewById(R.id.log_in);
        log_in.setOnClickListener(this);
    }



    @Override
    public void onClick(View v)
    {
        if (register==v)
        {
            register_dialog =new Dialog(this);
            register_dialog.setContentView(R.layout.dialog_register);
            register_dialog.show();
        }
        if (log_in ==v)
        {
            Intent intent=new Intent(this,OpeningActivity.class);
            intent.putExtra("hello2",name.getText().toString());
            startActivity(intent);
        }
    }
}

