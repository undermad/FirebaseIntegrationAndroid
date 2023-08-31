package com.example.firebaseintegration;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference().child("User");

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextText);

        button.setOnClickListener(v -> {

            String username = editText.getText().toString();
            reference.child("newName").setValue(username);


        });



    }
}