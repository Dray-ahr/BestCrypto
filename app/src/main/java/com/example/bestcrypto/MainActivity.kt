package com.example.bestcrypto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val initialTextViewTranslationY = textView_amount.translationY

/*        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main, menu)
            return super.onCreateOptionsMenu(menu)
        } */
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var priceB: Int = 37232
                var priceE: Int = 2275
                var priceC: Int = 15
                var priceBnb: Int = 341
                textView_amount.text = progress.toString() + "k"
                bitcoinValues.text = "Bitcoin : 37232$"
                ethValues.text = "ETH : 2275$"
                cakeValues.text = "ETH : 15$"
                bnbValues.text = "ETH : 341$"

                //val prices = listOf<Int>(priceB, priceE, priceC, priceBnb)

                /*prices.forEach {
                    if (it >= progress*1000) {
                        bitcoinValues.setVisibility(View.INVISIBLE)
                        ethValues.setVisibility(View.INVISIBLE)
                        cakeValues.setVisibility(View.INVISIBLE)
                        bnbValues.setVisibility(View.INVISIBLE)
                    } else {
                        bitcoinValues.setVisibility(View.VISIBLE)
                        ethValues.setVisibility(View.VISIBLE)
                        cakeValues.setVisibility(View.VISIBLE)
                        bnbValues.setVisibility(View.VISIBLE)
                    }

                }*/

                if (priceB >= progress*1000) {
                    bitcoinValues.setVisibility(View.INVISIBLE)
                } else {
                    bitcoinValues.setVisibility(View.VISIBLE)
                }

                if (priceE >= progress*1000) {
                    ethValues.setVisibility(View.INVISIBLE)
                } else {
                    ethValues.setVisibility(View.VISIBLE)
                }

                if (priceC >= progress*1000) {
                    cakeValues.setVisibility(View.INVISIBLE)
                } else {
                    cakeValues.setVisibility(View.VISIBLE)
                }

                if (priceBnb >= progress*1000) {
                    bnbValues.setVisibility(View.INVISIBLE)
                } else {
                    bnbValues.setVisibility(View.VISIBLE)
                }


/*                val translationDistance = (initialTextViewTranslationY +
                        progress * resources.getDimension(R.dimen.text_anim_step) * -1)
                textView_amount.animate().translationY(translationDistance) */
            }


            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })


        button_validate.setOnClickListener { v ->               //C'est une Lambda
            seekBar.progress = 0
            textView_amount.animate().setDuration(500).rotationBy(360f)
                .translationY(initialTextViewTranslationY)
            textView_amount.pivotX = 0F
            bitcoinValues.text = "Bitcoin : 37232$"
            ethValues.text = "ETH : 2275$"
            cakeValues.text = "ETH : 15$"
            bnbValues.text = "ETH : 341$"
            bitcoinValues.setVisibility(View.VISIBLE)
            ethValues.setVisibility(View.VISIBLE)
            cakeValues.setVisibility(View.VISIBLE)
            bnbValues.setVisibility(View.VISIBLE)


        }
    }
}