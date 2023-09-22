package observer;

public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Тестировщик",45000);
        Vacancy vacancy2 = new Vacancy("Менеджер",75000);
        Vacancy vacancy3 = new Vacancy("Аналитик",80000);

        Company google = new Company("Google",  jobAgency, vacancy1);
        Company yandex = new Company("Yandex",  jobAgency, vacancy2);
        Company geekBrains = new Company("GeekBrains",  jobAgency, vacancy3);

        Student student1 = new Student("Виктор", "Тестировщик");
        Worker worker1 = new Worker("Анастасия", "Менеджер");
        Specialist specialist1 = new Specialist ("Добрыня", "Аналитик");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(specialist1);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}
