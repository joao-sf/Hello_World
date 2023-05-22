package com.example.hello_world;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = null;
        switch (item.getItemId()) {
            case R.id.acao1:
                toast = Toast.makeText(context, getString(R.string.opc1), duration);
                toast.show();
                return true;
            case R.id.acao2:
                toast = Toast.makeText(context, getString(R.string.opc2), duration);
                toast.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}