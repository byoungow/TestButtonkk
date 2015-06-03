package bulbadapaul.tistory.com.intentused;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class IntentUsed extends ActionBarActivity{

    Button btnIntent0;
    Button btnIntent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_used);

        btnIntent0 =  (Button)findViewById(R.id.btnIntent0);
        btnIntent0.setOnClickListener(new ClickEventHandler());
        btnIntent1 =  (Button)findViewById(R.id.btnIntent1);
        btnIntent1.setOnClickListener(new ClickEventHandler());
    }

    private class ClickEventHandler implements View.OnClickListener {
        @Override
        public void onClick (View v) {
            Log.v("Log", "명시적 인텐트 처리");
            switch (v.getId()) {
                case R.id.btnIntent1:
                    Intent intent =new Intent(v.getContext(), Intent1.class);
                    v.getContext().startActivity(intent);

                case R.id.btnIntent0:
                    Intent intent1 = new Intent(v.getContext(), IntentSucees.class);
                    v.getContext().startActivity(intent1);
                    break;
            }
        }
    }

}


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intent_used, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/
