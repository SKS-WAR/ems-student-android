package com.sksm.ssgstudent.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.sksm.ssgstudent.R;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class PdfFragment extends Fragment {

    String link = "", uploadList = "", upload = "";
    PDFView pdfView;

    //the firebase objects for storage and database
    StorageReference mStorageReference;
    DatabaseReference mDatabaseReference;
    private FirebaseAuth mAuth;
    String filepath;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_pdf, container, false);
        mStorageReference = FirebaseStorage.getInstance().getReference();

//        mStorageReference.child("uploads/SSG.pdf").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//                // Got the download URL for 'users/me/profile.png'
////                Toast.makeText(v.getContext(), uri.toString(), Toast.LENGTH_SHORT).show();
//                link = uri.toString();
//                new Pdf.RetrievePDFStream().execute(uri.toString());
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                // Handle any errors
//            }
//        });

        pdfView = v.findViewById(R.id.pdfv);
        pdfView.fromAsset(link).load();


        mStorageReference.child("uploads").child("SSG.pdf").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                new PdfFragment.RetrievePDFStream().execute(uri.toString());

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
//                Toast.makeText(Pdf.this, "CAME HERE", Toast.LENGTH_SHORT).show();
                // Handle any errors
            }
        });
        return v;
    }


    class RetrievePDFStream extends AsyncTask<String, Void, InputStream> {

        ProgressDialog progressDialog;
        protected void onPreExecute()
        {
            progressDialog = new ProgressDialog(pdfView.getContext());
            progressDialog.setTitle("Getting the Question...");
            progressDialog.setMessage("Please wait...");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

        }
        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;

            try {

                URL urlx = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) urlx.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());

                }
            } catch (IOException e) {
                return null;
            }
            return inputStream;

        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
            progressDialog.dismiss();
        }
    }
    @Override public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)//means home default hai kya yesok
        {
//            onBackPressed();
            return true;
        }
        return false;
    }
}

