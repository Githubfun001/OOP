public class UserAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        return username.equals("user") && password.equals("123456");
    }

    @Override
    public void logout() {
        System.out.println("Logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(!oldPassword.equals(newPassword))
        {
            System.out.println("Setting new password for User");
            return true;
        }
        return false;
    }
}

