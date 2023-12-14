public class CentralizeQ {
    private static CentralizeQ instance;
    private int currentQNum;

    private CentralizeQ(){
        currentQNum = 0;
    }

    public static CentralizeQ getInstance(){
        if (instance == null){
            instance = new CentralizeQ();
        }
        return instance;
    }
    public synchronized int getNextQNum(){
        currentQNum++;
        return currentQNum;
    }
    public synchronized void resetQNum(int newNum){
        if(newNum < 0){
            throw new IllegalArgumentException("Queue number cannot be negative");
        }
        currentQNum = newNum;
    }

    public int getCurrentQNum() {
        return currentQNum;
    }
}
