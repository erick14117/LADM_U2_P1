package mx.tecnm.tepic.ladm_u2_p1_coposdenieve

import android.graphics.Canvas
import android.graphics.Paint


class Figura {
    var x = 10f
    var y = 10f
    var radio = 0f
    var incX = 5
    var incY = 5


 constructor(x:Float,y:Float,radio:Int) {
     this.x=x.toFloat()
     this.y=y.toFloat()
     this.radio=radio.toFloat()
 }

    fun pintar(c: Canvas, p: Paint){

        for (i in 1..400){
            var cx = Math.random()*2000
            var cy =Math.random()*2000
            c.drawCircle(cx.toFloat(), cy.toFloat(),radio,p)
        }

    }

    fun nieve(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }
}