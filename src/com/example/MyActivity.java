package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity
{
    TextView tv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv= (TextView) findViewById(R.id.user_output);
    }
    public void submitUsername(View view)
    {
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        tv.setText("Hello " + message);
        editText.setText("");
    }
}
