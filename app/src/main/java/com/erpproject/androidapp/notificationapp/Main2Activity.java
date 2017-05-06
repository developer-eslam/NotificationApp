package com.erpproject.androidapp.notificationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtresult;
    String getdatanotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtresult=(TextView)findViewById(R.id.txtdisplayresult);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            getdatanotification  = bundle.getString("messgagenotify");
            txtresult.setText(getdatanotification);
        }
    }
}
