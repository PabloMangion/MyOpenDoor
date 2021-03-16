package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String str = "";

        if (intent.hasExtra("edittext")){
            Bundle bundle = getIntent().getExtras();
            str = bundle.getString("edittext");
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(str);
        Toast.makeText(getApplicationContext(), "Activité 2", Toast.LENGTH_SHORT).show();
    }
    public void ChangeActivity(View view){ //action de la vue
        EditText editText = (EditText) findViewById(R.id.editText);
        String str = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("edittext", str);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }
}