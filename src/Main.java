import sevo.Counter;
import sevo.CounterListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Counter counter = new Counter();

        counter.addCounterListener(new CounterListener() {
            @Override
            public void counterStart(Counter sender) {
                System.out.println("counterStart count: " + sender.getCount());
            }

            @Override
            public void counterChange(Counter sender) {
                System.out.println("counterChange count: " + sender.getCount());
            }

            @Override
            public void counterFinish(Counter sender) {
                System.out.println("counterFinish count: " + sender.getCount());
            }
        });

        counter.run();
    }
}