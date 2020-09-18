package mx.tecnm.misantla.iscapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables inmutable
        //  val

        //variables mutables
        // var

        btnVerificar.setOnClickListener {

            val anio = edtEntrada.text.toString().toInt()

            val generacion = when (anio){


                in 1930..1948 ->{
                    "Silent Generation"
                }
                in 1949..1968 ->{
                    "Baby Boom"
                }
                in 1969..1980 ->{
                    "Generation X"
                }
                in 1981..1993 ->{
                    "Generation Y"
                }
                in 1994..2010 ->{
                    "Generation Z"
                }
                else -> {
                    "Generation XXX"
                }

            }
            tvResultado.setText(generacion)





           /* if (anio >= 1930 &&  anio <= 1948){
                tvResultado.text =" Silent Generation"
            }else{
                if(anio >= 1949 &&  anio <= 1968){
                    tvResultado.text =" Baby Boom"
                }else{
                    if(anio >= 1969 &&  anio <= 1980){
                        tvResultado.text =" Generation X"
                }else{
                        if(anio >= 1981 &&  anio <= 1993){
                            tvResultado.text =" Generation Y"
                    }else{
                            if(anio >= 1994 &&  anio <= 2010){
                                tvResultado.text =" Generation Z"
                        }
                    }
                }
            }

        } */




    }
}
}