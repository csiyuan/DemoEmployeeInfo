package sg.edu.rpc346.id19016011.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> alEmployeeList;
    //ArrayAdapter<AndroidVersion> alAndroidVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);
        alEmployeeList = new ArrayList<Employee>();

        alEmployeeList.add(new Employee("John", "Software Technical Leader", 3400));
        alEmployeeList.add(new Employee("May", "Programmer", 2200));


        //aaAndroidVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, alEmployeeList);

        lvEmployee.setAdapter(adapter);
    }
}
