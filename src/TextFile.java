public class TextFile implements Runnable {
    String txtname;
    Computer computer;
    public TextFile(String txtname,Computer computer){
        this.txtname=txtname;
        this.computer=computer;
    }
    public void run(){

        try {
            computer.getQueue().add(new TextFile(this.txtname,this.computer));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Computer getComputer() {
        return computer;
    }
}
