public class AndroidAppFactory implements AbstractAppFactory {
    @Override
    public Calendar createCalendar() {
        return new CalendarAdroid("Calendario Android", "1.0.0.A");
    }
    @Override
    public Clock createClock() {
        return new ClockAndroid("Reloj Android", "1.0.0.A", "GTM-4");
    }
    @Override
    public Phone createPhone() {
        return new PhoneAndroid("Telefono Android", "1.0.0.A");
    }
}
