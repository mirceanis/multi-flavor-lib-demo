package ro.mirceanistor.matterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ro.mirceanistor.matterlib.MaterialState
import ro.mirceanistor.energylib.EnergyLevel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        material_state.text = MaterialState.getState(this)
        energy_level.text = EnergyLevel.getLevel(this)
    }
}
