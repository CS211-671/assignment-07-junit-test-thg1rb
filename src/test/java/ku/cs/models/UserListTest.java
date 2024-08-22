package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList users;

    @BeforeEach
    void init() {
        users = new UserList();
        users.addUser("Bright", "1234");
        users.addUser("Nest", "5678");
        users.addUser("Aock", "1111");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User exist = users.findUserByUsername("Nest");

        // TODO: assert that UserList found User
        String expected = "Nest";
        String actual = exist.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user
        User exist = users.findUserByUsername("Bright");
        users.changePassword(exist.getUsername(), exist.getPassword(), "0000");

        boolean passwordEqual =  exist.validatePassword("0000");
        assertTrue(passwordEqual);

        // TODO: assert that user can change password
        assertTrue(passwordEqual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User exist = users.login("Bright", "1234");

        // TODO: assert that User object is found
        assertEquals("Bright", exist.getUsername());
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        User exist = users.login("Right", "1234");

        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(exist);
    }

}