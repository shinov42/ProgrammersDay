package pi.individual.service;

import org.springframework.stereotype.Service;
import pi.individual.container.YearContainer;

@Service
public class YearService {
    public YearContainer getDevDay(String request) {
        try {
            Integer year = Integer.valueOf(request);
            //проверка что год в пределах от 0 до 9999
            if (year >= 0 && year <= 9999)
                //проверка является ли год високосным
                if (checkLeap(year))
                    return new YearContainer(200, "13/09/" + this.formatYear(year));
                else return new YearContainer(200, "12/09/" + this.formatYear(year));
            else
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            return new YearContainer(400, "Неверно указан год");
        }
    }

    //метод для проверки високосного года
    private boolean checkLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    private String formatYear(Integer year) {
        return String.format("%04d", year);
    }
}
