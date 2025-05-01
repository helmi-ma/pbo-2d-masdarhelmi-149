class Admin {
    private final String username = "HELMI";
    private final String PW = "149";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(PW);
    }
}