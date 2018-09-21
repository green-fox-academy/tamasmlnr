package com.greenfox.fox.Controllers;


import com.greenfox.fox.Models.Fox;
import com.greenfox.fox.Services.ColorService;
import com.greenfox.fox.Services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ColorController {

  private final ColorService colorService;
  private final FoxService foxService;

  public ColorController(ColorService colorService, FoxService foxService) {
    this.colorService = colorService;
    this.foxService = foxService;
  }

  @GetMapping("/colorPicker")
  public String colorPicker(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "colorPicker";
  }

  @PostMapping("/setColor")
  public String setFoxColor(@RequestParam("color") String color, @RequestParam("name") String name, Model model, RedirectAttributes redirectAttributes) {
    model.addAttribute("color", color);
    Fox fox = foxService.getByName(name);
    ColorService.recolorFox(color, fox);
    redirectAttributes.addAttribute("name", name);
    return "redirect:/";
  }
}
