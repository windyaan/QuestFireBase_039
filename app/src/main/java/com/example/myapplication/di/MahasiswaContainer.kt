package com.example.myapplication.di

import com.example.myapplication.repository.NetworkRepositoryMhs
import com.example.myapplication.repository.RepositoryMhs
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer{
    val repositoryMhs: RepositoryMhs
}

class MahasiswaContainer : AppContainer{
    private val firestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    override val Repository: RepositoryMhs by lazy {
        NetworkRepositoryMhs(firestore)
    }
}