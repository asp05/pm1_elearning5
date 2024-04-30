package com.example.elearning5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Temukan button
        val buttonToast = findViewById<Button>(R.id.buttonToast)
        val buttonAlert = findViewById<Button>(R.id.buttonAlert)


        // Set OnClickListener untuk button Toast
        buttonToast.setOnClickListener {
            // Tampilkan Toast
            Toast.makeText(this, "Tombol Toast diklik!", Toast.LENGTH_SHORT).show()
        }

        // Set OnClickListener untuk button Alert
        buttonAlert.setOnClickListener {
            // Tampilkan Alert Dialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Perhatian!")
            builder.setMessage("Apakah Anda ingin melanjutkan?")
            builder.setPositiveButton("Ya") { dialog, which ->
                // Lakukan sesuatu ketika tombol "Ya" diklik
                Toast.makeText(this, "Tombol Ya diklik!", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("Tidak") { dialog, which ->
                // Lakukan sesuatu ketika tombol "Tidak" diklik
                Toast.makeText(this, "Tombol Tidak diklik!", Toast.LENGTH_SHORT).show()
            }
            builder.show()
        }
    }
}