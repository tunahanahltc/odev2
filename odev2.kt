package com.example.invio

fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiUcreti = 20
    val saatPerGun = 8
    val normalSaat = 160

    val toplamSaat = gunSayisi * saatPerGun

    return if (toplamSaat <= normalSaat) {
        toplamSaat * saatlikUcret
    } else {
        val mesaiSaatleri = toplamSaat - normalSaat
        (normalSaat * saatlikUcret) + (mesaiSaatleri * mesaiUcreti)
    }
}

fun kotaUcreti(kotaGB: Int): Int {
    val temelKota = 50
    val temelUcret = 100
    val asimUcretPerGB = 4

    return if (kotaGB <= temelKota) {
        temelUcret
    } else {
        temelUcret + (kotaGB-temelKota)*asimUcretPerGB
    }
}
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun rectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

fun factorial(number: Int): Long {
    var result = 1L
    for (i in 1..number) {
        result *= i
    }
    return result
}

fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}
// Örnek kullanım:
fun main() {
    println("İç açılar toplamı (5 kenar): ${icAciToplami(5)} derece")
    println("Maaş (22 gün çalıştı): ${maasHesapla(22)} ₺")
    println("İnternet ücreti (55 GB): ${kotaUcreti(55)} ₺")
    println("25 derece Fahrenheit karşılığı: ${celsiusToFahrenheit(25.0)}")
    println("Dikdörtgenin çevresi (5, 10): ${rectanglePerimeter(5.0, 10.0)}")
    println("5! faktöriyeli: ${factorial(5)}")
    println("Kelimedeki 'a' harfi sayısı: ${countLetterA("Ankara")}")
}
