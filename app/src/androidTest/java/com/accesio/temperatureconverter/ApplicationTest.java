package com.accesio.temperatureconverter;

import android.app.Application;
import android.test.ApplicationTestCase;
import org.junit.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Test
    public void testfoo() {
        assertEquals(1.1,1.1);

    }
}