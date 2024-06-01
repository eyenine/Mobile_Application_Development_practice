package com.example.notificationprogressbar;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {
    private NotificationManager mNotifyManager;
    private NotificationCompat.Builder mBuilder;
    int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btnShow);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNotifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mBuilder = new NotificationCompat.Builder(MainActivity.this);
                mBuilder.setContentTitle("File Download")
                        .setContentText("Download in progress")
                        .setSmallIcon(R.drawable.download);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int incr;
                        for (incr = 0; incr <= 100; incr += 5) {
                            mBuilder.setProgress(100, incr, false);
                            mNotifyManager.notify(id, mBuilder.build());
                            try {
                                Thread.sleep(1 * 1000);
                            } catch (InterruptedException e) {
                                Log.d("TAG", "sleep failure");
                            }
                        }

                        mBuilder.setContentText("Download completed")
                                .setProgress(0, 0, false);
                        mNotifyManager.notify(id, mBuilder.build());
                    }
                }).start();
            }
        });
    }
}
