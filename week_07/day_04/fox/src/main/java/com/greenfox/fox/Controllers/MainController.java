package com.greenfox.fox.Controllers;


import com.greenfox.fox.Models.Fox;
import com.greenfox.fox.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @GetMapping("/")
  public String showIndex(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    Fox fox = foxService.getByName(name);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping("/save")
  public String loginWithName(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
    foxService.createNew(name);
    redirectAttributes.addAttribute("name", name);
    return "redirect:/";
  }

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam("name") String name, Model model) {
    model.addAttribute("food", foxService.getFoodList());
    model.addAttribute("name", name);
    model.addAttribute("drinks", foxService.getDrinkList());
    return "nutritionstore";
  }

  @GetMapping("/savenutrition")
  public String setNutrition(@RequestParam("name") String name, @RequestParam("drink") String drink, @RequestParam("food") String food, Model model, RedirectAttributes redirectAttributes) {
    foxService.getByName(name)
        .setDrink(drink);
    foxService.getByName(name)
        .setFood(food);
    redirectAttributes.addAttribute("name", name);
    return "redirect:/";
  }


  @GetMapping("/trickCenter")
  public String trickCenter(@RequestParam("name") String name, Model model) {
    model.addAttribute("trickList", foxService.getTaskList());
    model.addAttribute("name", name);
    return "trickcenter";
  }

  @GetMapping("/saveTrick")
  public String saveTrick(@RequestParam("name") String name, @RequestParam("trick") String trick, Model model, RedirectAttributes redirectAttributes) {
    foxService.getByName(name)
        .addTrick(trick);
    redirectAttributes.addAttribute("name", name);
    return "redirect:/";
  }


}
