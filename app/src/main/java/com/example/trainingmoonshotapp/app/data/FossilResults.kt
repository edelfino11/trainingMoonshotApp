package com.example.trainingmoonshotapp.app.data

data class FossilResult(
    val results: List<FossilBE>
)

data class FossilBE(
    val name: String,
    val url: String,
    val image_url: String,
    val fossil_group: String,
    val interactable: Boolean,
    val sell: Int,
    val hha_base: Int,
    val width: Int,
    val length: Int,
    val colors: MutableList<String>
)

