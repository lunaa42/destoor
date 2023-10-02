package com.example.constitution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText entera;
    EditText enterb;
    EditText enterc;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponent();
    }

    private void connectComponent() {
        entera = findViewById(R.id.txEntera);
        enterb = findViewById(R.id.txEnterb);
        enterc = findViewById(R.id.txEnterc);
        cal = findViewById(R.id.btnCal);
    }

    public void calcuate(View view) {
        String entA = entera.getText().toString();
        String entB = enterb.getText().toString();
        String entC = enterc.getText().toString();
        double a,b,c,delta,root1,root2,root;
        a = Double.parseDouble(entA);
        b = Double.parseDouble(entB);
        c = Double.parseDouble(entC);
        delta = Math.pow(b,2) - 4 * a * c;
         if(delta>0){
             root1 = (-b + Math.sqrt(delta)) / (2 * a);
             root2 = (-b - Math.sqrt(delta)) / (2 * a);
             Toast.makeText(this,"root1 :" + root1,Toast.LENGTH_SHORT).show();
             Toast.makeText(this,"root2:" + root2,Toast.LENGTH_SHORT).show();
         }
         if(delta==0)
             root = -b / (2 * a);
         else
             Toast.makeText(this,"no roots!",Toast.LENGTH_SHORT).show();
    }
}