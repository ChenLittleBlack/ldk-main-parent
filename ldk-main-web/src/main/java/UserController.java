import com.ldk.main.entity.User;
import com.ldk.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author czl
 * @description 用户表controller
 * @createDate 2020/09/28 10:16
 */
@Controller
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}