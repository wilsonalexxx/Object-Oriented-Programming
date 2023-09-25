package com.example.ajaibmusicstudio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ajaibmusicstudio.Database.DatabaseHelper;
import com.example.ajaibmusicstudio.Object.Customer;
import com.example.ajaibmusicstudio.R;

public class CustomerLoginPage extends AppCompatActivity {
    private Button LoginCustomer;
    private EditText Email,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_page);
        Initviews();

        LoginCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper db = new DatabaseHelper(getApplicationContext());
                String email = Email.getText().toString();
                String password = Password.getText().toString();
                if (email.equals("") || password.equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter all field",Toast.LENGTH_SHORT).show();
                }else {
                    boolean check = db.CheckEmailAndPasswordCustomer(email,password);
                    if (check){
                        Toast.makeText(getApplicationContext(),"Login Succesfull",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivityCustomer.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(),"Invalid Credential",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void Initviews(){
        LoginCustomer = (Button) findViewById(R.id.BtnCostumerLogin);
        Email = (EditText) findViewById(R.id.CustEmail);
        Password = (EditText) findViewById(R.id.CustPassword);
    }

}