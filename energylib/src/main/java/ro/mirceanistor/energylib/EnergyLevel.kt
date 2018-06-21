package ro.mirceanistor.energylib

import android.content.Context

object EnergyLevel {

    fun getLevel(context: Context) = context.getString(R.string.energy_level)

}