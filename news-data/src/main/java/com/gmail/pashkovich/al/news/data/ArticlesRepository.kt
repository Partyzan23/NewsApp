package com.gmail.pashkovich.al.news.data

import com.gmail.pashkovich.al.news.data.models.Article
import com.gmail.pashkovich.al.news.database.NewsDatabase
import com.gmail.pashkovich.al.newsapi.NewsApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ArticlesRepository(
    private val database: NewsDatabase,
    private val api: NewsApi,
) {

    fun getAll(): RequestResult<Flow<List<Article>>> {
        return RequestResult.InProgress(
            database.articlesDao
                .getAll()
                .map { articles -> articles.map { it.toArticle() } }
        )
    }

    suspend fun search(query: String): Flow<Article> {
        api.everything()
        TODO("Not implemented")
    }
}