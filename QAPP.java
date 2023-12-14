public class QAPP {
    public static void main(String[] args) {
        CentralizeQ queue = CentralizeQ.getInstance();

        int qNum = queue.getNextQNum();
        System.out.println("Visitor received queue number: "+ qNum);

        OnlineMonitoring monitor = new OnlineMonitoring();
        monitor.displayCurrentQNum(queue.getCurrentQNum());

        HelpDeskStation station1 = new HelpDeskStation(1);
        station1.serveCustomer(qNum);

        queue.resetQNum(10);
        System.out.println("Queue number reset to: "+queue.getCurrentQNum());

        HelpDeskStation station2 = new HelpDeskStation(2);
        qNum = queue.getNextQNum();
        station2.serveCustomer(qNum);

    }
}