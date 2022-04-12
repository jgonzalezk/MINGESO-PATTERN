public class IOSAppFactory implements AbstractAppFactory {
    @Override
    public Calendar createCalendar() {
        return new CalendarIOS("Calendario iOS", "1.0.0.i");
    }
    @Override
    public Clock createClock() {
        return new ClockIOS("Reloj iOS", "1.0.0.i", "GTM-4");
    }
    @Override
    public Phone createPhone() {
        return new PhoneIOS("Telefono iOS", "1.0.0.i");
    }
}
