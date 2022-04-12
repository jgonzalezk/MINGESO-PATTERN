public class App {
    private Calendar calendar;
    private Clock clock;
    private Phone phone;

    public App(AbstractAppFactory factory){
        calendar = factory.createCalendar();
        clock = factory.createClock();
        phone = factory.createPhone();
    }

    public void printInfo(){
        System.out.println("\nCALENDARIO: " + calendar.getNombre());
        System.out.println("\nRELOJ: " + clock.getNombre());
        System.out.println("\nTELEFONO: " + phone.getNombre());
    }
}
