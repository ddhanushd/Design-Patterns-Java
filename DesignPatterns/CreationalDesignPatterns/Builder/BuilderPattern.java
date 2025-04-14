package DesignPatterns.CreationalDesignPatterns.Builder;

final class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    public User(UserBuilder builder){
        this.userId=builder.userId;
        this.userName=builder.userName;
        this.emailId=builder.emailId;
    }
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    // inner class to create objects
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {
        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
public class BuilderPattern {
    public static void main(String[] args){
        User user=new User.UserBuilder()
                .setUserId("RKO123")
                .setUserName("Randy")
                .setEmailId("randy@gmail.com")
                .build();
        System.out.println(user);

        User user1=User.UserBuilder.builder()
                .setUserId("KO456")
                .setUserName("Kevin Owens")
                .setEmailId("kevin@gmail.com")
                .build();
        System.out.println(user1);
    }
}
