public class AdminAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("654321");
    }

    @Override
    public void logout() {
        System.out.println("Logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(!oldPassword.equals(newPassword))
        {
            System.out.println("Setting new password for Admin");
            return true;
        }
        return false;
    }
}
