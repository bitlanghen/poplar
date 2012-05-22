package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.Pic;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pics")
@Controller
@RooWebScaffold(path = "pics", formBackingObject = Pic.class)
@RooWebFinder
public class PicController {
}
