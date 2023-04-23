package com.practice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Topコントローラ。
 */
@Controller
public class TopController {

    /**
     * Top初期表示。
     *
     * @return Path
     */
    @RequestMapping("/")
    public String top() {
        return "top";
    }
}
