/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.app.TCS.serviceXmlDefs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Omar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ec.app.TCS.serviceXmlDefs.TestCaseTest.class, ec.app.TCS.serviceXmlDefs.ServiceTest.class, ec.app.TCS.serviceXmlDefs.BranchListTest.class, ec.app.TCS.serviceXmlDefs.BranchTest.class, ec.app.TCS.serviceXmlDefs.ServiceListTest.class, ec.app.TCS.serviceXmlDefs.ObjectFactoryTest.class, ec.app.TCS.serviceXmlDefs.TestCaseListTest.class})
public class ServiceXmlDefsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
