package name.klamm.back.posts

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostsRepository : JpaRepository<Post, Long> {
    fun findAllByOrderByIdAsc(): List<Post>
}
