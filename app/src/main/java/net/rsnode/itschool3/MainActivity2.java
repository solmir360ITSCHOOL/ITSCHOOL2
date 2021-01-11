package net.rsnode.itschool3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        findViewById(R.id.reg_btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("callback", ((EditText) findViewById(R.id.login2)).getText().toString());
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}