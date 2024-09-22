package model;

public class User extends BaseClass{
    private String name;
    private String password;
    private String email;
    private User(UserBuilder builder){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String email;
        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public UserBuilder setPasword(String password){
            this.password = password;
            return this;
        }
        public UserBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
