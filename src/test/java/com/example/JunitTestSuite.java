package com.example;

import com.example.testSuites.TestJunit1;
import com.example.testSuites.TestJunit2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by metraf on 04.05.17.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})
public class JunitTestSuite {

}
