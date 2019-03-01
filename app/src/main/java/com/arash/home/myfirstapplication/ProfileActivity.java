package com.arash.home.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String name = PreferenceManager.getDefaultSharedPreferences(this).getString("name","No Name");
        String family = PreferenceManager.getDefaultSharedPreferences(this).getString("family","No Family Name");
        String phone = PreferenceManager.getDefaultSharedPreferences(this).getString("phone","No Phone Number");
        String mail = PreferenceManager.getDefaultSharedPreferences(this).getString("mail","No Email");
        String address = PreferenceManager.getDefaultSharedPreferences(this).getString("address","No Address");
        String age = PreferenceManager.getDefaultSharedPreferences(this).getString("age","No Age");

        TextView txtName = findViewById(R.id.txtName);
        TextView txtFamily = findViewById(R.id.txtFamily);
        TextView txtPhone = findViewById(R.id.txtPhone);
        TextView txtMail = findViewById(R.id.txtMail);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtAge = findViewById(R.id.txtAge);

        txtName.setText("First Name : " + name);
        txtFamily.setText("Family Name : " + family);
        txtPhone.setText("Phone Number : " + phone);
        txtMail.setText("Email Address : " + mail);
        txtAddress.setText("Postal Address : " + address);
        txtAge.setText("Age : " + age);
    }
}
