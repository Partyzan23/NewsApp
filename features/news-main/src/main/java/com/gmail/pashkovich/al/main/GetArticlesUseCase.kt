package com.gmail.pashkovich.al.main

import com.gmail.pashkovich.al.news.data.ArticlesRepository
import com.gmail.pashkovich.al.news.data.models.Article
import kotlinx.coroutines.flow.Flow

class GetArticlesUseCase(private val repository: ArticlesRepository) {

    operator suspend fun invoke(): Flow<Article> {
        return repository.getAll()

    }
}