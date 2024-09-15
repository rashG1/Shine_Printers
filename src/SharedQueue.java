import java.util.Vector;

public class SharedQueue {
    private Vector<TextFile>queue=new Vector<TextFile> ();
    private String name;

    public SharedQueue(String name) {
        this.name = name;
    }
    public synchronized void add(TextFile textFile) throws InterruptedException{
        while (queue.size()>=5){
           this.wait();
        }
        this.queue.add(textFile);
        System.out.println("I sugget to print  by "+textFile.getComputer().getName());
        notifyAll();
    }
    public  synchronized void remove() throws InterruptedException{
        while (queue.isEmpty()){
            this.wait();
        }
        this.queue.remove(0);
        System.out.println("print the paper ");
        notifyAll();
    }

}
