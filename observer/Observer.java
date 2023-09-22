package observer;

public interface Observer {

    boolean receiveOffer(String companyName, String jobTitle, int salary);
}
