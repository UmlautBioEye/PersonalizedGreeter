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
    String strUsersMiddleName = "";
    String strUsersLastName = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    EditText edtxtMiddleName;
    EditText edtxtLastName;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
        edtxtMiddleName =(EditText) findViewById(R.id.edtxtMiddleName);
        edtxtLastName =(EditText) findViewById(R.id.edtxtLastName);

    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strUsersMiddleName = edtxtMiddleName.getText().toString();
        strUsersLastName = edtxtLastName.getText().toString();


        txtvwGreetingSpace.setText(String.format("Hello, %1$s %2$s %3$s", strUsersName, strUsersMiddleName, strUsersLastName));
    }
}
