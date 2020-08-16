package io.github.vhd_developers.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactRegisterActivity extends AppCompatActivity {

    EditText et_email,et_pass,et_cpass,et_uname,et_mob;
    Button verify_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_register);

        et_email = findViewById(R.id.et_reg_mail);
        et_pass = findViewById(R.id.et_reg_pwd);
        et_cpass = findViewById(R.id.et_reg_cpwd);
        et_uname = findViewById(R.id.et_reg_uname);
        et_mob = findViewById(R.id.et_reg_mob);

        verify_btn = findViewById(R.id.btn_reg);

        verify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent verifyIntent = new Intent(ContactRegisterActivity.this,VerifyActivity.class);
                verifyIntent.putExtra("mob_number",Double.valueOf(et_mob.getText().toString()));
                startActivity(verifyIntent);
                finish();

            }
        });



    }
}