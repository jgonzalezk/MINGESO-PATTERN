public class SystemAdpaterImp implements SystemAdapter {
    public SystemAdpaterImp() {
    }

    @Override
    public void executeSystem (double temperatura){
        double temp = (double) convertFahrenheitToCelsius(temperatura);
        ServiceImp service = new ServiceImp();
        //Ejecutar el sistema con la temperatura convertida a Celsius
        service.executeService(temp);   
        return;
    }

    private double convertFahrenheitToCelsius(double temperatura){
        double aux = (double) 5/9;
        return (double) (temperatura - 32) * aux;
    }
}