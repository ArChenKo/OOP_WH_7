package observer;

public class Specialist implements Observer{

    private String name;

    private String jobTitle;
    private int salary = 90000;

    public Specialist(String name,String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)){
            System.out.printf("Специалист: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return true;
        }
        else{
            System.out.printf("Специалист: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return false;
        }
    }
}
