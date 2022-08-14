package month1.lesson6;

public class Year {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("I deleted");
    }
}
