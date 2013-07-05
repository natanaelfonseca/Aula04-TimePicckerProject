package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity implements TimePicker.OnTimeChangedListener {

    private TimePicker mTimePicker;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        mTimePicker = (TimePicker) findViewById( R.id.timePicker );
        mTimePicker.setIs24HourView( false );
        mTimePicker.setOnTimeChangedListener(  this );


        mTextView = (TextView) findViewById( R.id.textView2 );

    }

    public void onClick(View view){

        Toast.makeText(  getBaseContext(), "Time Selected - " + mTimePicker.getCurrentHour() +  ":" + mTimePicker.getCurrentMinute(), Toast.LENGTH_SHORT ).show();

    }


    /**
     * @param timePicker | The view associated with this listener.
     * @param hourOfDay  | The current hour.
     * @param minute     | The current minute.
     */
    @Override
    public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {

        mTextView.setText( hourOfDay +  " - "  +  minute );

    }
}
