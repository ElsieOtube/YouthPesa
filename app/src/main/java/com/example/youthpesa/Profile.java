package com.example.youthpesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {
    private TextView deleteAccount;
    private FirebaseUser user;
    private FirebaseUser mAuth;
    String userID;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    private DatabaseReference databaseReference;
    private FirebaseDatabase mStore;
    private TextView username, email, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        user = FirebaseAuth.getInstance().getCurrentUser();
        userID= user.getUid();
        databaseReference = mStore.getReference().child("Customers").child(userID);

        deleteAccount = findViewById(R.id.deleteAccount);
        username = findViewById(R.id.profileUsername);
        email = findViewById(R.id.profileEmail);
        phone = findViewById(R.id.profilePhone);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String userName = snapshot.child("Username").getValue().toString();
                String Email = snapshot.child("Email").getValue().toString();
                String Phone = snapshot.child("Phone Number").getValue().toString();

                username.setText(userName);
                email.setText(Email);
                phone.setText(Phone);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        deleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogDelete = new AlertDialog.Builder(Profile.this);
                dialogDelete.setTitle("Are you sure?");
                dialogDelete.setMessage("Deleting your account will result in completely removing your account from the system and you won't be able to access the app");
                dialogDelete.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        user.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(Profile.this, "DELETING...", Toast.LENGTH_SHORT).show();
                                if(task.isSuccessful()){
                                    Toast.makeText(Profile.this, "Account deleted", Toast.LENGTH_SHORT).show();
                                    Intent deleteProfile = new Intent(Profile.this, Login.class);
                                    deleteProfile.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    deleteProfile.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    startActivity(deleteProfile);
                                }else{
                                    Toast.makeText(Profile.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }
                });
                dialogDelete.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog = dialogDelete.create();
                alertDialog.show();
            }
        });
    }
}