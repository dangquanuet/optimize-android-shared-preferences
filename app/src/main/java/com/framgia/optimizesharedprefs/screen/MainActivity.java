package com.framgia.optimizesharedprefs.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.framgia.optimizesharedprefs.R;
import com.framgia.optimizesharedprefs.model.Employee;
import com.framgia.optimizesharedprefs.utils.SharedPrefs;

public class MainActivity extends AppCompatActivity {

    public final String TAG = MainActivity.this.getClass().getName();
    public static final String FIRST_STAFF = "first_staff";
    public static final String SECOND_STAFF = "second_staff";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee employee = new Employee(1, "Nguyen Viet Manh");
        Employee employee2 = new Employee(2, "Do Xuan Duc");

        SharedPrefs.getInstance().put(FIRST_STAFF, employee);
        SharedPrefs.getInstance().put(SECOND_STAFF, employee2);

        Log.e(TAG, SharedPrefs.getInstance().get(FIRST_STAFF, Employee.class).toString());
        Log.e(TAG, SharedPrefs.getInstance().get(SECOND_STAFF, Employee.class).toString());

        Log.e(TAG, String.valueOf(SharedPrefs.getInstance().get("hello", Integer.class, 2)));
    }
}
