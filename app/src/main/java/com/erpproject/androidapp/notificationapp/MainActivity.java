package com.erpproject.androidapp.notificationapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnnotify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnotify=(Button)findViewById(R.id.btnnotifcation);
        btnnotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationCompat.Builder nBuilder =
                        new NotificationCompat.Builder(getApplicationContext());
                nBuilder.setContentTitle("Open Notification");
                nBuilder.setSmallIcon(R.mipmap.ic_launcher);
                nBuilder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
                nBuilder.setAutoCancel(true);
             //   Intent intent = new Intent(NOTIFICATION_SERVICE);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("messgagenotify","Open Notification");
               // startActivity(intent);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                nBuilder.setContentIntent(pendingIntent);
                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0,nBuilder.build());




            }
        });
    }
}
