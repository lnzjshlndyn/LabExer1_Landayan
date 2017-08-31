package com.example.josh.labexer1_landayan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstAcitivity extends AppCompatActivity {

    EditText q1;
    EditText q2;
    EditText sw;
    EditText le;
    EditText me;
    Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_acitivity);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        sw = (EditText) findViewById(R.id.sw);
        le = (EditText) findViewById(R.id.le);
        me = (EditText) findViewById(R.id.me);

        compute = (Button) findViewById(R.id.compute);
    }

    public void computegrade(View view){

        Intent intent = new Intent(this, SecondActivity.class);

        int quiz1 = Integer.parseInt(q1.getText().toString());
        int quiz2 = Integer.parseInt(q2.getText().toString());
        int swork = Integer.parseInt(sw.getText().toString());
        int lab = Integer.parseInt(le.getText().toString());
        int exam = Integer.parseInt(me.getText().toString());

        double result = ((quiz1 * .1) + (quiz2 * .1) + (swork * .1) + (lab * .4) + (exam * .3));

        String fg = "";

        if(result < 60){
            fg = "Failed";
        } else if(result >= 60 && result <= 65){
            fg = "3.0";
        } else if(result >= 66 && result <= 70){
            fg = "2.75";
        } else if(result >= 71 && result <= 75){
            fg = "2.5";
        } else if(result >= 76 && result <= 80){
            fg = "2.25";
        } else if(result >= 81 && result <= 85){
            fg = "2.0";
        } else if(result >= 86 && result <= 90){
            fg = "1.75";
        } else if(result >= 90 && result <= 92){
            fg = "1.5";
        } else if(result >= 93 && result <= 94){
            fg = "1.25";
        } else if(result >= 95 && result <= 100){
            fg = "1.0";
        } else if(result > 100){
            fg = "GOD";
        }

        intent.putExtra("result", Double.toString(result));
        intent.putExtra("fg", fg);
        startActivity(intent);
        finish();
    }
}
