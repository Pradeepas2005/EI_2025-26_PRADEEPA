public class Form {
    private String name = "";
    private String email = "";
    private String address = "";

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printForm() {
        System.out.println("Form Data:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    public FormState save() {
        return new FormState(name, email, address);
    }

    public void restore(FormState state) {
        if (state != null) {
            this.name = state.getName();
            this.email = state.getEmail();
            this.address = state.getAddress();
        }
    }
}
