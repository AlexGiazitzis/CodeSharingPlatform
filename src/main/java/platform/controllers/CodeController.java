package platform.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import platform.dto.CodeDTO;
import platform.services.CodeService;

import java.util.List;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@Controller
@RequestMapping(path = "/code")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CodeController {
    CodeService codeService;

    @GetMapping("/{id}")
    public ModelAndView getCodeById(@PathVariable final UUID id) {
        CodeDTO      dto  = codeService.getCodeDTOById(id);
        ModelAndView view = new ModelAndView("code");
        view.addObject("title", "Code");
        if (dto != null) {
            view.addObject("codeList", List.of(dto));
            return view;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/latest")
    public ModelAndView getLatestCodes() {
        ModelAndView view = new ModelAndView("code");
        view.addObject("title", "Latest");
        view.addObject("codeList", codeService.getLastTenCodes());
        return view;
    }

    @GetMapping("/new")
    public String getNew() {
        return "create";
    }

}
