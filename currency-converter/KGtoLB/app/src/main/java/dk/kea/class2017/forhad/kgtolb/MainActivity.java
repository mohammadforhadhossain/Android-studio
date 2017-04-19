package dk.kea.class2017.forhad.kgtolb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lbConvert (View v)
    {
        String s1 =((EditText) findViewById(R.id.editText2)).getText().toString();

        TextView t1 = (TextView) findViewById(R.id.textView);

        double kgVal = Double.parseDouble(s1);
        double lbVal = kgVal * 2.20462;

        String Res = String.valueOf(lbVal);

        t1.setText(Res);

    }
    public void kgConvert (View v)
    {
        String s1 =((EditText) findViewById(R.id.editText2)).getText().toString();

        TextView t1 = (TextView) findViewById(R.id.textView);

        double lbVal = Double.parseDouble(s1);
        double kgVal = lbVal / 2.20462;

        String Res = String.valueOf(kgVal);

        t1.setText(Res);

    }
}
