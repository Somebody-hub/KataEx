package PP_3_1_1_Spring_Boot.KataEx.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String FirstName;

    private String LastName;

    private int Age;

    private String Email;

    private boolean deleted;

    public User() {
        this.deleted = false;
    }

    public User(String FirstName, String LastName, int Age, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Email = Email;
        this.deleted = false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setFirstName(String firstName) { this.FirstName = firstName; }

    public String getFirstName() {
        return FirstName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public String getLastName() { return LastName; }

    public void setLastName(String lastName) { LastName = lastName; }


    @Override
    public String toString() {
        return "id = " + this.id
                + "\n" + "FirstName = " + this.FirstName
                + "\n" + "LastName = " + this.LastName
                + "\n" + "Age = " + this.Age
                + "\n" + "Email " + this.Email
                + "\n" + "deleted" + this.deleted;
    }
}
