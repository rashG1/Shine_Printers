public class Computer {
    private String name;
    private SharedQueue queue;
  ;

    public Computer(String name, SharedQueue queue) {
        this.name = name;
        this.queue = queue;

    }

    public String getName() {
        return name;
    }

    public SharedQueue getQueue() {
        return queue;
    }
}
