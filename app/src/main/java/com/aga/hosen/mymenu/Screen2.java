package com.aga.hosen.mymenu;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Screen2 extends AppCompatActivity implements DialogInterface.OnClickListener,View.OnClickListener{
    private Button btndate;
    private TextView tvshowdate;
    private Button btnTime;
    private TextView tvshowtime;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndate= (Button) findViewById(R.id.btndate);
        tvshowdate= (TextView) findViewById(R.id.tvshowdate);
        btnTime= (Button)findViewById(R.id.btnTime);
        tvshowtime= (TextView) findViewById(R.id.btnTime);
    }
    public void onBackPressed(){
        //
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        //
        builder.setMessage("Are you sure?");
        //
        builder.setCancelable(false);
        //
        builder.setPositiveButton("YES", (DialogInterface.OnClickListener) this);
        //
        builder.setNegativeButton("NO", (DialogInterface.OnClickListener) this);
        //
        AlertDialog dialog=builder.create();
        //
        dialog.show();;


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hosenmenu, menu);
        return true;
    }
    public void onClick(DialogInterface dialog,int wich) {
        int which = 0;
        if (which == dialog.BUTTON_POSITIVE) {
            super.onBackPressed();
            dialog.cancel();
        }
        if (which == dialog.BUTTON_NEGATIVE) {
            dialog.cancel();
        }

    }



    @Override
    public void onClick(View view) {
        if (view == btndate) {
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog.OnDateSetListener datelistener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                    tvshowdate.setText(d + "/" + m + "/" + y);

                }

            };

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, datelistener, year, month, day);
            datePickerDialog.show();

        {
            if (view == btndate) {
                Calendar c1 = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        tvshowtime.setText(i+":"+i1);

                    }


                };

                TimePickerDialog onTimePickerDialog = new TimePickerDialog(this, timeListener,hour,minute,true);
            }

}



}

        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Itmscreen1:
                Toast.makeText(getBaseContext(), "Hi Screen1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            case R.id.Itmscreen2:
                Toast.makeText(getBaseContext(), "Hi Screen2", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            case R.id.Itmscreen3:
                Toast.makeText(getBaseContext(), "Hi Screen3", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent);
            case R.id.Itmscreen4:

                Toast.makeText(getBaseContext(), "Hi Screen4", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent); break;

        }

        return  true;
    }
}







