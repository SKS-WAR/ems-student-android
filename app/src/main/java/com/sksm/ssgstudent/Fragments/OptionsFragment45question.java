package com.sksm.ssgstudent.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sksm.ssgstudent.Login;
import com.sksm.ssgstudent.R;
import com.sksm.ssgstudent.examdetails;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class OptionsFragment45question extends Fragment {

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10,radioGroup11;
    RadioGroup radioGroup12,radioGroup13,radioGroup14,radioGroup15,radioGroup16,radioGroup17,radioGroup18,radioGroup19,radioGroup20,radioGroup21,radioGroup22,radioGroup23;
    RadioGroup radioGroup24,radioGroup25,radioGroup26,radioGroup27,radioGroup28,radioGroup29,radioGroup30,radioGroup31,radioGroup32,radioGroup33,radioGroup34,radioGroup35;
    RadioGroup radioGroup36,radioGroup37,radioGroup38,radioGroup39,radioGroup40,radioGroup41,radioGroup42,radioGroup43,radioGroup44,radioGroup45;

    RadioButton radioButton;

    String timer;String ans;

    Button bt45;

    boolean flag = true;

    private DatabaseReference mDatabase;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_options45question, container, false);

        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        radioGroup1 = v.findViewById(R.id.radioGroup1n);
        radioGroup2 = v.findViewById(R.id.radioGroup2n);
        radioGroup3 = v.findViewById(R.id.radioGroup3n);
        radioGroup4 = v.findViewById(R.id.radioGroup4n);
        radioGroup5 = v.findViewById(R.id.radioGroup5n);
        radioGroup6 = v.findViewById(R.id.radioGroup6n);
        radioGroup7 = v.findViewById(R.id.radioGroup7n);
        radioGroup8 = v.findViewById(R.id.radioGroup8n);
        radioGroup9 = v.findViewById(R.id.radioGroup9n);

        radioGroup10 = v.findViewById(R.id.radioGroup10n);
        radioGroup11 = v.findViewById(R.id.radioGroup11n);
        radioGroup12 = v.findViewById(R.id.radioGroup12n);
        radioGroup13 = v.findViewById(R.id.radioGroup13n);
        radioGroup14 = v.findViewById(R.id.radioGroup14n);
        radioGroup15 = v.findViewById(R.id.radioGroup15n);
        radioGroup16 = v.findViewById(R.id.radioGroup16n);
        radioGroup17 = v.findViewById(R.id.radioGroup17n);
        radioGroup18= v.findViewById(R.id.radioGroup18n);
        radioGroup19= v.findViewById(R.id.radioGroup19n);

        radioGroup20= v.findViewById(R.id.radioGroup20n);
        radioGroup21 = v.findViewById(R.id.radioGroup21n);
        radioGroup22 = v.findViewById(R.id.radioGroup22n);
        radioGroup23 = v.findViewById(R.id.radioGroup23n);
        radioGroup24 = v.findViewById(R.id.radioGroup24n);
        radioGroup25 = v.findViewById(R.id.radioGroup25n);
        radioGroup26 = v.findViewById(R.id.radioGroup26n);
        radioGroup27 = v.findViewById(R.id.radioGroup27n);
        radioGroup28 = v.findViewById(R.id.radioGroup28n);
        radioGroup29 = v.findViewById(R.id.radioGroup29n);

        radioGroup30 = v.findViewById(R.id.radioGroup30n);
        radioGroup31 = v.findViewById(R.id.radioGroup31n);
        radioGroup32 = v.findViewById(R.id.radioGroup32n);
        radioGroup33 = v.findViewById(R.id.radioGroup33n);
        radioGroup34 = v.findViewById(R.id.radioGroup34n);
        radioGroup35 = v.findViewById(R.id.radioGroup35n);
        radioGroup36 = v.findViewById(R.id.radioGroup36n);
        radioGroup37 = v.findViewById(R.id.radioGroup37n);
        radioGroup38 = v.findViewById(R.id.radioGroup38n);
        radioGroup39 = v.findViewById(R.id.radioGroup39n);

        radioGroup40 = v.findViewById(R.id.radioGroup40n);
        radioGroup41 = v.findViewById(R.id.radioGroup41n);
        radioGroup42 = v.findViewById(R.id.radioGroup42n);
        radioGroup43 = v.findViewById(R.id.radioGroup43n);
        radioGroup44 = v.findViewById(R.id.radioGroup44n);
        radioGroup45 = v.findViewById(R.id.radioGroup45n);





        bt45 = v.findViewById(R.id.btn45);
        bt45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans="";
                timer="off";

                //                mDatabase.child("exam").child(user.getUid()).child("answer").child("1").setValue(radioButton.getText().toString().trim());


                int radioID = radioGroup1.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup2.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup3.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup4.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup5.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup6.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup7.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup8.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup9.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup10.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup11.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup12.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup13.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup14.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup15.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup16.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup17.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup18.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup19.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup20.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup21.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup22.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup23.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup24.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup25.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup26.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup27.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup28.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup29.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup30.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup31.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup32.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup33.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup34.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup35.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup36.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup37.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup38.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup39.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup40.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup41.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup42.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup43.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup44.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup45.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();




                //Toast.makeText(v.getContext(), FirebaseDatabase.getInstance().getReference().child("examdetails").toString(), Toast.LENGTH_SHORT).show();
                if(flag)
                FirebaseDatabase.getInstance().getReference().child("examdetails").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                                examdetails examdetail=snapshot.getValue(examdetails.class);
                                timer=examdetail.getTimer();
                                if(timer.equalsIgnoreCase("on")){

                                    Toast.makeText(v.getContext(), "Submitting answers", Toast.LENGTH_LONG).show();
                                    mDatabase.child("exam45").child(user.getUid()).child("answer").setValue(ans);
                                    Toast.makeText(v.getContext(), "Submitted", Toast.LENGTH_SHORT).show();
                                    flag=false;

                                    FirebaseAuth.getInstance().signOut();
                                    Intent intent5 = new Intent(v.getContext(), Login.class);
                                    startActivity(intent5);

                                }
                                else{
                                    Toast.makeText(v.getContext(), "Exam has Timed out", Toast.LENGTH_LONG).show();
                                }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(v.getContext(), "Sorry", Toast.LENGTH_SHORT).show();
                    }
                });

//                Toast.makeText(v.getContext(), timer, Toast.LENGTH_SHORT).show();



            }
        });

        return v;
    }

}