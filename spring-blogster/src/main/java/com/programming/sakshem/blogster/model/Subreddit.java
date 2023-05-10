package com.programming.sakshem.blogster.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// import jakarta.persistence.*;
import javax.persistence.*;
import java.time.Instant;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    // @OneToMany(fetch = FetchType.LAZY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subreddit") // changed
    private List<Post> posts;
    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId", referencedColumnName = "userId") // changed
    private User user;

    @Override
    public String toString() {
        return "Subreddit [id=" + id + ", name=" + name + ", description=" + description + ", posts=" + posts
                + ", createdDate=" + createdDate + ", user=" + user + "]";
    }

}
