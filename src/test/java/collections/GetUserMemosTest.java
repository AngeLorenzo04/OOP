package collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GetUserMemosTest {

    @Test
    void getUserPosts() {
        long t0 = System.currentTimeMillis();
        System.out.println("running GetUserMemos.getUserPosts() (slow)");
        List<GetUserMemos.UserPost> userPosts = GetUserMemos.getUserPosts();
        long t1 = System.currentTimeMillis();
        System.out.println("running GetUserMemos.getUserPostsFast() (fast)");
        List<GetUserMemos.UserPost> userPostsFast = GetUserMemos.getUserPostsFast();
        long t2 = System.currentTimeMillis();
        assertTrue((t2 - t1) < (t1 - t0) / 10);
    }
}