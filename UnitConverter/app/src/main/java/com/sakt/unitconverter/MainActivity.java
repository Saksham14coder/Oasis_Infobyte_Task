package com.sakt.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] items = {"cm to m","m to cm","kg to g","g to kg","m to mm","mm to m","ft to cm","cm to ft","m to ft","ft to m"};
    ArrayAdapter<String> adapterItem;
    AutoCompleteTextView autoCompleteTextView;
    EditText value,output1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        value=findViewById(R.id.Value);
        output1 =findViewById(R.id.output1);
        autoCompleteTextView = findViewById(R.id.autoCompleteview);
        adapterItem = new ArrayAdapter<String>(this,R.layout.list_college,items);

        autoCompleteTextView.setAdapter(adapterItem);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();

                if(id==56){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }else{
                        float F2 = Float.parseFloat(number);
                        float FA = ((F2 - 32)*5)/9;
                        String Answer = Float.toString(FA);
                        output1.setText(Answer +"  C");
                    }

                    Toast.makeText(MainActivity.this, "Fahrenheit to Celsius", Toast.LENGTH_SHORT).show();
                }else if(id==0){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num/100;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  m");
                    }

                    Toast.makeText(MainActivity.this, "cm to m", Toast.LENGTH_SHORT).show();
                }
                else if(id==1){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num*100;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  cm");
                    }

                    Toast.makeText(MainActivity.this, "m to cm", Toast.LENGTH_SHORT).show();
                }
                else if(id==2){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num*1000;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  g");
                    }

                    Toast.makeText(MainActivity.this, "kg to g", Toast.LENGTH_SHORT).show();
                }
                else if(id==3){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num/1000;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  kg");
                    }

                    Toast.makeText(MainActivity.this, "g to kg", Toast.LENGTH_SHORT).show();
                }
                else if(id==4){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num*10;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  mm");
                    }

                    Toast.makeText(MainActivity.this, "m to mm", Toast.LENGTH_SHORT).show();
                }
                else if(id==5){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float num = Float.parseFloat(number);
                        float ans = num/10;
                        String Answer = Float.toString(ans);
                        output1.setText(Answer +"  m");
                    }

                    Toast.makeText(MainActivity.this, "mm to m", Toast.LENGTH_SHORT).show();
                }
                else if(id==6){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double num = Double.parseDouble(number);
                        double ans = num*(30.48);
                        String Answer = Double.toString(ans);
                        output1.setText(Answer +"  cm");
                    }

                    Toast.makeText(MainActivity.this, "ft to cm", Toast.LENGTH_SHORT).show();
                }
                else if(id==7){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double num = Double.parseDouble(number);
                        double ans = num/(30.48);
                        String Answer = Double.toString(ans);
                        output1.setText(Answer +"  ft");
                    }

                    Toast.makeText(MainActivity.this, "cm to ft", Toast.LENGTH_SHORT).show();
                }
                else if(id==8){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double num = Double.parseDouble(number);
                        double ans = num*(3.28);
                        String Answer = Double.toString(ans);
                        output1.setText(Answer +"  ft");
                    }

                    Toast.makeText(MainActivity.this, "m to ft", Toast.LENGTH_SHORT).show();
                }
                else if(id==9){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double num = Double.parseDouble(number);
                        double ans = num/(3.28);
                        String Answer = Double.toString(ans);
                        output1.setText(Answer +"  m");
                    }

                    Toast.makeText(MainActivity.this, "ft to m", Toast.LENGTH_SHORT).show();
                }

                else if(id==22){

                    String number = value.getText().toString();
                    if (number.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter Value", Toast.LENGTH_SHORT).show();
                    }
                    float C2 = Float.parseFloat(number);
                    float FA = (C2*9/5)+32;
                    String Answer = Float.toString(FA);
                    output1.setText(Answer+" F");

                    Toast.makeText(MainActivity.this, "Celsius to Fahrenheit", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}