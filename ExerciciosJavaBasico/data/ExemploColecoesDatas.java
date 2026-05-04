import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

class Evento {
    String nome;
    LocalDate data;

    Evento(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() { return nome; }
    public LocalDate getData() { return data; }

    @Override
    public String toString() {
        return nome + " - " + data;
    }
}

public class ExemploColecoesDatas {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<LocalDate> listaDatas = Arrays.asList(
            hoje.minusYears(2),
            hoje.minusYears(1),
            hoje.minusMonths(6),
            hoje.minusMonths(2),
            hoje.minusDays(15),
            hoje.minusDays(7),
            hoje.minusDays(1),
            hoje,
            hoje.plusDays(1),
            hoje.plusDays(7),
            hoje.plusWeeks(2),
            hoje.plusMonths(1),
            hoje.plusMonths(5),
            hoje.plusYears(1),
            LocalDate.of(2030, 12, 31)
        );

        listaDatas.forEach(d -> System.out.println(d.format(fmt)));

        System.out.println("======");

        listaDatas.stream()
                .filter(d -> d.isAfter(hoje))
                .forEach(System.out::println);

        System.out.println("========");

        listaDatas.stream()
                .filter(d -> d.isBefore(hoje))
                .forEach(System.out::println);

        System.out.println("=======");

        listaDatas.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=========");

        listaDatas.stream()
                .sorted((d1,d2) -> d2.compareTo(d1))
                .forEach(System.out::println);

        System.out.println("=====");

        listaDatas.stream()
                .sorted((d1,d2) -> Integer.compare(d1.getDayOfMonth(), d2.getDayOfMonth()))
                .forEach(System.out::println);

        System.out.println("=== Ordenado por Mês ===");

        listaDatas.stream()
                .sorted(Comparator.comparingInt(LocalDate::getMonthValue))
                .forEach(d -> System.out.println(d.format(fmt)));

        System.out.println("ano atual");

        listaDatas.stream()
                .filter(d -> d.getYear().equals(hoje.getYear()))
                .forEach(d -> System.out.println(d.format(fmt)));

        System.out.println("mes atual");

        listaDatas.stream()
                .filter(d -> d.getMonth().equals(hoje.getMonth()))
                .forEach(d -> System.out.println(d.format(fmt)));

        System.out.println("intervalo");

        LocalDate inicio = hoje.minusMonths(1);
        LocalDate fim = hoje.plusMonths(1);

        listaDatas.stream()
                .filter(d -> d.isAfter(inicio) && d.isBefore(fim))
                .forEach(System.out::println);

        List<Evento> eventos = Arrays.asList(
            new Evento("Evento A", hoje.minusDays(10)),
            new Evento("Evento B", hoje.plusDays(2)),
            new Evento("Evento C", hoje.plusDays(5)),
            new Evento("Evento D", hoje.plusDays(1)),
            new Evento("Evento E", hoje.plusDays(20)),
            new Evento("Evento F", hoje.plusDays(7))
        );

        System.out.println("10.");

        eventos.stream()
                .filter(e -> e.getData().isAfter(hoje))
                .forEach(System.out::println);

        System.out.println("11.");

        eventos.stream()
                .sorted(Comparator.comparing(Evento::getData))
                .forEach(System.out::println);

        System.out.println("12.");

        eventos.stream()
                .sorted(Comparator.comparing(Evento::getData).reversed())
                .forEach(System.out::println);

        System.out.println("13.");

        eventos.stream()
                .filter(e -> e.getData().isAfter(hoje))
                .sorted(Comparator.comparing(Evento::getData))
                .forEach(System.out::println);

        System.out.println("14.");

        eventos.stream()
                .sorted(Comparator.comparing(Evento::getData))
                .map(Evento::getNome)
                .forEach(System.out::println);

        System.out.println("15.");

        eventos.stream()
                .sorted(Comparator.comparing(Evento::getData))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("16.");

        eventos.stream()
                .sorted(Comparator.comparingLong(
                        e -> Math.abs(ChronoUnit.DAYS.between(hoje, e.getData()))
                ))
                .forEach(System.out::println);

        System.out.println("17.");

        eventos.stream()
                .filter(e -> e.getData().isAfter(hoje) &&
                             e.getData().isBefore(hoje.plusDays(7)))
                .forEach(System.out::println);

        System.out.println("18.");

        eventos.stream()
                .sorted(Comparator
                        .comparing((Evento e) -> e.getData().getMonthValue())
                        .thenComparing(e -> e.getData().getDayOfMonth()))
                .forEach(System.out::println);

        System.out.println("FINAL");

        eventos.stream()
                .filter(e -> e.getData().isAfter(hoje))
                .sorted(Comparator.comparing(Evento::getData))
                .limit(3)
                .map(Evento::getNome)
                .forEach(System.out::println);
    }
}
