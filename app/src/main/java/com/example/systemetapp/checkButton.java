package com.example.systemetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.systemetapp.MainActivity;
import com.example.systemetapp.R;

import static com.example.systemetapp.R.id.end;
import static com.example.systemetapp.R.id.nextButton;

public class checkButton extends AppCompatActivity {

    private Button B ;
    private CheckBox checkBox;
    private TextView msg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button);
        checkBox = findViewById(R.id.checkBox);
        B = (Button) findViewById(nextButton);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBox.isChecked()) {
                    msg = findViewById(R.id.message);
                    msg.setText("validate your age is over 20!");
                    B.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(checkButton.this, MainActivity.class);
                        }});

                }
                if (checkBox.isChecked()){
                    B.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view){
                            Intent i = new Intent(checkButton.this, MainActivity.class);
                            startActivity(i);

                        }
                    });

                }

            }
        });


    }

   
}
