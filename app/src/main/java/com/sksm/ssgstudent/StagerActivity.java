package com.sksm.ssgstudent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StagerActivity extends AppCompatActivity {

    private Button btn;

    DatabaseReference mDatabaseReference;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stager);

        textView1 = findViewById(R.id.testName);
        textView2 = findViewById(R.id.testNOQ);
        textView3 = findViewById(R.id.testDate);

        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        mDatabaseReference.child("examdetails").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snap : snapshot.getChildren()){

                    textView1.setText(snapshot.child("name").getValue().toString());
                    textView2.setText(snapshot.child("noofquestions").getValue().toString());
                    textView3.setText(snapshot.child("date").getValue().toString());
//                    Toast.makeText(RankList.this, actual_answer, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        btn = findViewById(R.id.ss);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference("examdetails").child("timer").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String examkey=snapshot.getValue().toString();
                        if(examkey.equalsIgnoreCase("on")) {
//                            Toast.makeText(StagerActivity.this, examkey, Toast.LENGTH_SHORT).show();
                            Intent intent5 = new Intent(StagerActivity.this, MainActivity.class);
                            startActivity(intent5);
                        }
                        else{
                            Toast.makeText(StagerActivity.this, "As soon as the Exam starts you can Begin the Test Automatically.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {
            Toast.makeText(StagerActivity.this, "User logged in ", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(StagerActivity.this, "Login to continue", Toast.LENGTH_SHORT).show();
            Intent I = new Intent(StagerActivity.this, Login.class);
            startActivity(I);
        }
    }
}