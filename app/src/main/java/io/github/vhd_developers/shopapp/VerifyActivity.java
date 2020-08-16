package io.github.vhd_developers.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VerifyActivity extends AppCompatActivity {

    TextView tv_number,tv_resend,tv_edit;
    Button verify_button;
    EditText et_otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        tv_number = findViewById(R.id.tv_mobno);
        tv_edit = findViewById(R.id.tv_edit);
        tv_resend = findViewById(R.id.tv_resend);

        Double mob = getIntent().getExtras().getDouble("mob_number");

        tv_number.setText(String.valueOf(mob));

    }
}