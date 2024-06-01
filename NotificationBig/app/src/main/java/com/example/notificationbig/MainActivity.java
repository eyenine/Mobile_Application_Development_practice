package com.example.notificationbig;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotify = findViewById(R.id.btnShow);
        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // To set a large icon in the notification
                Bitmap licon = BitmapFactory.decodeResource(getResources(), R.drawable.notification_icon);

                // Assign BigText style notification
                NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
                bigText.bigText("Welcome to Tutlane, providing tutorials related to all technologies in the software industry. Here we cover complete tutorials from basic to advanced topics across all technologies");
                bigText.setSummaryText("By: Tutlane");

                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.drawable.ic_notification)
                        .setContentTitle("Big Text Notification Example")
                        .setLargeIcon(licon)
                        .setStyle(bigText);

                // Set the intent to fire when the user taps on the notification.
                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(
                        MainActivity.this, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                mBuilder.setContentIntent(pendingIntent);

                // Sets an ID for the notification
                int mNotificationId = 001;
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                // It will display the notification in the notification bar
                notificationManager.notify(mNotificationId, mBuilder.build());
            }
        });
    }
}
