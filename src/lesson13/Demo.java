package lesson13;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        //сохранение юзера+
        //сохранение того же юзера+
        //когда нет места в массиве+
        //когда сохраняем null+

        UserRepository userRepository = new UserRepository();

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //сохранение юзера
        User user = new User(1001, "Ann", "1w21212");
        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //сохранение того же юзера
        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //когда нет места в массиве
        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "Ann", "1w21212");
            System.out.println(userRepository.save(user1));
            n--;
        }
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //когда сохраняем null
        userRepository.save(null);


        //test update

        //обновление бзера
        user = new User(1001, "Ann", "eretertert");
        userRepository.update(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //обновление бзера+
        //когда нет юзера на обновление+
        //когда обновляем null+

        //когда нет юзера на обновление
        user = new User(9999, "Ann", "eretertert");
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //когда обновляем null
        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

    }
}
