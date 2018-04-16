package pl.szymonchowanic.SampleRestWithSwaggerConfig.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Setter
@Getter
@EqualsAndHashCode
@ToString
@Embeddable
public class Adress {

    @NonNull
    private String city;

    @NonNull
    private String postcode;

    @NonNull
    @Enumerated(EnumType.STRING)
    private AdressType adressType;
}
