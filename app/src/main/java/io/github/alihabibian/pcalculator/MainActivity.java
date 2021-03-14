package io.github.alihabibian.pcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtEnterPercent;
    private EditText edtEnterNumber;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEnterPercent = (EditText) findViewById(R.id.edtEnterPercent);
        edtEnterNumber = (EditText) findViewById(R.id.edtEnterNumber);
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(v -> {
            Double percentNumericValue = Double.parseDouble(edtEnterPercent.getText().toString());
            Double decimalValue = percentNumericValue / 100;
            Double number = Double.parseDouble(edtEnterNumber.getText().toString());
            Double result = decimalValue * number;
            txtResult.setText(String.valueOf(result));
        });
    }
}