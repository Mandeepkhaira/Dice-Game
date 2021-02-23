package com.example.dice_game;

import androidx.appcompat.app.AppCompatActivity;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Logo = findViewById(R.id.Logo);
        ImageView UserDice = findViewById(R.id.UserDice);
        ImageView ComputerDice = findViewById(R.id.ComputerDice);
        Button Higher = findViewById(R.id.Higher);
        Button Lower = findViewById(R.id.Lower);
        TextView Display=findViewById(R.id.Display);

        int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        Higher.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                int bound=6;
                Random rand = new Random();
                int UDice = rand.nextInt(bound);
                int CDice = rand.nextInt(bound);

                UserDice.setImageResource(diceArray[UDice]);
                ComputerDice.setImageResource(diceArray[CDice]);
                if(UDice>CDice)
                {
                    Display.setText("User Win");
                }
                else if(UDice<CDice)
                {
                    Display.setText("User Lost");
                }
                else {
                    Display.setText("It is a tie");
                }
            }
        });

        Lower.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                int bound=6;
                Random rand = new Random();
                int UDice = rand.nextInt(bound);
                int CDice = rand.nextInt(bound);

                UserDice.setImageResource(diceArray[UDice]);
               ComputerDice.setImageResource(diceArray[CDice]);

                if(UDice<CDice)
                {
                    Display.setText("User Win");
                }
                else if(UDice>CDice)
                {
                    Display.setText("Computer is winner");
                }
                else {


                    Display.setText("There is a tie");
                }


            }
        });



    }
}