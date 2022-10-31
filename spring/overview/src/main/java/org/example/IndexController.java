package org.example;

import net.sf.cglib.core.Local;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

@Controller
public class IndexController {
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)  //localhost:8080/ get 요청시 index 메서드 호출
    public String index(Local local, Model model, HttpServletRequest request){
        System.out.println("IndexController");
        LocalDateTime localDateTime = LocalDateTime.now();
        model.addAttribute("now", localDateTime);
        // localhost:8080 --> forward --> index.jsp
        return "index";
    }
    /*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model, HttpServletRequest request) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);


        // model (request ... 저장소에 저장)
        // model.addAttribute("serverTime", formattedDate);
        request.setAttribute("serverTime", formattedDate);

        /*
         * Model vs HttpServletRequest
         *
         * Client -- (request) --> Controller/Service/DAO --> (response) --> Client
         *
         * HttpServletRequest: 사용자의 request 생성될 때 같이 생성
         * Model             : HttpServletRequest 객체를 통해서 만듦
         * */


        // prefix: /WEB-INF/views/ , suffix: jsp
       // return "index"; // /WEB-INF/views/index.jsp

    }

//}
