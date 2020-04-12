package tw.org.iii.brad.brad28;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birthday = findViewById(R.id.birthday);
    }

    public void test1(View view) {
        newDate();
    }

    private void newDate(){
        DatePickerDialog dialog = new DatePickerDialog(this,
                DatePickerDialog.THEME_DEVICE_DEFAULT_DARK, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                birthday.setText(year + "/" + (month+1) + "/" + dayOfMonth);
            }
        },
                2020, 4 - 1, 12);

        DatePicker picker = dialog.getDatePicker();
        Calendar limit = Calendar.getInstance();
        limit.set(2020,3, 12);

        picker.setMaxDate(limit.getTimeInMillis());

        dialog.show();
    }

    public void test2(View view){
        TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            }
        }, 12, 30, true);

        dialog.show();


    }

}
