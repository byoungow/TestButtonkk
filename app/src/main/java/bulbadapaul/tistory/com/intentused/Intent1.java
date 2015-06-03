package bulbadapaul.tistory.com.intentused;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

// private static final String TAG = "Activity"

public class Intent1 extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("Paul", "onCreate");

        setContentView(R.layout.intent1);

        Log.v("Paul", "ContentView_activity_operation");

        final Button tmpBtn = (Button) findViewById(R.id.myButton);
        tmpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tmpBtn.setText("Test box");
                //tmpBtn.setText("Test Click");
                Log.v("Paul", "activity called");
            }
        });
    }
}



            //@Override
            //public void onView(){
            //    Espresso.onView(findViewById (R.id.myButton));