package com.example.widgetstoggle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.widgetstoggle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	val listener by lazy {
		CompoundButton.OnCheckedChangeListener { btnToggle, chk ->
			if(chk){
				when(btnToggle.id){
					R.id.btnToggle1 -> Log.d("toggle", "toggle1이 켜졌습니다")
					R.id.btnToggle2 -> Log.d("toggle", "toggle2이 켜졌습니다")
					R.id.btnToggle3 -> Log.d("toggle", "toggle3이 켜졌습니다")
				}
			}else{
				when(btnToggle.id){
					R.id.btnToggle1 -> Log.d("toggle", "toggle1이 꺼졌습니다")
					R.id.btnToggle2 -> Log.d("toggle", "toggle2이 꺼졌습니다")
					R.id.btnToggle3 -> Log.d("toggle", "toggle3이 꺼졌습니다")
				}
			}
		}
	}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		binding.btnToggle1.setOnCheckedChangeListener(listener)
		binding.btnToggle2.setOnCheckedChangeListener(listener)
		binding.btnToggle3.setOnCheckedChangeListener(listener)
	}
}