public class User {
    private String name = "No Value"; //When not empty user mentioned, it will show "No Value"
    private String type;
    private String membership; //(If not mentioned inside of User)When not empty user mentioned, it will show "null"
    public User() {
        set_type("Unknown"); //When not empty user mentioned, it will show "Unknown"
    }
    public User(String name, String membership) {
        set_name(name);
        this.membership = membership;
    }
    void set_name(String name){ //This is needed to give a value
        // System.out.print("1"); can be used but it will print 1 x times(x = number of startups);

        this.name = name; //_name can also be used instead of this.name
    }

    String get_name() { //This is needed to get the value
        return name;
    }
    void set_membership(String membership) {
        this.membership = membership;
    }
    void set_type(String type){
        this.type = type;
    }
    String get_type(){
        return type;
    }
    void set_membership(Type type) {
        this.type=type.name();

    }
    public enum Type {
        TechBased, Green, Market;
    }

    String get_membership() {
        return membership;
    }
}