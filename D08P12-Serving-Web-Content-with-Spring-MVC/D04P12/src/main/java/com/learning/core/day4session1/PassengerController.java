package com.learning.core.day4session1;

@Controller
public class PassengerController {
 
    @GetMapping("/passenger/register")
    public String showPassengerForm(Model model) {
        model.addAttribute("passenger", new Passenger_Details());
        return "PassengerForm";
    }
 
    @PostMapping("/passenger/register")
    public String submitPassengerForm(@ModelAttribute("passenger") Passenger_Details passenger) {
        // Logic to save passenger details
        return "redirect:/home";
    }
}