package movies.Rishabh.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data //for handling getter setter for each field
@AllArgsConstructor //for making construstors to take this parameters
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String trailerLink;
    private String poster;
    private String releaseDate;
    private List<String> geners;
    private List<String> backdrops;
    @DocumentReference //for maintaining one to many relationships
    private List<Review> reviewIds;
}
