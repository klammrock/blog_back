package name.klamm.back.posts

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts")
class PostsController constructor(
    private val postsService: PostsService,
) {
    @GetMapping()
    fun posts(): List<Post> {
        return postsService.posts()
    }
}