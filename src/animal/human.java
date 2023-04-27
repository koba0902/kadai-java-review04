package animal;

public class human extends animal implements Thinkable {
    private String hobby;

    public human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
