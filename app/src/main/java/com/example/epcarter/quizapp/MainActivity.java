package com.example.epcarter.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int checkAns(){
        int numCorrect=0;
        CheckBox all= (CheckBox) findViewById(R.id.all_check);
        boolean allCheck= all.isChecked();
        if(allCheck) {
            numCorrect++;
            System.out.println("1st right");
        }
        EditText ageField= (EditText) findViewById(R.id.age_field);
        Editable age= ageField.getText();
        String sAge= age.toString();
        if(sAge.compareTo("21")==0) {
            numCorrect++;
            System.out.println("2nd right");
        }
        CheckBox song= (CheckBox) findViewById(R.id.one_night_check);
        boolean oneNight= all.isChecked();
        if(oneNight) {
            numCorrect++;
            System.out.println("3rd right");
        }

        EditText nameField= (EditText) findViewById(R.id.name_field);
        Editable name= ageField.getText();
        String sName= name.toString();
        if(sName.compareTo("Miles Parks McCollum")==0) {
            numCorrect++;
            System.out.println("4th right");
        }

        CheckBox money= (CheckBox) findViewById(R.id.thirteenMil_check);
        boolean thirteen= all.isChecked();
        if(thirteen) {
            numCorrect++;
            System.out.println("5th right");
        }
        return numCorrect;
    }
    public void displayScore(){
        TextView debugger= (TextView) findViewById(R.id.debug);
        debugger.setText("Got here");
        //int numCorrect= this.checkAns();
        //Toast.makeText(this, "You got "+numCorrect+" out of 5 correct", Toast.LENGTH_SHORT).show();
    }
}
