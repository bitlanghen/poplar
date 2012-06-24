package cn.edu.pku.poplar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: bitlanghen
 * Date: 12-5-31
 * Time: 下午5:34
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/blast")
public class BlastController {
    @RequestMapping(produces = "text/html")
    public String create() {
        return "blast";
    }
}
