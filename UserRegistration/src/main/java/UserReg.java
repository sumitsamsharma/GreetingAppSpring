import java.util.regex.Pattern;

public class UserReg {
    @FunctionalInterface
    interface check {
        boolean Valid(String str);
    }

    static boolean happy = false;

    public static boolean first(String f_name) throws CustomExceptions {
        check checkFirst = (fName) -> Pattern.matches("[A-Z]{1}[a-z]{2,}", f_name);
        if (checkFirst.Valid(f_name)) {
            return true;
        } else {
            throw new CustomExceptions("First name unexpected");
        }
    }

    public static boolean last(String l_name) throws CustomExceptions {
        check checkLast = (Name) -> Pattern.matches("^[A-Z]{1}[a-z]{2,}$", Name);
        if (checkLast.Valid(l_name))
            return true;
        else
            throw new CustomExceptions("Last name unexpected");

    }

    public static boolean email(String mail) throws CustomExceptions {
        check checkMail = (Mail) -> Pattern.matches("^[_A-Za-z0-9-+&*-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-+&*-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2})*$", Mail);
        if (checkMail.Valid(mail))
            return true;
        else
            throw new CustomExceptions("Email unexpected");
    }

    public static boolean mobile(String phone) throws CustomExceptions {
        check checkMobile = (ph) -> Pattern.matches("[0-9]{2}\\s{1}[1-9]{1}[0-9]{9}", ph);
        if (checkMobile.Valid(phone))
            return true;
        else
            throw new CustomExceptions("Mobile number unexpected");

    }

    public static boolean password(String pass) throws CustomExceptions {

        check checkPassword = (P) -> Pattern.matches("^(?=.*\\d)" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@%$^=+&])" + "(?=\\S+$).{8,}$", P);
        if (checkPassword.Valid(pass))
            return true;
        else
            throw new CustomExceptions("Password unexpected");
    }

    public static String isHappy(String message) {
        check checkMood = msg -> msg.contains("sad");
        if (checkMood.Valid(message))
            return "Sad";
        else
            return "Happy";
    }
}
