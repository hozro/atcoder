//import com.nhaarman.mockitokotlin2.doReturn
//import com.nhaarman.mockitokotlin2.mock
//import jp.co.main.Main
//import org.junit.jupiter.api.*
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Test
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//class BeginnerTest {
//
//    var testIn: TestInputStream = TestInputStream()
//    var testOut: TestOutputStream = TestOutputStream()
//
//    private val mainMock = mock<Main> {
//        on { main(emptyArray()) } doReturn Unit
//    }
//
//    @BeforeAll
//    fun before() {
//        System.setIn(testIn)
//        System.setOut(testOut)
//    }
//
//    @AfterAll
//    fun after() {
//        System.setOut(null)
//        System.setIn(null)
//    }
//
//
//    @Test
//    fun test1() {
//        testIn.inputln("2")
//        testIn.inputln("2919")
//        mainMock.main(emptyArray())
//        assertEquals(3719, testOut.readLine().toInt())
//    }
//
//    @Test
//    fun test2() {
//        testIn.inputln("22")
//        testIn.inputln("3051")
//        mainMock.main(emptyArray())
//        assertEquals(3051, testOut.readLine().toInt())
//    }
//
//    @Test
//    fun success() {
//        assertEquals(1, 1)
//    }
//}