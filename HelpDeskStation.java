public class HelpDeskStation {
    private final int stationNum;

    public HelpDeskStation(int stationNum)
    {
        this.stationNum = stationNum;
    }
    public void serveCustomer (int Qnum){
        System.out.println("Helpdesk Station" +stationNum+" serving customer with queue number "+ Qnum);
    }
}
