package com.example.android.first;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.DoubleSummaryStatistics;


public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quan=0;
    public void Order(View view){
        //int quantity=4;
        //System.out.println("Total Price is: ");
        et = findViewById(R.id.Edit);
        String name = et.getText().toString();

        CheckBox CB1 = findViewById(R.id.CB1);
        boolean cb = CB1.isChecked();
        Log.v("MainActivity", "Has whipped cream: " + cb);
        CheckBox CB2 = findViewById(R.id.CB2);
        boolean cb2 = CB2.isChecked();
        Log.v("MainActivity", "Has Chocolate: " + cb2);

        displayprice(quan * 8, cb, cb2);
    }

    public void increament(View view){
        quan++;
        if (quan > 5) {
            Context context = getApplicationContext();
            Toast.makeText(context, "Please Enter the quantity greater than 0",
                    Toast.LENGTH_SHORT).show();
        }

        display(quan);
    }
    public void decre(View view){
        quan--;
        if (quan < 0) {
            Context context = getApplicationContext();
            Toast.makeText(context, "Please Enter the quantity greater than 0",
                    Toast.LENGTH_SHORT).show();
        }
        display(quan);

    }

    private void display(int n){
        TextView quantityView=(TextView) findViewById(R.id.textView);
        quantityView.setText("" + n);
    }

    private void displayprice(int Num, boolean h, boolean g) {
        TextView price=(TextView) findViewById(R.id.textView2);

        String summary;
        summary = "Total Price= " + NumberFormat.getCurrencyInstance().format(Num);
        summary += "\nAdd whipped cream? " + h;
        summary += "\nAdd Chocolate? " + g;
        summary += "\nQuantity= " + quan;
        summary += "\n Thank You!!";

        price.setText(summary);
    }
    public void next(View view){
        Button next= (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newactivity= new Intent(MainActivity.this, Activity2.class);
                startActivity(newactivity) ;
            }
        });

    }

}
