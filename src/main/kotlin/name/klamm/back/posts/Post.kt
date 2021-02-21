package name.klamm.back.posts

import javax.persistence.*

@Entity
@Table(name = "posts")
data class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1,

    // TODO: No default constructor for entity
    val text: String = ""
)
