interface olaCustomer{
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancetCab();
    void addMoneytoWaltet();
    void raiseTicket();
    void signup();
    void signin();
    }
    interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    }
    interface olaOwner{
        void getDriverRecords();
        void getReportByDriverID();
        void getReportByRegion();
        void getTotalRevenue();
        void changeDriverStatus();
        void addDriver();
        void removeDriver();
    }
public class Sampleinterface implements olaCustomer,olaDriver,olaOwner {
    public static void main(String args[]){

    }
}
