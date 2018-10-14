package com.greenfox.reddit.Controller;


import com.greenfox.reddit.user.ApplicationUser;
import com.greenfox.reddit.user.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
  private ApplicationUserRepository applicationUserRepository;

  private BCryptPasswordEncoder bCryptPasswordEncoder;

  public RegistrationController(ApplicationUserRepository applicationUserRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.applicationUserRepository = applicationUserRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @GetMapping("/register")
  private String register(Model model) {
    model.addAttribute("newUser", new ApplicationUser());
    return "register";
  }

  @PostMapping("/register")
  private String saveUser(Model model, @ModelAttribute ApplicationUser user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    applicationUserRepository.save(user);
    return "redirect:/";
  }


}
