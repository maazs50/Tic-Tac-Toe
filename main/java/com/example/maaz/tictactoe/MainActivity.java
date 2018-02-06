package com.example.maaz.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean pointer = true;
int x=0,o=0;
    String value = " ";
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String v1, v2, v3, v4, v5, v6, v7, v8, v9;
    TextView xScore, yScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        xScore=(TextView)findViewById(R.id.xScore);
        yScore=(TextView)findViewById(R.id.yScore);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v1 = value;

                b1.setText(value);
b1.setEnabled(false);

                whoWins();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v2 = value;
                b2.setText(value);
                b2.setEnabled(false);

                whoWins();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v3 = value;
                b3.setText(value);
                b3.setEnabled(false);
                whoWins();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v4 = value;
                b4.setText(value);
                b4.setEnabled(false);
                whoWins();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v5 = value;
                b5.setText(value);
                b5.setEnabled(false);
                whoWins();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v6 = value;
                b6.setText(value);
                b6.setEnabled(false);
                whoWins();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v7 = value;
                b7.setText(value);
                b7.setEnabled(false);
                whoWins();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v8 = value;
                b8.setText(value);
                b8.setEnabled(false);
                whoWins();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evaluate();
                v9 = value;
                b9.setText(value);
                b9.setEnabled(false);
                whoWins();
            }
        });
    }


    public void reset(View view) {

        if (value != "") {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Do you Want to Reset?");
            alert.setMessage("This will clear all the entries");

            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
              clear();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.show();


        }
    }


    public void evaluate() {
        if (pointer == true) {
            value = "X";
            pointer = false;
        } else if (pointer == false) {
            value = "O";
            pointer = true;

        }

    }

    public void whoWins() {


        if (v1 == "X" && v2 == "X" && v3 == "X") {
     xWIns();
        } else if (v6 == "X" && v4 == "X" && v5 == "X") {
            xWIns();
        } else if (v7 == "X" && v8 == "X" && v9 == "X") {
            xWIns();
        } else if (v1 == "X" && v4 == "X" && v7 == "X") {
            xWIns();
        }
        else if (v2 == "X" && v5 == "X" && v8== "X") {
            xWIns();
        }
        else if (v3 == "X" && v6 == "X" && v9 == "X") {
            xWIns();
        }
        else if (v1 == "X" && v5 == "X" && v9 == "X") {
            xWIns();
        }
        else if (v3 == "X" && v5 == "X" && v7 == "X") {
            xWIns();
        }
        else   if (v1 == "O" && v2 == "O" && v3 == "O") {
            oWins();
        } else if (v6 == "O" && v4 == "O" && v5 == "O") {
            oWins();
        } else if (v7 == "O" && v8 == "O" && v9 == "O") {
            oWins();
        } else if (v1 == "O" && v4 == "O" && v7 == "O") {
            oWins();
        }
        else if (v2 == "O" && v5 == "O" && v8== "O") {
            oWins();
        }
        else if (v3 == "O" && v6 == "O" && v9 == "O") {
            oWins();
        }
        else if (v1 == "O" && v5 == "O" && v9 == "O") {
            oWins();
        }
        else if (v3 == "O" && v5 == "O" && v7 == "O") {
            oWins();
        }

    }

    public void clear() {
        value = "";
        pointer = true;
        v1="";
        v2="";
        v3="";
        v4="";
        v5="";
        v6="";
        v7="";
        v8="";
        v9="";
        b1.setText(value);
        b2.setText(value);
        b3.setText(value);
        b4.setText(value);
        b5.setText(value);
        b6.setText(value);
        b7.setText(value);
        b8.setText(value);
        b9.setText(value);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);


    }
//is called when x wins
public void xWIns(){
    x=x+1;
    xScore.setText(String.valueOf(x));

    AlertDialog.Builder alertMessage = new AlertDialog.Builder(this);

    alertMessage.setTitle("Congratulations!!");
    alertMessage.setMessage("X Wins");

    alertMessage.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            clear();

        }
    });
    alertMessage.show();
}
   //Is called when y Wins
    public void oWins(){
    o=o+1;
        yScore.setText(String.valueOf(o));

        AlertDialog.Builder alertMessage = new AlertDialog.Builder(MainActivity.this);

        alertMessage.setTitle("Congratulations!!");
        alertMessage.setMessage("O Wins");

        alertMessage.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                clear();

            }
        });
        alertMessage.show();

    }
    //called when no one wins
    public void draw(){
        AlertDialog.Builder alertMessage = new AlertDialog.Builder(MainActivity.this);

        alertMessage.setTitle("Its a Draw!!");
        alertMessage.setMessage("Try another match");

        alertMessage.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                clear();

            }
        });
        alertMessage.show();
    }

}
