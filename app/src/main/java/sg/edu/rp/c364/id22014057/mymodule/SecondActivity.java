package sg.edu.rp.c364.id22014057.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.textView);
        btnReturn=findViewById(R.id.btnReturn);

        Intent intentReceived =getIntent();
        String ModuleCode = intentReceived.getStringExtra("module");
        String ModuleName =intentReceived.getStringExtra("ModuleName");
        String AcademicYear =intentReceived.getStringExtra("AcademicYear");
        int Semester =intentReceived.getIntExtra("Semester",0);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit",0);
        String venue =intentReceived.getStringExtra("venue");

        String output="Module Code: "+ModuleCode
                +"\nModule Name: "+ModuleName
                +"\nAcademic Year: "+AcademicYear
                +"\nSemester: "+Semester
                +"\nModule Credit: "+ModuleCredit
                +"\nVenue: "+venue;

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}