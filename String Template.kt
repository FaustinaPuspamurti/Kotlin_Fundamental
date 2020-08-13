fun main(){
    val name = "Kotlin"
    val age = 4
    val version = "1.3.70"

    val text ="""
        Nama saya $name
        Saya Berumur $age
        Saat ini saya sudah mencapai versi $version
    """.trimIndent()
    print(text)
}