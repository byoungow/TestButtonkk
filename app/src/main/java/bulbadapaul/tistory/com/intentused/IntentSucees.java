package bulbadapaul.tistory.com.intentused;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class IntentSucees extends ActionBarActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_success);

        Log.v("Log", "화면 정상 출력");


        //btnBack.setOnClickListener(new ClickEventHandler());

    }

    /*private class ClickEventHandler implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Log.v("Log", "이전 화면으로 복귀");
            switch (v.getId()) {
                case R.id.btnBack:
                    Intent intent = new Intent(v.getContext(), IntentUsed.class);
                    v.getContext().startActivity(intent);
                    break;
            }
        }
    }*/
}
