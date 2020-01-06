package com.github.holidaybear.countryflags.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.holidaybear.countryflags.getCountryFlagResId
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_1.setImageResource(getCountryFlagResId("US"))
        image_2.setImageResource(getCountryFlagResId("GB-SCT"))
    }
}
