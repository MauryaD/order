package com.example.android.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quan=0;
    public void Order(View view){
        //int quantity=4;
        //System.out.println("Total Price is: ");
        display(quan);
        displayprice(quan);
    }

    public void increament(View view){
        quan++;
        display(quan);
    }
    public void decre(View view){
        quan--;
        display(quan);

    }

    private void display(int n){
        if (n > 0) {
            TextView quantityView = (TextView) findViewById(R.id.textView);
            quantityView.setText("" + n);
        } else {
            TextView quantityView = (TextView) findViewById(R.id.textView);
            quantityView.setText("Please place a valid order");
        }
    }

    public void tip_calc() {
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                Log.i("ID", String.valueOf(selectedId));

            }
        });
    }




    private void displayprice(int Num){

        Num = Num * 8;
        TextView price=(TextView) findViewById(R.id.textView2);
        price.setText("Total Price= "+NumberFormat.getCurrencyInstance().format(Num)+ "\n Thank You!!");

    }
}
