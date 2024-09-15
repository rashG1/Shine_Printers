//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          SharedQueue row=new SharedQueue("myShare");
          Computer computer1=new Computer("computer1",row);
          Computer computer2=new Computer("computer2",row);
          Thread txt1=new Thread(new TextFile("tem.txt",computer1));
          Thread txt2=new Thread(new TextFile("temara.txt",computer2));
          Thread txt3=new Thread(new TextFile("temi.txt",computer1));
          Thread txt4=new Thread(new TextFile("temen.txt",computer1));
          txt1.start();
          txt2.start();
          txt3.start();
          txt4.start();

        Thread paper1=new Thread(new Printer("Printer1",row));
        Thread paper2=new Thread(new Printer("Printer2",row));
        paper1.start();
        paper2.start();
        try {
            paper1.join();
            paper2.join();
        }catch (InterruptedException e){
            System.out.println("Hang on");
        }


    }
}