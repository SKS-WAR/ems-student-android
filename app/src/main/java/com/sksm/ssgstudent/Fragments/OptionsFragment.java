package com.sksm.ssgstudent.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

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
import com.sksm.ssgstudent.StagerActivity;
import com.sksm.ssgstudent.examdetails;

import java.util.Iterator;
import java.util.Map;


public class OptionsFragment extends Fragment {

    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10,radioGroup11;
    RadioGroup radioGroup12,radioGroup13,radioGroup14,radioGroup15,radioGroup16,radioGroup17,radioGroup18,radioGroup19,radioGroup20,radioGroup21,radioGroup22,radioGroup23;
    RadioGroup radioGroup24,radioGroup25,radioGroup26,radioGroup27,radioGroup28,radioGroup29,radioGroup30,radioGroup31,radioGroup32,radioGroup33,radioGroup34,radioGroup35;
    RadioGroup radioGroup36,radioGroup37,radioGroup38,radioGroup39,radioGroup40,radioGroup41,radioGroup42,radioGroup43,radioGroup44,radioGroup45,radioGroup46,radioGroup47,radioGroup48,radioGroup49,radioGroup50;

    RadioGroup radioGroup51,radioGroup52,radioGroup53,radioGroup54,radioGroup55,radioGroup56,radioGroup57,radioGroup58,radioGroup59,radioGroup60;
    RadioGroup radioGroup61,radioGroup62,radioGroup63,radioGroup64,radioGroup65,radioGroup66,radioGroup67,radioGroup68,radioGroup69,radioGroup70;
    RadioGroup radioGroup71,radioGroup72,radioGroup73,radioGroup74,radioGroup75,radioGroup76,radioGroup77,radioGroup78,radioGroup79,radioGroup80;
    RadioGroup radioGroup81,radioGroup82,radioGroup83,radioGroup84,radioGroup85,radioGroup86,radioGroup87,radioGroup88,radioGroup89,radioGroup90;
    RadioGroup radioGroup91,radioGroup92,radioGroup93,radioGroup94,radioGroup95,radioGroup96,radioGroup97,radioGroup98,radioGroup99,radioGroup100;

    RadioButton radioButton;

    String timer;String ans;

    Button bt;

    boolean flag = true;

