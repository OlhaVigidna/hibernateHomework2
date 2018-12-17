package model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"emails"})
@EqualsAndHashCode
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Email> emails = new ArrayList<>();

    public Password(String value) {
        this.value = value;
    }

    public Password(String value, List<Email> emails) {
        this.value = value;
        this.emails = emails;
    }
}
