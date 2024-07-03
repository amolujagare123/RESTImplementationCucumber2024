package Util.payload.chatServer;

import Util.POJO.chatServer.CreateUserPayLoadPOJO;

import java.util.Arrays;

public class ChatServerPayLoad {


    public static CreateUserPayLoadPOJO getCreateUserObj()
    {
        // Creating an instance of CreateUserPayLoadPOJO
        CreateUserPayLoadPOJO user = new CreateUserPayLoadPOJO();

        // Setting real-time data
        user.setUsername("john_doe");
        user.setPassword("SecurePassword123");
        user.setEmail("john.doe@example.com");
        user.setName("John");
        user.setSurname("Doe");
        user.setChat_nickname("Johnny");

        // Setting department IDs
        user.setDepartments(Arrays.asList(1,2));

        // Setting read-only department IDs
        user.setDepartments_read(Arrays.asList(2));

        // Setting department group IDs
        user.setDepartment_groups(Arrays.asList(1));

        // Setting user group IDs
        user.setUser_groups(Arrays.asList(1));

        return user;
    }

    public static CreateUserPayLoadPOJO getCreateUserObj(String username,String password,String email,String name,String surname,String nickName)
    {
        // Creating an instance of CreateUserPayLoadPOJO
        CreateUserPayLoadPOJO user = new CreateUserPayLoadPOJO();

        // Setting real-time data
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setName(name);
        user.setSurname(surname);
        user.setChat_nickname(nickName);

        // Setting department IDs
        user.setDepartments(Arrays.asList(1,2));

        // Setting read-only department IDs
        user.setDepartments_read(Arrays.asList(2));

        // Setting department group IDs
        user.setDepartment_groups(Arrays.asList(1));

        // Setting user group IDs
        user.setUser_groups(Arrays.asList(1));

        return user;
    }
}
