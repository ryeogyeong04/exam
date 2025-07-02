package com.example.faq.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import egovframework.example.faq.service.FaqService;
import egovframework.example.faq.service.FaqVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequiredArgsConstructor
public class FaqController {

    private final FaqService faqService;

    @GetMapping("/faq/list")
    public String getFaqList(Model model) {
        List<FaqVO> faqList = faqService.getAllFaqs();
        model.addAttribute("faqList", faqList);
        return "faq/list"; // JSP 파일명 (제출 대상 아님)
    }
}
