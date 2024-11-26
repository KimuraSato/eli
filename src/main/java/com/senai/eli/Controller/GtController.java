package com.senai.eli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.senai.eli.Model.Gt;
import com.senai.eli.Repository.GtRepository;

@Controller
public class GtController {


    @Autowired
    private GtRepository er;
    
    @GetMapping("/gt/criar")
    public String criar(){
        return "gt/criar";
    }

    @PostMapping("/gt/criar")
    public String criar(Gt  ev){
        er.save(ev);
        return "redirect:/evento";
    }

    @GetMapping("/gt")
    public String listar(Model view){
        List<Gt> listaGt = er.findAll();

        view.addAttribute("listaGtNoFront", listaGt);

        return "gt/listar";
    }

    @GetMapping("/gt/alterar/{id}")
    public String alterar(@PathVariable Long id, Model model) {
      Gt gt;
        gt = er.findById(id).orElseThrow();

        model.addAttribute("gt", gt);
        return "gt/alterar";
    }    

    @PostMapping("/gt/alterar/{id}")
    public String alterar(@PathVariable Long id, Gt ev) {
        ev.setId(id);

        er.save(ev);
        
        return "redirect:/gt";
    }

    @GetMapping("/gt/deletar/{id}")
    public String deletar(@PathVariable Long id, Model model){
        Gt gt;
        gt = er.findById(id).orElseThrow();
        er.deleteById(id);

        return "gt/deletar";
    }
}