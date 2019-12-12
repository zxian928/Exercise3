package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cal = findViewById<Button>(R.id.buttonCalculate)
        val reset = findViewById<Button>(R.id.buttonReset)
        val toast = Toast.makeText(applicationContext, "Please select your gender", Toast.LENGTH_SHORT)



        cal.setOnClickListener{

            if(radioGroupGender.checkedRadioButtonId == -1){
                toast.show()
            }else if(radioButtonFemale.isChecked){
                if(checkBoxSmoker.isChecked){
                    when {
                        spinnerAge.selectedItemPosition == 0 -> textViewPremium.text = "Insurance Premium : RM" + 60
                        spinnerAge.selectedItemPosition == 1 -> textViewPremium.text = "Insurance Premium : RM" + (70+100).toString()
                        spinnerAge.selectedItemPosition == 2 -> textViewPremium.text = "Insurance Premium : RM" + ((90+150).toString())
                        spinnerAge.selectedItemPosition == 3 -> textViewPremium.text = "Insurance Premium : RM" + ((120+200).toString())
                        spinnerAge.selectedItemPosition == 4 -> textViewPremium.text = "Insurance Premium : RM" + ((150+250).toString())
                        spinnerAge.selectedItemPosition == 5 -> textViewPremium.text = "Insurance Premium : RM" + ((150+300).toString())

                    }
                }else {
                    when {
                        spinnerAge.selectedItemPosition == 0 -> textViewPremium.text = "Insurance Premium : RM" + (60.toString())
                        spinnerAge.selectedItemPosition == 1 -> textViewPremium.text = "Insurance Premium : RM" + ((70).toString())
                        spinnerAge.selectedItemPosition == 2 -> textViewPremium.text = "Insurance Premium : RM" + ((90).toString())
                        spinnerAge.selectedItemPosition == 3 -> textViewPremium.text = "Insurance Premium : RM" + ((120).toString())
                        spinnerAge.selectedItemPosition == 4 -> textViewPremium.text = "Insurance Premium : RM" + ((150).toString())
                        spinnerAge.selectedItemPosition == 5 -> textViewPremium.text = "Insurance Premium : RM" + ((150).toString())
                    }
                }
            }else if(radioButtonMale.isChecked){
                if(checkBoxSmoker.isChecked){

                    when {
                        spinnerAge.selectedItemPosition == 0 -> textViewPremium.text = "Insurance Premium : RM" + 60.toString()
                        spinnerAge.selectedItemPosition == 1 -> textViewPremium.text = "Insurance Premium : RM" + ((70+50+100).toString())
                        spinnerAge.selectedItemPosition == 2 -> textViewPremium.text = "Insurance Premium : RM" + ((90+100+150).toString())
                        spinnerAge.selectedItemPosition == 3 -> textViewPremium.text = "Insurance Premium : RM" + ((120+150+200).toString())
                        spinnerAge.selectedItemPosition == 4 -> textViewPremium.text = "Insurance Premium : RM" + ((150+200+250).toString())
                        spinnerAge.selectedItemPosition == 5 -> textViewPremium.text = "Insurance Premium : RM" + ((150+200+300).toString())
                    }
                }else {
                    when {
                        spinnerAge.selectedItemPosition == 0 -> textViewPremium.text = "Insurance Premium : RM" + (60.toString())
                        spinnerAge.selectedItemPosition == 1 -> textViewPremium.text = "Insurance Premium : RM" + ((70+50).toString())
                        spinnerAge.selectedItemPosition == 2 -> textViewPremium.text = "Insurance Premium : RM" + ((90+100).toString())
                        spinnerAge.selectedItemPosition == 3 -> textViewPremium.text = "Insurance Premium : RM" + ((120+150).toString())
                        spinnerAge.selectedItemPosition == 4 -> textViewPremium.text = "Insurance Premium : RM" + ((150+200).toString())
                        spinnerAge.selectedItemPosition == 5 -> textViewPremium.text = "Insurance Premium : RM" + ((150+200).toString())
                    }
                }
            }


        }

        reset.setOnClickListener{

            spinnerAge.setSelection(0)
            radioButtonFemale.isChecked = false
            radioButtonMale.isChecked = false
            textViewPremium.text = "Insurance Premium :"
            checkBoxSmoker.isChecked = false


        }



    }
}
