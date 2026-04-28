package org.example.homework3;

public class Password {
    public static void main(String[] args) {
        //для проверки использовала: {"pass", "1badpassword", "mamamoy666z", "pass12345", "pa09qwerty87",  "goodPass1984"}
        String[] passwords = {"pass12345", "pa09qwerty87",  "goodPass1984"};

        for (String password : passwords) {
            boolean goodPass = password.length() > 8
                    && password.charAt(0) != '1'
                    && password.charAt(password.length() - 1) != 'z'
                    && !password.contains("1234")
                    && !password.contains("qwerty");

            System.out.println(String.format("Пароль %s прошел проверку: ", password) + goodPass);
        }
    }
}
