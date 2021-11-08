package com.e.learningenglish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
Dialog loginDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (btn==v)
        {
            loginDialog=new Dialog(this);
            loginDialog.setContentView(R.layout.dialog_register);
            loginDialog.show();
        }
    }
}

