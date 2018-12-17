package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nick;
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    User user;
    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "emails"
    )
    List<Password> passwords = new ArrayList<>();

    public Email(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Email{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
