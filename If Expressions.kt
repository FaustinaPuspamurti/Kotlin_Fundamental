fun main (){
    val openHours =  75
    val now = 60
    val kata = "Nilai Kamu "
    val school : String
    school = if (now < 70) {
        " Silahkan ikut remidial"
    } else if (now == openHours){
        " Tuntas"
    } else {
        " Selamat Ya!"
    }
    print(kata+now+school)
}
