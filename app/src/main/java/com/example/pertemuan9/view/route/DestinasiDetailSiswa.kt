package com.example.pertemuan9.view.route

import com.example.pertemuan9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "IdSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}