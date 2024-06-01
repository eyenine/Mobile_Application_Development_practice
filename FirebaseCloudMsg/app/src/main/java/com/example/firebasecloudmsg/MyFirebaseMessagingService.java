package com.example.firebasecloudmsg;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

        getFirebaseMessage(message.getNotification().getTitle(),message.getNotification().getBody());
    }

    private void getFirebaseMessage(String title, String body) {

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"notify");
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setContentTitle("Hii Eyenine");
        builder.setContentText("Ok you neeed to stop now");
        builder.setAutoCancel(true);



        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(this);
        managerCompat.notify(102,builder.build());
    }
}
