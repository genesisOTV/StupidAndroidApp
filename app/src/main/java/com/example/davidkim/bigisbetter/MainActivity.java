package com.example.davidkim.bigisbetter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView points;
    Button leftButton;
    Button rightButton;

    Random randNum = new Random();
    int rand1;
    int rand2;

    int pointNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //when the app loads up
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.title);
        points = (TextView) findViewById(R.id.points);
        leftButton = (Button) findViewById(R.id.leftButton);
        rightButton = (Button) findViewById(R.id.rightButton);

        //generate random numbers
        rand1 = randNum.nextInt(100);
        rand2 = randNum.nextInt(100);

        leftButton.setText(Integer.toString(rand1));
        rightButton.setText(Integer.toString(rand2));
    }

    public void leftButtonClick(View view) {
        //todo
        if(Integer.parseInt(leftButton.getText().toString()) > Integer.parseInt(rightButton.getText().toString()))
        {
            title.setText("Correct!");

            //generate new random numbers
            rand1 = randNum.nextInt(100);
            rand2 = randNum.nextInt(100);

            leftButton.setText(Integer.toString(rand1));
            rightButton.setText(Integer.toString(rand2));

            points.setText("Points: " + Integer.toString(pointNum++));
        }
        else
        {
            title.setText("Incorrect, try again!");
        }
    }

    public void rightButtonClick(View view) {
        //todo
        if(Integer.parseInt(leftButton.getText().toString()) < Integer.parseInt(rightButton.getText().toString()))
        {
            title.setText("Correct!");

            //generate new random numbers
            rand1 = randNum.nextInt(100);
            rand2 = randNum.nextInt(100);

            leftButton.setText(Integer.toString(rand1));
            rightButton.setText(Integer.toString(rand2));

            points.setText("Points: " + Integer.toString(pointNum++));
        }
        else
        {
            title.setText("Incorrect, try again!");
        }
    }
}
