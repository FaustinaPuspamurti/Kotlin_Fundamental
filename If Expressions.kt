fun main (){
    val kkm =  70
    val nilai = 60
    val kata = "Nilai Kamu "
    val school : String
    school = if (kkm <=70) {
        " Silahkan ikut remidial"
    } else if (nilai == kkm){
        " Tuntas"
    } else {
        " Selamat Ya!"
    }
    print(kata+nilai+school)
}
