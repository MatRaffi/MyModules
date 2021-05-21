package sg.edu.rp.c346.s19024292.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer=findViewById(R.id.textView);
        btnBack=findViewById(R.id.buttonBack);

        Intent intent=getIntent();
        String Message="";
        Message+="Module Code: " + intent.getStringExtra("code") + "\n";
        Message+="Module Name: " + intent.getStringExtra("name") + "\n";
        Message+="Academic Year: " + intent.getStringExtra("year") + "\n";
        Message+="Semester: " + intent.getStringExtra("sem") + "\n";
        Message+="Module Credit: " + intent.getStringExtra("credit") + "\n";
        Message+="Venue: " + intent.getStringExtra("venue") + "\n";

        tvAnswer.setText(Message);

        Intent intent1=getIntent();
        String Message1="";
        Message1+="Module Code: " + intent.getStringExtra("code") + "\n";
        Message1+="Module Name: " + intent.getStringExtra("name") + "\n";
        Message1+="Academic Year: " + intent.getStringExtra("year") + "\n";
        Message1+="Semester: " + intent.getStringExtra("sem") + "\n";
        Message1+="Module Credit: " + intent.getStringExtra("credit") + "\n";
        Message1+="Venue: " + intent.getStringExtra("venue") + "\n";

        tvAnswer.setText(Message1);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
