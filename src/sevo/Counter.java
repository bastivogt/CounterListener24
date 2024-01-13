package sevo;

public class Counter {

    private int start;
    private int end;
    private int step;
    private int count;

    protected CounterListener counterListener;



    public Counter(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.count = start;
    }

    public Counter() {
        this(0, 10, 1);
    }

    public int getCount() {
        return this.count;
    }

    public void addCounterListener(CounterListener listener) {
        this.counterListener = listener;
    }

    public void removeCounterListener() {
        this.counterListener = null;
    }

    public void run() {
        this.count = this.start;
        if(this.counterListener != null)
            this.counterListener.counterStart(this);
        for(; this.count < this.end; this.count += this.step) {
            if(this.counterListener != null)
                this.counterListener.counterChange(this);
        }
        if(counterListener != null)
            this.counterListener.counterFinish(this);
    }

    public void reset(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.count = this.start;
    }




}
