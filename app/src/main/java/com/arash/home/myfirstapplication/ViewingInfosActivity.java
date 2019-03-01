package com.arash.home.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViewingInfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewing_infos);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String family = intent.getStringExtra("family");
        String phone = intent.getStringExtra("phone");
        String mail = intent.getStringExtra("mail");
        String address = intent.getStringExtra("address");
        String age = intent.getStringExtra("age");

        PreferenceManager.getDefaultSharedPreferences(ViewingInfosActivity.this).edit()
                .putString("name", name)
                .putString("family", family)
                .putString("phone", phone)
                .putString("mail", mail)
                .putString("address", address)
                .putString("age", age)
                .apply();

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

        Button btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText captcha = findViewById(R.id.edtCaptcha);
                String sCaptcha = captcha.getText().toString();
                Intent returnIntent = new Intent();
                returnIntent.putExtra("captcha", sCaptcha);
                setResult(Activity.RESULT_OK);
                finish();
            }
        });

    }
}
