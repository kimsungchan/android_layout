package com.example.a403.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ViewStubCompat;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    CheckBox c1;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    Button b1;
    ImageView i;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        c1=(CheckBox)findViewById(R.id.checkBox2);
        r1=(RadioButton)findViewById(R.id.radioButton2);
        r2=(RadioButton)findViewById(R.id.radioButton3);
        r3=(RadioButton)findViewById(R.id.radioButton4);
        b1=(Button)findViewById(R.id.button);
        i=(ImageView)findViewById(R.id.imageView2);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        l=(LinearLayout)findViewById(R.id.linear) ;

        c1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton compoundButton,boolean c){
                if(c){
                    l.setVisibility(View.VISIBLE);
                }
                else{
                    l.setVisibility(View.INVISIBLE);
                }
            }
        });
       b1.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View view){
               if(r1.isChecked()){
                   i.setVisibility(View.VISIBLE);
                   i.setImageResource(R.drawable.a);
               }
               else if(r2.isChecked()){
                   i.setVisibility(View.VISIBLE);
                   i.setImageResource(R.drawable.b);
               }
               else if(r3.isChecked()){
                   i.setVisibility(View.VISIBLE);
                   i.setImageResource(R.drawable.c);
               }
           }
       });
    }
}
