package pl.szymonchowanic.SampleRestWithSwaggerConfig.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Table(name = "user")
@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;

    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    @Embedded
    private List<Adress> adresses;

public User(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}


}
