package example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog" // model.addAttribute("title", "Blog")
        // 코틀린 사용으로 기존 자바보다 코드가 간결해짐
        return "blog"
    }

}
