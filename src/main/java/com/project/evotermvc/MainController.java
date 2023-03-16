package com.project.evotermvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Landing Page - E-Voter");
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("pageTitle", "Login - E-Voter");
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("pageTitle", "Register - E-Voter");
        return "register";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword(Model model) {
        model.addAttribute("pageTitle", "Forgot Password - E-Voter");
        return "forgot-password";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("pageTitle", "Dashboard - E-Voter");
        return "dashboard";
    }

    @GetMapping("/dashboard/profile")
    public String profile(Model model) {
        model.addAttribute("pageTitle", "Profile - E-Voter");
        return "profile";
    }

    @GetMapping("/dashboard/polls")
    public String polls(Model model) {
        model.addAttribute("pageTitle", "Polls - E-Voter");
        return "polls";
    }

    @GetMapping("/dashboard/add-poll")
    public String addPoll(Model model) {
        model.addAttribute("pageTitle", "Add Poll - E-Voter");
        return "add_poll";
    }

    @GetMapping("/dashboard/vote")
    public String vote(Model model) {
        model.addAttribute("pageTitle", "Vote - E-Voter");
        return "vote";
    }

    @GetMapping("/dashboard/add-admin")
    public String addAdmin(Model model) {
        model.addAttribute("pageTitle", "Add Admin - E-Voter");
        return "add_admin";
    }

    @GetMapping("/dashboard/add-candidate")
    public String addCandidate(Model model) {
        model.addAttribute("pageTitle", "Add Candidate - E-Voter");
        return "add_candidate";
    }

    @GetMapping("/dashboard/add-poll-type")
    public String addPollType(Model model) {
        model.addAttribute("pageTitle", "Add Poll Type - E-Voter");
        return "add_poll_type";
    }

}
