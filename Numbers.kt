fun main(){
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    val p = panjang.toDouble()
    val l = lebar
    val t = tinggi.toDouble()
    println("Volume dari balok yang mempunyai panjang $p, lebar $l, dan tinggi $t ini adalah ${hitungVolume(p, l, t)}")
}
fun hitungVolume(p : Double, l : Double, t : Double) : Float
{
    val v = p * l * t
    return v.toFloat()
}