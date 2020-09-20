package ifm.firstrestapi.firstrestapi.model;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
@Table
public class Message {

    //@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    //@RequiredArgsConstructor
    //@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)

    @PrimaryKey
    private String id;

    private String sentence;

}
