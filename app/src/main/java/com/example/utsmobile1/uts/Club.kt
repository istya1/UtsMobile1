package com.example.utsmobile1.uts

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val LigaChampions: Int,
    val Ligaeropa: Int,
) {
    val totalTrophy: Int
        get() = epl + fa + efl + LigaChampions + Ligaeropa
}

// extension function recap
fun Club.recap(): String {
    return "$name - Tropi EPL: $epl, Tropi FA: $fa, Tropi EFL: $efl, " +
            "Tropi Liga Champions: $LigaChampions, Tropi liga Eropa: $Ligaeropa, " +
            "Total Tropi : $totalTrophy"
}

