package jonghoon.multiThread.future.data;

public class FutureData implements Data{
    private RealData realData = null;
    private boolean ready = false;
    public synchronized void setRealData(RealData realData) {
        if (ready) {
            return;
        }
        this.realData = realData;
        this.ready = true;
        System.out.println("realData: " + realData);
        notifyAll();;
    }
    @Override
    public synchronized String getContent() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("getContent: " + realData.getContent());
        return realData.getContent();
    }
}
