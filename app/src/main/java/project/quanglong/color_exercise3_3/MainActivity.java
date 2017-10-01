package project.quanglong.color_exercise3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        tvText = (TextView) findViewById(R.id.tvRow2);


        btn1.setBackgroundResource(R.color.red);
        btn2.setBackgroundResource(R.color.yellow);
        btn3.setBackgroundResource(R.color.blue);

        tvText.setBackgroundResource(R.color.textview);



    }
}
