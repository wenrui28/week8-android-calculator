package com.example.week8calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputFirstNumber;
    private EditText inputSecondNumber;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFirstNumber = findViewById(R.id.inputFirstNumber);
        inputSecondNumber = findViewById(R.id.inputSecondNumber);
        textResult = findViewById(R.id.textResult);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);

        buttonPlus.setOnClickListener(v -> calculate('+'));
        buttonMinus.setOnClickListener(v -> calculate('-'));
        buttonMultiply.setOnClickListener(v -> calculate('*'));
        buttonDivide.setOnClickListener(v -> calculate('/'));
    }

    private void calculate(char operator) {
        String firstText = inputFirstNumber.getText().toString().trim();
        String secondText = inputSecondNumber.getText().toString().trim();

        if (firstText.isEmpty() || secondText.isEmpty()) {
            textResult.setText("Please enter both numbers.");
            return;
        }

        try {
            double firstNumber = Double.parseDouble(firstText);
            double secondNumber = Double.parseDouble(secondText);
            double result;

            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        textResult.setText("Cannot divide by zero.");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    textResult.setText("Unknown operation.");
                    return;
            }

            textResult.setText("Result: " + formatNumber(result));
        } catch (NumberFormatException e) {
            textResult.setText("Please enter valid numbers.");
        }
    }

    private String formatNumber(double number) {
        if (number == (long) number) {
            return String.valueOf((long) number);
        }
        return String.valueOf(number);
    }
}
