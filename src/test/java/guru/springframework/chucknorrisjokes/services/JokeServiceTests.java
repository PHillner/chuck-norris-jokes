package guru.springframework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author phillner
 * @created 2020-04-24
 */
@SpringBootTest
public class JokeServiceTests {

    private JokeService jokeService;

    @Before
    public void setUp() {
        jokeService = new JokeServiceImpl(new ChuckNorrisQuotes());
    }

    @Test
    public void getJokeReturnsJoke() {
        Assert.assertFalse(jokeService.getJoke().isEmpty());
    }
}
