package com.github.holidaybear.countryflags

import android.content.Context
import java.util.Locale

fun Context.getCountryFlagResId(countryCode: String): Int {
    val countryLetter: String
    var name = "flag"

    if (countryCode.length == 2) {  // ISO 3166-1
        countryLetter = countryCode.toUpperCase(Locale.getDefault())
        countryLetter.forEach { char ->
            name += "_${Integer.toHexString(char.toInt() - 0x41 + 0x1F1E6)}"
        }
    } else {  // subdivisions
        countryLetter = countryCode.replace("-", "").toLowerCase(Locale.getDefault())
        name += "_${Integer.toHexString(0x1F3F4)}"
        countryLetter.forEach { char ->
            name += "_${Integer.toHexString(char.toInt() - 0x61 + 0xE0061)}"
        }
        name += "_${Integer.toHexString(0xE007F)}"
    }
    return this.resources.getIdentifier(name, "drawable", this.packageName)
}