    private DatabaseReference mDatabase;
// ...



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_options, container, false);

        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        radioGroup1 = v.findViewById(R.id.radioGroup1);
        radioGroup2 = v.findViewById(R.id.radioGroup2);
        radioGroup3 = v.findViewById(R.id.radioGroup3);
        radioGroup4 = v.findViewById(R.id.radioGroup4);
        radioGroup5 = v.findViewById(R.id.radioGroup5);
        radioGroup6 = v.findViewById(R.id.radioGroup6);
        radioGroup7 = v.findViewById(R.id.radioGroup7);
        radioGroup8 = v.findViewById(R.id.radioGroup8);
        radioGroup9 = v.findViewById(R.id.radioGroup9);

        radioGroup10 = v.findViewById(R.id.radioGroup10);
        radioGroup11 = v.findViewById(R.id.radioGroup11);
        radioGroup12 = v.findViewById(R.id.radioGroup12);
        radioGroup13 = v.findViewById(R.id.radioGroup13);
        radioGroup14 = v.findViewById(R.id.radioGroup14);
        radioGroup15 = v.findViewById(R.id.radioGroup15);
        radioGroup16 = v.findViewById(R.id.radioGroup16);
        radioGroup17 = v.findViewById(R.id.radioGroup17);
        radioGroup18= v.findViewById(R.id.radioGroup18);
        radioGroup19= v.findViewById(R.id.radioGroup19);

        radioGroup20= v.findViewById(R.id.radioGroup20);
        radioGroup21 = v.findViewById(R.id.radioGroup21);
        radioGroup22 = v.findViewById(R.id.radioGroup22);
        radioGroup23 = v.findViewById(R.id.radioGroup23);
        radioGroup24 = v.findViewById(R.id.radioGroup24);
        radioGroup25 = v.findViewById(R.id.radioGroup25);
        radioGroup26 = v.findViewById(R.id.radioGroup26);
        radioGroup27 = v.findViewById(R.id.radioGroup27);
        radioGroup28 = v.findViewById(R.id.radioGroup28);
        radioGroup29 = v.findViewById(R.id.radioGroup29);

        radioGroup30 = v.findViewById(R.id.radioGroup30);
        radioGroup31 = v.findViewById(R.id.radioGroup31);
        radioGroup32 = v.findViewById(R.id.radioGroup32);
        radioGroup33 = v.findViewById(R.id.radioGroup33);
        radioGroup34 = v.findViewById(R.id.radioGroup34);
        radioGroup35 = v.findViewById(R.id.radioGroup35);
        radioGroup36 = v.findViewById(R.id.radioGroup36);
        radioGroup37 = v.findViewById(R.id.radioGroup37);
        radioGroup38 = v.findViewById(R.id.radioGroup38);
        radioGroup39 = v.findViewById(R.id.radioGroup39);

        radioGroup40 = v.findViewById(R.id.radioGroup40);
        radioGroup41 = v.findViewById(R.id.radioGroup41);
        radioGroup42 = v.findViewById(R.id.radioGroup42);
        radioGroup43 = v.findViewById(R.id.radioGroup43);
        radioGroup44 = v.findViewById(R.id.radioGroup44);
        radioGroup45 = v.findViewById(R.id.radioGroup45);
        radioGroup46 = v.findViewById(R.id.radioGroup46);
        radioGroup47 = v.findViewById(R.id.radioGroup47);
        radioGroup48 = v.findViewById(R.id.radioGroup48);
        radioGroup49 = v.findViewById(R.id.radioGroup49);
        radioGroup50= v.findViewById(R.id.radioGroup50);

        radioGroup51 = v.findViewById(R.id.radioGroup51);
        radioGroup52 = v.findViewById(R.id.radioGroup52);
        radioGroup53 = v.findViewById(R.id.radioGroup53);
        radioGroup54 = v.findViewById(R.id.radioGroup54);
        radioGroup55 = v.findViewById(R.id.radioGroup55);
        radioGroup56 = v.findViewById(R.id.radioGroup56);
        radioGroup57 = v.findViewById(R.id.radioGroup57);
        radioGroup58 = v.findViewById(R.id.radioGroup58);
        radioGroup59 = v.findViewById(R.id.radioGroup59);

        radioGroup60 = v.findViewById(R.id.radioGroup60);
        radioGroup61 = v.findViewById(R.id.radioGroup61);
        radioGroup62 = v.findViewById(R.id.radioGroup62);
        radioGroup63 = v.findViewById(R.id.radioGroup63);
        radioGroup64 = v.findViewById(R.id.radioGroup64);
        radioGroup65 = v.findViewById(R.id.radioGroup65);
        radioGroup66 = v.findViewById(R.id.radioGroup66);
        radioGroup67 = v.findViewById(R.id.radioGroup67);
        radioGroup68 = v.findViewById(R.id.radioGroup68);
        radioGroup69 = v.findViewById(R.id.radioGroup69);

        radioGroup70 = v.findViewById(R.id.radioGroup70);
        radioGroup71 = v.findViewById(R.id.radioGroup71);
        radioGroup72 = v.findViewById(R.id.radioGroup72);
        radioGroup73 = v.findViewById(R.id.radioGroup73);
        radioGroup74 = v.findViewById(R.id.radioGroup74);
        radioGroup75 = v.findViewById(R.id.radioGroup75);
        radioGroup76 = v.findViewById(R.id.radioGroup76);
        radioGroup77 = v.findViewById(R.id.radioGroup77);
        radioGroup78 = v.findViewById(R.id.radioGroup78);
        radioGroup79 = v.findViewById(R.id.radioGroup79);

        radioGroup80 = v.findViewById(R.id.radioGroup80);
        radioGroup81 = v.findViewById(R.id.radioGroup81);
        radioGroup82 = v.findViewById(R.id.radioGroup82);
        radioGroup83 = v.findViewById(R.id.radioGroup83);
        radioGroup84 = v.findViewById(R.id.radioGroup84);
        radioGroup85 = v.findViewById(R.id.radioGroup85);
        radioGroup86 = v.findViewById(R.id.radioGroup86);
        radioGroup87 = v.findViewById(R.id.radioGroup87);
        radioGroup88 = v.findViewById(R.id.radioGroup88);
        radioGroup89 = v.findViewById(R.id.radioGroup89);

        radioGroup90 = v.findViewById(R.id.radioGroup90);
        radioGroup91 = v.findViewById(R.id.radioGroup91);
        radioGroup92 = v.findViewById(R.id.radioGroup92);
        radioGroup93 = v.findViewById(R.id.radioGroup93);
        radioGroup94 = v.findViewById(R.id.radioGroup94);
        radioGroup95 = v.findViewById(R.id.radioGroup95);
        radioGroup96 = v.findViewById(R.id.radioGroup96);
        radioGroup97 = v.findViewById(R.id.radioGroup97);
        radioGroup98 = v.findViewById(R.id.radioGroup98);
        radioGroup99 = v.findViewById(R.id.radioGroup99);

        radioGroup100 = v.findViewById(R.id.radioGroup100);


        bt = v.findViewById(R.id.btn);
        bt.setOnClickListener(new View.OnClickListener() {
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

                radioID = radioGroup46.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup47.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup48.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup49.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup50.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup51.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup52.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup53.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup54.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup55.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup56.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup57.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup58.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup59.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup60.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup61.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup62.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup63.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup64.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup65.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup66.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup67.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup68.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup69.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup70.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup71.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup72.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup73.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup74.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup75.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup76.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup77.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup78.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup79.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup80.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup81.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup82.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup83.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup84.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup85.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup86.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup87.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup88.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup89.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup90.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup91.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();



                radioID = radioGroup92.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup93.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup94.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup95.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup96.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup97.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup98.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();


                radioID = radioGroup99.getCheckedRadioButtonId();
                radioButton = v.findViewById(radioID);
                ans = ans + radioButton.getText().toString().trim();

                radioID = radioGroup100.getCheckedRadioButtonId();
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
                                    mDatabase.child("exam").child(user.getUid()).child("answer").setValue(ans);
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