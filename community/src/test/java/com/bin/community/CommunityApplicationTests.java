package com.bin.community;

import com.bin.bean.DiscussPost;
import com.bin.bean.User;
import com.bin.service.impl.DiscussPostServiceImpl;
import com.bin.service.impl.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest

class CommunityApplicationTests {

    @Autowired
    UserService userService;
    @Autowired
    DiscussPostServiceImpl discussPostService;
    @Test
    void contextLoads() {
        List<DiscussPost> discussPosts = discussPostService.selectAllDiscussPosts(0, 10);
        for (DiscussPost d :discussPosts) {
            System.out.println(d);
            User user = userService.selectUserById(d.getUserId());
            System.out.println(user);
        }
        /*
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (DiscussPost discussPost : discussPosts) {
            Map<String, Object> map = new HashMap<>();
            User user = userService.selectUserById(discussPost.getId());
            map.put("post", discussPost);
            map.put("user", user);
            mapList.add(map);
        }
        for (Map<String,Object> map:mapList) {
            User u = (User) map.get("user");
            System.out.println(u.getHeaderUrl());
        }*/
    }
}
