package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;




public class MainActivity extends AppCompatActivity
{
        public void displayMsg(String str) {
            Toast.makeText(this, "Bouton cliqué : " + str,
                    Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Toast.makeText(getApplicationContext(), "Activité 1", Toast.LENGTH_SHORT).show();
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button bt1 = findViewById(R.id.bt1);
            bt1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    displayMsg("bt1");
                }
            });


            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }









/*
        int tva = 20;
        double tvaReduit = 5.5;
        boolean boursier = true;
        char initiale = 'T';

        String prenom = "Tom";
        String nom = "CHAUVIN";

        int noteCGE = 2*10;
        int noteAng = 2*14;
        int noteMath = 2*9;
        int noteAlgo = 1*16;
        int noteEDM = 4*8;
        int noteE4 = 4*14;
        int noteE5 = 5*12;
        int noteE6 = 3*16;

        int moyenne = noteCGE + noteAng + noteMath + noteAlgo + noteEDM + noteE4 + noteE5 + noteE6;
        moyenne = moyenne / 23;

        int i = 0;

        while (i<10){
            Toast.makeText(getApplicationContext(), ""+i,
                    Toast.LENGTH_LONG).show();
                        i++;
        }

        int f = 1;
        for (int i=1; i <= 10; i++) {
            f = f * i;
        }
        Toast.makeText(getApplicationContext(), "La factorielle est de "+f,
                Toast.LENGTH_LONG).show();


        if (moyenne < 10){
            Toast.makeText(getApplicationContext(), "Vous n'avez pas votre BTS.",
                    Toast.LENGTH_LONG).show();
        }

        else if (moyenne >= 10 && moyenne < 12){
            Toast.makeText(getApplicationContext(), "Vous avez votre BTS mais sans mention.",
                    Toast.LENGTH_LONG).show();
        }

        else if (moyenne >= 12 && moyenne < 14){
            Toast.makeText(getApplicationContext(), "BTS mention assez bien.",
                    Toast.LENGTH_LONG).show();
        }

        else if (moyenne >= 14 && moyenne < 16){
            Toast.makeText(getApplicationContext(), "BTS mention bien.",
                    Toast.LENGTH_LONG).show();
        }

        else if (moyenne >= 16){
            Toast.makeText(getApplicationContext(), "BTS mention très bien.",
                    Toast.LENGTH_LONG).show();
        }



        Toast.makeText(getApplicationContext(), "La moyenne est de " + moyenne + "/20",
            Toast.LENGTH_LONG).show();



        TextView view = new TextView(this);
        view.setText("Identité : " + nom + " " + prenom);
        setContentView(view);

        Toast.makeText(getApplicationContext(), "La TVA est de " + tvaReduit + "%",
                Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "Élève boursier : " + boursier,
                Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "L'initiale de votre prénom est : " + initiale,
            Toast.LENGTH_LONG).show();
*/


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            //getMenuInflater().inflate(R.menu.menu_main, menu);
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
}

