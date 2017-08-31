package com.example.josh.labexer1_landayan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView outputRA;
    TextView outputFG;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        outputRA = (TextView) findViewById(R.id.outputRA);
        outputFG = (TextView) findViewById(R.id.outputFG);

        String ra = getIntent().getStringExtra("result");
        String fg = getIntent().getStringExtra("fg");;

        outputRA.setText(ra);
        outputFG.setText(fg);

    }

    public void goback(View view){
        Intent intent = new Intent(this, FirstAcitivity.class);
        startActivity(intent);
        finish();
    }
}
