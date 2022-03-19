package mx.tecnm.tepic.ladm_u2_p1_coposdenieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Lienzo (p : MainActivity) : View(p) {

    var copo =
        Figura(150f, 150f, 4)
    var copomediano =
       Figura(150f, 150f, 6)
    var copogrande =
       Figura(150f, 150f, 10)


    val corutina = GlobalScope.launch {
        while (true){
           p.runOnUiThread(){
                copo.nieve(width,height)
                invalidate()
            }
            delay(130L)



        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var paint = Paint()
        c.drawColor(Color.rgb(45,176,238))



        //--------------------- pasto -----------------------
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(26,124,26)
        c.drawRect(0f,900f,1080f,1928f,paint)
        //-------------------- arbol --------------------------
        paint.color = Color.rgb(124,80,26)
        c.drawRect(140f,1000f,190f,1200f,paint)
        paint.color = Color.rgb(17,201,27)
        c.drawCircle(100f,1000f,60f,paint)
        c.drawCircle(120f,935f,60f,paint)
        c.drawCircle(200f,935f,60f,paint)
        c.drawCircle(200f,1000f,60f,paint)
        // ----------------- casa -------------------------
        paint.style = Paint.Style.FILL
        paint.color = Color.GRAY
        c.drawRect(900f,900f,400f,1200f,paint)


        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        c.drawRect(550f,950f,450f,1030f,paint)

        paint.color = Color.BLUE
        c.drawRect(850f,970f,700f,1200f,paint)

        //------------------------- Copos --------------------------//
        paint.color = Color.WHITE
        copo.pintar(c,paint)
        copomediano.pintar(c,paint)
        copogrande.pintar(c,paint)

    }



}