package net.snode.itschool3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String correctLogin = "ITSCHOOL";
    private String correctPass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText loginElem = findViewById(R.id.login);
                EditText passElem = findViewById(R.id.pass);
                TextView enter = findViewById(R.id.enter);

                String login = loginElem.getText().toString();
                String pass = passElem.getText().toString();

                if (login.equals(correctLogin) && pass.equals(correctPass)) {
                    enter.setText(getResources().getString(R.string.Correct));
                    enter.setTextColor(getResources().getColor(R.color.correct));
                }
                else  {
                    enter.setText(getResources().getString(R.string.Incorrect));
                    enter.setTextColor(getResources().getColor(R.color.incorrect));
                }

                loginElem.setText("");
                passElem.setText("");
            }
        });
    }
}