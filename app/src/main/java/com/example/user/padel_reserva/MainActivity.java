package com.example.user.padel_reserva;

        import android.app.DatePickerDialog;
        import android.app.TimePickerDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.DatePicker;
        import android.widget.TextView;
        import android.widget.TimePicker;
        import android.widget.Toast;

        import java.text.DateFormat;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv1,et1,et2, et3;
    private Button btn1, btn3, btn2, btn4;
    private int dia, mes, anno, hora, minuto, hora1, minuto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (TextView) findViewById(R.id.et1);
        et2 = (TextView) findViewById(R.id.et2);
        et3 = (TextView) findViewById(R.id.et3);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");


        if (v == btn1) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            anno = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                    et1.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }, dia, mes, anno);
            datePickerDialog.show();
            datePickerDialog.updateDate(anno, mes, dia);

        }
        if (v == btn2 ){
            final Calendar c = Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            minuto = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog =  new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hora, int minuto) {
                    et2.setText(hora + ":" + minuto);
                }
            }, hora, minuto, true);
            timePickerDialog.show();
            timePickerDialog.updateTime(hora, minuto);

        }
        if (v == btn4 ){
            final Calendar c = Calendar.getInstance();
            hora1 = c.get(Calendar.HOUR_OF_DAY);
            minuto1 = c.get(Calendar.MINUTE);

           TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
               @Override
               public void onTimeSet(TimePicker timePicker, int hora1, int minuto1) {
                   et3.setText(hora1 + ":" + minuto1);
               }
           }, hora, minuto, true);
            timePickerDialog.show();
            timePickerDialog.updateTime(hora1, minuto1);
        }
        else if (v == btn3){

            

        }
    }
}
