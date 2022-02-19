package com.example.labtask_01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etName,etEmail,etPassword;
Button btnSubmit,btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referenceing
        etName=(EditText) findViewById(R.id.etName);
        etEmail=(EditText) findViewById(R.id.etEmail);
        etPassword=(EditText) findViewById(R.id.etPassword);

        //converting String
        //String Name=etName.getText().toString();
       //String Email=etEmail.getText().toString();
      // String Password=etPassword.getText().toString();

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnReset = (Button) findViewById(R.id.btnReset);
        //Event Listener
       btnSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String Name=etName.getText().toString();
               String Email=etEmail.getText().toString();
               String Password=etPassword.getText().toString();


               if(etName.getText().toString().trim().length()==0){
                   etName.setError("Username is not entered");
                   etName.requestFocus();
               }

               if(etEmail.getText().toString().trim().length()==0){
                   etEmail.setError("Email is not entered");
                   etEmail.requestFocus();
               }
               if(etPassword.getText().toString().trim().length()==0){
                   etPassword.setError("Password is not entered");
                   etPassword.requestFocus();
               }

               if(etName.getText().toString().equals("Ariful")&& etEmail.getText().toString().equals("ariful@gmail.com")&& etPassword.getText().toString().equals("1234"))


               {
                   Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
               }

                else {
                   Toast.makeText(getApplicationContext(),"Login Fail!",Toast.LENGTH_LONG).show();
               }





           }
       });

        btnReset.setOnClickListener(new View.OnClickListener() {

            Drawable background = btnReset.getBackground();


            @Override
            public void onClick(View view) {

                if (btnReset.getText().equals("Reset"))
                {
                    btnReset.setText("Change");
                    btnReset.setBackgroundResource(R.color.newcolor);
                }

                else if (btnReset.getText().equals("Change"))
                {
                      btnReset.setText("Reset");
                      btnReset.setBackground(background);
                }

                Toast.makeText(getApplicationContext(),"Reset",Toast.LENGTH_LONG).show();


            }
        });

    }
}
