package name.klamm.back.posts

import org.springframework.stereotype.Service

@Service
class PostsService constructor(
    private val postsRepository: PostsRepository,
) {
    fun posts() : List<Post> {
        return postsRepository.findAllByOrderByIdAsc()
    }
}
