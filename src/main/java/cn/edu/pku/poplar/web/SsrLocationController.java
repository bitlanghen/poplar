package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.SsrLocation;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ssrlocations")
@Controller
@RooWebScaffold(path = "ssrlocations", formBackingObject = SsrLocation.class)
@RooWebFinder
public class SsrLocationController {
}
