package pl.qubiak.weather.map.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.qubiak.weather.map.Parser.ImgwParser;

import java.io.IOException;

@Controller
public class MapController {

    private ImgwParser imgwParser;

    public MapController(ImgwParser imgwParser) {
        this.imgwParser = imgwParser;
    }

    @GetMapping
    public String getMap(Model model) throws IOException {
        model.addAttribute("points", imgwParser.getWeatherPointAndData());
        return "map";
    }
}
