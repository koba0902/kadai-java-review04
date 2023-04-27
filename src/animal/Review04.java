package animal;

public class Review04 {
    public static void main(String[] args) {
        human tanaka = new human("田中 太郎", 25, "電車");
        human suzuki = new human("鈴木 次郎", 30, "野球");
        human sato = new human("佐藤 花子", 20, "映画");

        tanaka.say();
        tanaka.think();

        suzuki.say();
        suzuki.think();

        sato.say();
        sato.think();
    }
}
