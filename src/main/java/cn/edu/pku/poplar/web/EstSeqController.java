package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.EstSeq;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/estseqs")
@Controller
@RooWebScaffold(path = "estseqs", formBackingObject = EstSeq.class)
public class EstSeqController {
}
