package com.programming.sakshem.blogster.mapper;

import com.programming.sakshem.blogster.dto.SubredditDto;
import com.programming.sakshem.blogster.dto.SubredditDto.SubredditDtoBuilder;
import com.programming.sakshem.blogster.model.Subreddit;
import com.programming.sakshem.blogster.model.Subreddit.SubredditBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-10T14:53:12+0530",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class SubredditMapperImpl implements SubredditMapper {

    @Override
    public SubredditDto mapSubredditToDto(Subreddit subreddit) {
        if ( subreddit == null ) {
            return null;
        }

        SubredditDtoBuilder subredditDto = SubredditDto.builder();

        subredditDto.description( subreddit.getDescription() );
        subredditDto.id( subreddit.getId() );
        subredditDto.name( subreddit.getName() );

        subredditDto.numberOfPosts( mapPosts(subreddit.getPosts()) );

        return subredditDto.build();
    }

    @Override
    public Subreddit mapDtoToSubreddit(SubredditDto subredditDto) {
        if ( subredditDto == null ) {
            return null;
        }

        SubredditBuilder subreddit = Subreddit.builder();

        subreddit.description( subredditDto.getDescription() );
        subreddit.id( subredditDto.getId() );
        subreddit.name( subredditDto.getName() );

        return subreddit.build();
    }
}
