package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.Transferbility;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/transferbilitys")
@Controller
@RooWebScaffold(path = "transferbilitys", formBackingObject = Transferbility.class)
public class TransferbilityController {
}
