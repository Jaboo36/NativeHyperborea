package names

object YakutNames {
    fun generateName(isFemale: Boolean) = if (isFemale) femaleNames.random() else maleNames.random()

    private val femaleNames = setOf(
        "Ayta'da",
        "Kaskilaana",
        "Kunney",
        "Lur",
        "Nariyanaa",
        "Nyur'da",
        "Saskulaana",
        "Saya'da",
        "Sayii'da",
        "Tuskulaana",
        "Uruy'da",
        "Tuya'da"
    )

    private val maleNames = setOf(
        "Ayaal-xu",
        "Aysen-xu",
        "Aytalanu",
        "Elleyanu",
        "Karak-xu",
        "Kaskil",
        "Michilanu",
        "Nyurganu",
        "Sirk-xu",
        "Tibur",
        "Uygulaan",
        "Yodin"
    )
}