package com.programming.sakshem.blogster.model;

// import jakarta.persistence.*;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String postName;
    private String url;
    @Lob
    private String description;
    private Integer voteCount = 0;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subreddit subreddit;
    @Override
    public String toString() {
        return "Post [postId=" + postId + ", postName=" + postName + ", url=" + url + ", description=" + description
                + ", voteCount=" + voteCount + ", userId=" + user.getUserId() + ", createdDate=" + createdDate + ", subredditId="
                + subreddit.getId() + "]";
    }

    
}