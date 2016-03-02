package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";
    String strMidName = "";
    String strLstName = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    EditText edtxtMidName;
    EditText edtxtLstName;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMidName = (EditText) findViewById(R.id. edtxtMidName);
        edtxtLstName = (EditText) findViewById(R.id. edtxtLstName);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);

    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strMidName = edtxtMidName.getText().toString();
        strLstName = edtxtLstName.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersName, strMidName, strLstName));
    }
}
