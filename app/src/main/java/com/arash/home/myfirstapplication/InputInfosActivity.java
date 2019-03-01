package com.arash.home.myfirstapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputInfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_infos);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        final EditText name = findViewById(R.id.edtName);
        final EditText family = findViewById(R.id.edtFamily);
        final EditText phone = findViewById(R.id.edtPhone);
        final EditText mail = findViewById(R.id.edtMail);
        final EditText address = findViewById(R.id.edtAddress);
        final EditText age = findViewById(R.id.edtAge);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputInfosActivity.this, ViewingInfosActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("family", family.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("mail", mail.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("age", age.getText().toString());

                startActivityForResult(intent, 123);
            }
        });

        TextView profile = findViewById(R.id.txtProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputInfosActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

//        Button btnWeb = findViewById(R.id.btnWeb);
//        btnWeb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123) {
            if (resultCode == RESULT_OK) {
                if (data.getStringExtra("captcha").equals("13A4")) {
                    Toast.makeText(this, "Information has been saved.", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
