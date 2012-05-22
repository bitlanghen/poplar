package cn.edu.pku.poplar.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: bitlanghen
 * Date: 12-5-21
 * Time: 下午4:09
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/search")
public class SearchController {

    @RequestMapping(params = "form", produces = "text/html")
    public String create(Model uiModel) {
        uiModel.addAttribute("form", new SearchForm());
        return "searchForm";
    }
}
