package smapledemocom.example.sampledemo;

public class person {
    String name;
    int age;
    String message;

    public person(String name, int age, String message){
        this.name = name;
        this.age = age;
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
