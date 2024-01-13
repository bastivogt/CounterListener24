package sevo;

public interface CounterListener {
    void counterStart(Counter sender);
    void counterChange(Counter sender);
    void counterFinish(Counter sender);
}
