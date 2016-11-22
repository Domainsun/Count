package com.example.administrator.count;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button Button_0,Button_1,Button_2,Button_3,Button_4,Button_5,Button_6,Button_7,Button_8,Button_9,Button_add,Button_sub,Button_div,Button_mul,Button_count,Button_del,Button_ling,Button_dot;
    private EditText editText;
    private String str="";
    private TextView textView;
    Operation o=new Operation();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.edittext_calc);
        textView= (TextView) findViewById(R.id.textview1);
        Button_0= (Button) findViewById(R.id.button_0);
        Button_1= (Button) findViewById(R.id.button_1);
        Button_2= (Button) findViewById(R.id.button_2);
        Button_3= (Button) findViewById(R.id.button_3);
        Button_4= (Button) findViewById(R.id.button_4);
        Button_5= (Button) findViewById(R.id.button_5);
        Button_6= (Button) findViewById(R.id.button_6);
        Button_7= (Button) findViewById(R.id.button_7);
        Button_8= (Button) findViewById(R.id.button_8);
        Button_9= (Button) findViewById(R.id.button_9);
        Button_add= (Button) findViewById(R.id.button_add);
        Button_sub= (Button) findViewById(R.id.button_sub);
        Button_mul= (Button) findViewById(R.id.button_mul);
        Button_div= (Button) findViewById(R.id.button_div);
        Button_dot= (Button) findViewById(R.id.button_dot);
        Button_del= (Button) findViewById(R.id.button_del);
        Button_ling= (Button) findViewById(R.id.button_ling);
        Button_count= (Button) findViewById(R.id.button_count);
        Button_0.setOnClickListener(this);
        Button_1.setOnClickListener(this);
        Button_2.setOnClickListener(this);
        Button_3.setOnClickListener(this);
        Button_4.setOnClickListener(this);
        Button_5.setOnClickListener(this);
        Button_6.setOnClickListener(this);
        Button_7.setOnClickListener(this);
        Button_8.setOnClickListener(this);
        Button_9.setOnClickListener(this);
        Button_add.setOnClickListener(this);
        Button_sub.setOnClickListener(this);
        Button_mul.setOnClickListener(this);
        Button_div.setOnClickListener(this);
        Button_ling.setOnClickListener(this);
        Button_dot.setOnClickListener(this);
        Button_del.setOnClickListener(this);
        Button_count.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_0:
                str+=Button_0.getText();
                editText.setText(str);
                break;
            case R.id.button_1:
                str+=Button_1.getText();
                editText.setText(str);
                break;
            case R.id.button_2:
                str+=Button_2.getText();
                editText.setText(str);
                break;
            case R.id.button_3:
                str+=Button_3.getText();
                editText.setText(str);
                break;
            case R.id.button_4:
                str+=Button_4.getText();
                editText.setText(str);
                break;
            case R.id.button_5:
                str+=Button_5.getText();
                editText.setText(str);
                break;
            case R.id.button_6:
                str+=Button_6.getText();
                editText.setText(str);
                break;
            case R.id.button_7:
                str+=Button_7.getText();
                editText.setText(str);
                break;
            case R.id.button_8:
                str+=Button_8.getText();
                editText.setText(str);
                break;
            case R.id.button_9:
                str+=Button_9.getText();
                editText.setText(str);
                break;
            case R.id.button_dot:
                str+=Button_dot.getText();
                editText.setText(str);
                break;
            case R.id.button_add:
                str+=Button_add.getText();
                editText.setText(str);
                break;
            case R.id.button_sub:
                str+=Button_sub.getText();
                editText.setText(str);
                break;
            case R.id.button_mul:
                str+=Button_mul.getText();
                editText.setText(str);
                break;
            case R.id.button_div:
                str+=Button_div.getText();
                editText.setText(str);
                break;
            case R.id.button_ling:
                editText.setText("");
                break;
            case R.id.button_del:
//                String a=str.substring(str.length()-1);
                str= str.substring(0,str.length()-1);
                editText.setText(str);
                break;
            case R.id.button_count:


                double sum=o.muldiv(o.fenge(str));
                String sumcount=sum+"";
                textView.setText("結果為："+sumcount);
                break;
        }
    }
}
