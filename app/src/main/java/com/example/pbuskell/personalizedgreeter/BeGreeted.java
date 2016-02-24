package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strFirstName = "";
    String strMiddle = "";
    String strLast = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    EditText edtxtMiddleField;
    EditText edtxtLastField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMiddleField = (EditText) findViewById(R.id.edtxtMiddleField);
        edtxtLastField = (EditText) findViewById(R.id.edtxtLastField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();
        String result = "";

        strFirstName = edtxtNameField.getText().toString();
        strMiddle = edtxtMiddleField.getText().toString();
        strLast = edtxtLastField.getText().toString();

        if(!strFirstName.equals("Name"))
        {
            result += strFirstName + " ";
        }
        if(!strMiddle.equals("Name"))
        {
            result += strMiddle + " ";
        }
        if(!strLast.equals("Name"))
        {
            result += strLast + " ";
        }

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), result));
    }
}
