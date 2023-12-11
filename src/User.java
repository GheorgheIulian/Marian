public class User {

    String state;

    public User(String stete){

        this.state = state;


    }

    public String getUserState(){
        return state;
    }
    public void setUserState (String state){
        this.state = state;
    }
    public void changeUserState(User user){

        if(getUserState() == "inactive"){
            user.state = "active";
        }

    }
}
