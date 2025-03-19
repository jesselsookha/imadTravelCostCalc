package vcmsa.ci.travelcostcalc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Private fields
    private lateinit var editTextDistance: EditText
    private lateinit var spinnerTransportMode: Spinner
    private lateinit var buttonCalculate: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Linking controls to layout elements
        editTextDistance = findViewById(R.id.editTextDistance)
        spinnerTransportMode = findViewById(R.id.spinnerTransportMode)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewResult = findViewById(R.id.textViewResult)

        // Setting up button click listener
        buttonCalculate.setOnClickListener {
            calculateTravelCost()
        }
    }

    // Function to calculate travel cost and eco-feedback
    private fun calculateTravelCost(){}
}