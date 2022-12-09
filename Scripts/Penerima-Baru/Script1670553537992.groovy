import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.Button - CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - tyyyygrg'), 0)

Mobile.setText(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - tyyyygrg (1)'), 'Seftya', 0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - sefgmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - sefgmail.com (1)'), 'seft@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - 7778687'), 0)

Mobile.setText(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - 7778687 (1)'), '081311711888', 
    0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - jalan jakarta'), 0)

Mobile.setText(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - jalan jakarta (1)'), 'jalan jakarta dua', 
    0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.CheckedTextView - UPS'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - Comment'), 0)

Mobile.setText(findTestObject('Object Repository/Penerima-Baru/android.widget.EditText - Comment (1)'), 'Dikirim tepat waktu\'', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.Button - YES'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Penerima-Baru/android.widget.TextView - Thank you for ordering, your order will be review soon, invoice detail will be sent to your email when the order is ready'), 
    0)

Mobile.tap(findTestObject('Object Repository/Penerima-Baru/android.widget.Button - OK'), 0)

Mobile.closeApplication()

