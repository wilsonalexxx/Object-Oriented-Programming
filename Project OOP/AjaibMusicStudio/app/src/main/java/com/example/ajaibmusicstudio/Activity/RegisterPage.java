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

public class RegisterPage extends AppCompatActivity {
    private EditText firstnameC,lastnameC,emailC,usernameC,passwordC;
    private Button registerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        Initviews();

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer customer;
                try {
                    customer = new Customer(-1,firstnameC.getText().toString(),lastnameC.getText().toString(),emailC.getText().toString(),usernameC.getText().toString(),passwordC.getText().toString());
                    if (customer.getFirstName().equals("") || customer.getLastName().equals("") || customer.getEmail().equals("") || customer.getUsername().equals("") || customer.getPassword().equals("")){
                        Toast.makeText(getApplicationContext(),"Please enter all the fields",Toast.LENGTH_SHORT).show();
                    }else {
                        DatabaseHelper db = new DatabaseHelper(getApplicationContext());
                        boolean Success = db.AddOneCustomer(customer);
                        Intent intent = new Intent(getApplicationContext(),RegisterSuccesPage.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Account has been Created", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error Register Custumer",Toast.LENGTH_SHORT).show();
                    customer = new Customer(-1,"error","error","error","error","error");
                }
            }
        });
    }

    private void Initviews(){
        firstnameC = (EditText) findViewById(R.id.firstnameC);
        lastnameC = (EditText) findViewById(R.id.lastnameC);
        emailC = (EditText) findViewById(R.id.emailC);
        usernameC = (EditText) findViewById(R.id.usernameC);
        passwordC = (EditText) findViewById(R.id.passwordC);
        registerbutton = (Button) findViewById(R.id.registerbutton);
    }
}