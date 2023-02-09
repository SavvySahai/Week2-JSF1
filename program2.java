class App {
    App() {
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class program2 {
    program2() {
        super(); //used to call constructor of base class
        System.out.println("Constructor of Test2");
    }
    public static void main(String[] args) {
        new program2();
    }
}
