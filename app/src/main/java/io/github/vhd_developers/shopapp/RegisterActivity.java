package io.github.vhd_developers.shopapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    EditText reg_name,reg_hname,reg_age,reg_pin,reg_dst,reg_place;
    TextView tv_login;
    Button reg_button;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("We hate you leaving. Are you sure?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        System.exit(0);
                        finishAffinity();

                    }
                })
                .setCancelable(false)
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();

                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_name = findViewById(R.id.et_reg_name);
        reg_hname = findViewById(R.id.et_reg_hname);
        reg_age = findViewById(R.id.et_reg_age);
        reg_pin = findViewById(R.id.et_reg_pincode);
        reg_dst = findViewById(R.id.et_reg_dst);
        reg_place = findViewById(R.id.et_reg_place);

        tv_login = findViewById(R.id.tv_login);

        reg_button = findViewById(R.id.btn_next);

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent loginintent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginintent);
                finish();

            }
        });
    }
}