package Jose.iraheta.numerochepelui

class Calcular {
    fun calcular(num:Int):String{

        val resul = num%2


        val msg:String
        if(resul == 0){
            msg = "Es par"

        }

        else{
            msg = "Es inpar"
        }

        return msg

    }
}