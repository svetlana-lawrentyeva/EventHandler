import events.impl.ProducerImpl;

/**
 * Created with IntelliJ IDEA.
 * User: nau
 * Date: 1/17/15
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;++i){
            Thread thread = new Thread(new ProducerImpl(i));
            thread.start();
        }
    }
}
