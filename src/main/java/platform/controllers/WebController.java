package platform.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import platform.services.WebService;

/**
 * @author Alex Giazitzis
 */
@Controller
@RequestMapping(produces = MediaType.TEXT_HTML_VALUE)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class WebController {
    WebService webService;

    @GetMapping({"/", ""})
    public String getHome() {
        return "home";
    }

    @GetMapping("/docs")
    public ModelAndView getDocs() {
        ModelAndView docs = new ModelAndView("docs");
        docs.addObject("endpointList", webService.getEndpoints());
        return docs;
    }

    @GetMapping("/about")
    public ModelAndView getAbout() {
        ModelAndView view = new ModelAndView("about");
        view.addObject("memberList", webService.getMembers());
        return view;
    }

}
