package com.e.learningenglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OpeningActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView hello;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return  true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        hello=findViewById(R.id.hello);
        Intent intent=getIntent();
        String hello2 = intent.getExtras().getString("hello2");
        hello.setText("Hello "+hello2+"!");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();

        return true;
    }

    @Override
    public void onClick(View v)
    {

    }
}
