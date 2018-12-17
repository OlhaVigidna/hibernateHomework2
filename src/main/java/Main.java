import model.Email;
import model.Passport;
import model.Password;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure()
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Passport.class)
//                .addAnnotatedClass(Email.class)
//                .addAnnotatedClass(Password.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();


//        User user = new User("vasia");
//        session.save(user);
//        Passport passport = new Passport();
//        System.out.println(user);

//        Passport passport = new Passport("rnl34", "23445");
//        passport.setUser(new User("vasya"));
//        session.save(passport);

//        User user = session.find(User.class, 1);
//        Email email = new Email("iren.org");
//        email.setUser(user);
//        session.save(email);





        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
