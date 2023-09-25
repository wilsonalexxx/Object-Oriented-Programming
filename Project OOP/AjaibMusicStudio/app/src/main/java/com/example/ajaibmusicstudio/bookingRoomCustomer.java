package com.example.ajaibmusicstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.ajaibmusicstudio.Activity.MainActivityCustomer;
import com.example.ajaibmusicstudio.Object.DatePickerFragment;
import com.example.ajaibmusicstudio.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class bookingRoomCustomer extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    // Data
    private Button datepickerBtn;
    private Button timepickerBtn;
    private Spinner hourspickerBtn;
    private Button bookingBtn;
    public int Thours, Tminutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_room_customer);
        Initviews();

        datepickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new DatePickerFragment();
                dialogFragment.show(getSupportFragmentManager(),"Tes");
            }
        });

        bookingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Booking Success",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivityCustomer.class);
                startActivity(intent);
            }
        });
    }

    private void Initviews(){
        datepickerBtn = (Button) findViewById(R.id.datePickerBtn);
        timepickerBtn = (Button) findViewById(R.id.timePickerBtn);
        hourspickerBtn = (Spinner) findViewById(R.id.hoursPickerBtn);
        bookingBtn = (Button) findViewById(R.id.BookingBtn);
    }

    public void popTimePicker(View view){
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int SelectedhourOfDay, int Selectedminute){
                Thours = SelectedhourOfDay;
                Tminutes = Selectedminute;
                timepickerBtn.setText(String.format(Locale.getDefault(), "%02d:%02d",Thours,Tminutes));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, onTimeSetListener, Thours,Tminutes,true);

        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        String CurrentDateString = DateFormat.getDateInstance(DateFormat.MEDIUM).format(c.getTime());

        Button btn = findViewById(R.id.datePickerBtn);
        btn.setText(CurrentDateString);
    }
}