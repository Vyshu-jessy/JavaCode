class Counter{
    int count=0;
    public synchronized void increment(){
        count++;
    }

}
public class ThreadMutation{
    public static void main(String[] args){
        Counter c=new Counter();
        Runnable a=new Runnable(){
            @Override
            public void run(){
            for(int i=0;i<1000;i++){
                c.increment();
            
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }};
    Runnable b=new Runnable(){
        @Override
        public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }};
    Thread t1=new Thread(a);
    Thread t2=new Thread(b);
    t1.start();
    t2.start();
    try{t1.join();
    t2.join();}
    catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println(c.count);
}}