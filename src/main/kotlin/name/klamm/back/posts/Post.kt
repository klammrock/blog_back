package name.klamm.back.posts

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "posts")
data class Post(
    @Id
    val name: String = "",

    val title: String = "",
    // TODO: No default constructor for entity
    val text: String = "",

    @Column(name = "created_at", nullable = false, insertable = false)
    var createdAt: LocalDateTime? = null,

    @Column(name = "updated_at", nullable = false, insertable = false)
    var updatedAt: LocalDateTime? = null
)
