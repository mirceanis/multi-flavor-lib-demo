package ro.mirceanistor.matterlib

import android.content.Context
import ro.mirceanistor.energylib.R

object EnergyLevel {

    fun getLevel(context: Context) = context.getString(R.string.energy_level)

}