package com.example.calculator;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbtn= findViewById(R.id.addbtn);
        Button subbtn= findViewById(R.id.subbtn);
        Button mulbtn= findViewById(R.id.mulbtn);
        Button divbtn= findViewById(R.id.divbtn);
        final EditText n1= findViewById(R.id.editText);
        final EditText n2= findViewById(R.id.editText2);
        final TextView Result= findViewById(R.id.FirstAnswer);
        final TextView finalResult = findViewById(R.id.SecondAnswer);
        final InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(TextUtils.isEmpty(s1))
                 {

                     if(n1.requestFocus())
                     //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                         imm.showSoftInput(n1,InputMethodManager.SHOW_IMPLICIT);
                     n1.setError("The item cannot be empty");
                 }
                 else if(TextUtils.isEmpty(s2))
                 {

                     if(n2.requestFocus())
                     //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
                         imm.showSoftInput(n2,InputMethodManager.SHOW_IMPLICIT);
                     n2.setError("The item cannot be empty");
                 }
                 else {
                    int num1=Integer.parseInt(n1.getText().toString());
                    int num2=Integer.parseInt(n2.getText().toString());
                    n1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    n2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                     int res = num1 + num2;
                     Result.setText(num1 + "+" + num2 + "=");
                     finalResult.setText(res + "");
                 }
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(TextUtils.isEmpty(s1))
                {

                    if(n1.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n1,InputMethodManager.SHOW_IMPLICIT);
                    n1.setError("The item cannot be empty");
                }
                else if(TextUtils.isEmpty(s2))
                {

                    if(n2.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n2,InputMethodManager.SHOW_IMPLICIT);
                    n2.setError("The item cannot be empty");
                }
                else {
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    n1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    n2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    int res = num1 - num2;
                    Result.setText(num1 + "-" + num2 + "=");
                    finalResult.setText(res + "");
                }
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(TextUtils.isEmpty(s1))
                {

                    if(n1.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n1,InputMethodManager.SHOW_IMPLICIT);
                    n1.setError("The item cannot be empty");
                }
                else if(TextUtils.isEmpty(s2))
                {

                    if(n2.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n2,InputMethodManager.SHOW_IMPLICIT);
                    n2.setError("The item cannot be empty");
                }
                else {
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    int res = num1 * num2;
                    n1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    n2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    Result.setText(num1 + "*" + num2 + "=");
                    finalResult.setText(res + "");
                }
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(TextUtils.isEmpty(s1))
                {

                    if(n1.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n1,InputMethodManager.SHOW_IMPLICIT);
                    n1.setError("The item cannot be empty");
                }
                else if(TextUtils.isEmpty(s2))
                {

                    if(n2.requestFocus())
                        //getWindow().setSoftInputMode((WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE));
                        imm.showSoftInput(n2,InputMethodManager.SHOW_IMPLICIT);
                    n2.setError("The item cannot be empty");
                }
                else {
                    float num1 = Float.parseFloat(n1.getText().toString());
                    float num2 = Float.parseFloat(n2.getText().toString());
                    n1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    n2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    if (num2 != 0) {
                        float res = num1 / num2;
                        Result.setText(Integer.parseInt(n1.getText().toString()) + "/" + Integer.parseInt(n2.getText().toString()) + "=");
                        finalResult.setText(res + "");
                    } else
                        Result.setText("Zero Divide Error");
                        finalResult.setText("");
                }
            }
        });
    }
}
