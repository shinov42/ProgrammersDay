package pi.individual.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pi.individual.container.YearContainer;
import pi.individual.service.YearService;

@RestController
public class YearEndpoint {
    private final YearService service;

    public YearEndpoint(YearService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public YearContainer yearMethod(
            @RequestParam(value="year") String year
    ) {
        return service.getDevDay(year);
    }
}
