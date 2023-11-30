import model.entity.Client;
import model.enums.*;
import service.ClientService;
import service.impl.ClientServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

       ClientService service = new ClientServiceImpl();
//        service.save(new Client(ClientStatus.BLOCKED, LocalDateTime.of(2023,9,23,17,28),
//                LocalDateTime.of(2034, 12,25,19,34), "dvgvcgv",
//                "Nurba", 22, Gender.MALE,
//                FamalyStatus.WIDOWED, Country.CHINA, "Pekin", "fhdshjsd", Zodiac.CANCER,
//                LocalDate.of(2001,9,9)));
      System.out.println(service.getdById(1));
        //  System.out.println(service.getAll());
    }
}