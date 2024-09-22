package model;

public class User {
    private String name;
    private String password;
    private String email;
    private User(Builder builder){
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public static class Builder{
        private String name;
        private String password;
        private String email;
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setPasword(String password){
            this.password = password;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
