package kr.hs.study.shopParameter.controller;

import kr.hs.study.shopParameter.dto.login;
import kr.hs.study.shopParameter.dto.product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class mController {
    @GetMapping("/product")
    public String product(){
        return "product";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/resultP")
    public String resultProduct(@ModelAttribute product p, Model model){
        List<String> list=new ArrayList<>();
        list.add(p.getProductName());
        list.add(p.getPrice());
        list.add(p.getProductInfo());
        list.add(p.getProductMade());
        model.addAttribute("list", list);
        return "resultP";
    }

    @PostMapping("/resultL")
    public String resultLogin(@ModelAttribute login l, Model model2){
        model2.addAttribute(l.getId());
        model2.addAttribute(l.getPass());
        return "resultL";
    }

}
