
public enum Day {

    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miércoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sabado"),
    SUNDAY("Domingo");

    private String spanish;
    private Day(String s){
        spanish = s;
    }
    public String getSpanish(){
        return spanish;
    }

}
