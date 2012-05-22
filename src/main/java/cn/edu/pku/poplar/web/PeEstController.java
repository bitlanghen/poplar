package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.PeEst;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/peests")
@Controller
@RooWebScaffold(path = "peests", formBackingObject = PeEst.class)
public class PeEstController {
}
