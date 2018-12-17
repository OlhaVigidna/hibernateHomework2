package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "passport_table")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String series;
    String number;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    User user;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
