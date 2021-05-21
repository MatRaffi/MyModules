package sg.edu.rp.c346.s19024292.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textView2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ModuleDetailActivity.class);
                i.putExtra("code", "C346");
                i.putExtra("name", "Android Programming");
                i.putExtra("year", "2020");
                i.putExtra("sem", "1");
                i.putExtra("credit", "4");
                i.putExtra("venue", "W66M");
                startActivity(i);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,ModuleDetailActivity.class);
                i2.putExtra("code", "C349");
                i2.putExtra("name", "iPad Programming");
                i2.putExtra("year", "2020");
                i2.putExtra("sem", "1");
                i2.putExtra("credit", "4");
                i2.putExtra("venue", "W64M");
                startActivity(i2);
            }
        });

    }
}