package com.example.android.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

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
        displayprice(quan*8);
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
        TextView quantityView=(TextView) findViewById(R.id.textView);
        quantityView.setText("" + n);
    }
    private void displayprice(int Num){
        TextView price=(TextView) findViewById(R.id.textView2);
        price.setText("Total Price= "+NumberFormat.getCurrencyInstance().format(Num)+ "\n Thank You!!");
    }
}
