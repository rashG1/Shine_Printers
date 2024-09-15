public class Printer implements  Runnable{
    private String name;
    private SharedQueue queue;
    public Printer(String name,SharedQueue queue){
        this.name=name;
        this.queue=queue;
    }
    public  void run() {

        try {
            while (true){
                this.queue.remove( );
            }
        }catch (InterruptedException ex){
            System.out.println("kill");
        }


    }
}
