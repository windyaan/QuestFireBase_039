package com.example.myapplication.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.MahasiswaApplications
import com.example.myapplication.ui.home.viewmodel.HomeViewModel
import com.example.myapplication.ui.home.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            InsertViewModel(
                mahasiswaApp().container.repositoryMhs
            )
            HomeViewModel(
                mahasiswaApp().container.Repository
            )
        }
    }
}

fun CreationExtras.mahasiswaApp(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)