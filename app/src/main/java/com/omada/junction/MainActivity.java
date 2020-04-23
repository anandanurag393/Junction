package com.omada.junction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.omada.junction.data.clouddb.Club;
import com.omada.junction.data.clouddb.Event;
import com.omada.junction.data.clouddb.User;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView eventDetails = findViewById(R.id.text_event_details);


        FirebaseFirestore db = FirebaseFirestore.getInstance();
        final String events = "event 1";
        final String user_id = "GncnboLIcIilmDhqe6ZN";
        // replace this by userId to get the user details;
        final String event_id = "3gwB15LsqJbif2K0nJqv";
        //replace this by event_id to get the event details
        final String club_id = "lkgFmVzzJHi8o5hHRLIo";
        //you now know the drill go ahead



        final DocumentReference event_1 = db.document("events/"+event_id);
        event_1.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        //Toast.makeText(MainActivity.this, events + " fetched", Toast.LENGTH_SHORT).show(); Event event = documentSnapshot.toObject(Event.class);
                        Event event = documentSnapshot.toObject(Event.class);
                        eventDetails.setText("title "+ event.getEvent_name());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                       // Toast.makeText(MainActivity.this, "could not fetch details of " + events , Toast.LENGTH_SHORT).show();
                    }
                });
        final DocumentReference user_1 = db.document("users/" + user_id);
        user_1.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        User user = documentSnapshot.toObject(User.class);
                        String user_name = user.getUser_name();
                        Toast.makeText(MainActivity.this, user_name, Toast.LENGTH_SHORT).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "could not fetch user documents", Toast.LENGTH_SHORT).show();
                    }
                });
        final DocumentReference club_1 = db.document("organizations/"+ club_id);
        club_1.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        Club club = documentSnapshot.toObject(Club.class);
                        String club_name = club.getOrganization_name();
                        Toast.makeText(MainActivity.this, club_name, Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "could not get club details", Toast.LENGTH_SHORT).show();
                    }
                });



    }
}
