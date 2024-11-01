import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class FechaHoraPeru {
    public static void main(String[] args) {
        // Configuración de zona horaria para Perú
        ZoneId zonaHoraria = ZoneId.of("America/Lima");
        ZonedDateTime fechaHoraActual = ZonedDateTime.now(zonaHoraria);
        
        // Formatos detallados
        System.out.println("Fecha y hora actuales en formato completo (Perú):");
        System.out.println("Fecha completa: " + fechaHoraActual.format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy")));
        System.out.println("Hora en formato 24h: " + fechaHoraActual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Hora en formato 12h: " + fechaHoraActual.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
        System.out.println("Día de la semana: " + fechaHoraActual.format(DateTimeFormatter.ofPattern("EEEE")));
        System.out.println("Día del año: " + fechaHoraActual.getDayOfYear());
        System.out.println("Semana del año: " + fechaHoraActual.get(WeekFields.of(DayOfWeek.MONDAY, 1).weekOfYear()));
        System.out.println("Zona horaria: " + fechaHoraActual.getZone());
        System.out.println("Año (4 dígitos): " + fechaHoraActual.getYear());
        System.out.println("Mes (nombre y número): " + fechaHoraActual.format(DateTimeFormatter.ofPattern("MMMM (MM)")));
        System.out.println("Día del mes: " + fechaHoraActual.getDayOfMonth());
    }
}
