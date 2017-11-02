package tests;

import org.junit.Test;

import global.BaseTestFixture;
import pages.LoginPage;

/**
 * Created by matisseh on 2/8/17.
 */
public class LogInTest extends BaseTestFixture{

    @Override
    public void beforeEachTest()
    {
       start();
    }

    @Test
    public void testLogInWithFakeCredentials() {
        new LoginPage()
                .enterCredentials("xtc@xamarin.com", "fake")
                .tapSignInButton();
    }
}
