package tasks

import contributors.*
import retrofit2.Response

fun loadContributorsBlocking(service: GitHubService, req: RequestData) : List<User> {
    return emptyList()
}

fun <T> Response<List<T>>.bodyList(): List<T> {
    return body() ?: emptyList()
}