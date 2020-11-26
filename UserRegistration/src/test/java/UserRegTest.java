import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegTest {

    @Test
    public void testFirstName() {
        try {
            assertTrue(UserReg.first("Sharma"));
        } catch (Exception e) {
            System.out.println("Invalid format: " + e);
        }

    }

    @Test
    public void testLastName() {
        try {
            assertTrue(UserReg.last("Sharma"));
        } catch (Exception e) {
            System.out.println("Invalid format: " + e);
        }
    }

    @Test
    public void testEmail() {
        try {
            assertTrue(UserReg.email("Sharma@gmail.com"));
        } catch (Exception e) {
            System.out.println("Invalid format: " + e);
        }

    }

    @Test
    public void testMobile() {
        try {
            assertTrue(UserReg.mobile("91 8123614499"));
        } catch (Exception e) {
            System.out.println("Invalid format: " + e);
        }

    }

    @Test
    public void testPassword() {
        try {
            assertTrue(UserReg.password("Qwerty123!@1w"));
        } catch (Exception e) {
            System.out.println("Invalid format: " + e);
        }

    }

    public void givenString_whenEntered_shouldReturnSad() {
        assertEquals("sad", UserReg.isHappy("Happy and not sad"));
    }

}