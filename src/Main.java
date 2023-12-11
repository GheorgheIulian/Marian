import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User u1 = new User("inactive");
        User u2 = new User("inactive");
        User u3 = new User("inactive");
        List<User>  listaUser = Arrays.asList(u1,u2,u3);
        List<User>  actualizareStare = listaUser.stream()
                .map(user -> {
                        user.setUserState("active");
                        return user;
                })
                .collect(Collectors.toList());

        for (int i = actualizareStare.size()-1; i >= 0; i-- ){

            System.out.println(actualizareStare.get(i).getUserState());

        };


    }
}