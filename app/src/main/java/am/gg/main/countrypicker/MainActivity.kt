package am.gg.main.countrypicker

import am.gg.main.countrypicker.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var phoneCode: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.progressButton.enable()

        binding.countryPicker.setOnItemClick {
            phoneCode = it.phoneCode
            binding.numberEt.setText(it.phoneCode)
            binding.numberEt.setSelection(it.phoneCode?.length ?: 0)
        }

        binding.numberEt.setText(binding.countryPicker.selectedCountryCode())
        binding.countryPicker.setPhoneCode("+374")
        phoneCode = binding.countryPicker.selectedCountryCode()

        binding.numberEt.addTextChangedListener { s ->
            if (s!!.length < (phoneCode?.length ?: 0)) {
                binding.numberEt.setText(phoneCode)
                binding.numberEt.setSelection(binding.numberEt.getText().length)
            }
            binding.progressButton.enable()
        }

        //val fragment = MainFragment.newInstance()

        binding.progressButton.setOnClickListener {
            //binding.progressButton.loading()
            //startProgress()

            //fragment.show(supportFragmentManager, fragment::class.java.simpleName)
        }
    }

    private fun startProgress() {
        lifecycleScope.launch(Dispatchers.Main) {
            delay(3000)
            binding.progressButton.disable()
        }
    }
}