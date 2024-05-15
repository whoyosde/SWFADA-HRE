package org.swfada.NuevaRemision.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

@DefaultUrl("/hrepru/")


public class HREPage extends PageObject {

    @FindBy(xpath = "//a[@id='boton_certificado']")
    private WebElementFacade CertificadoElectronico;
    @FindBy(xpath = "//button[contains(text(),'Cerrar')]")
    private WebElementFacade cerraraviso;
    @FindBy(xpath = "//input[@id='boton_nuevo']")
    private WebElementFacade btnNuevaremision;
    @FindBy(xpath = "//select[@id=\"tipo_destino\"]")
    private WebElementFacade listDestino;
    @FindBy(xpath = "//input[@id=\"entrada\"]")
    private WebElementFacade regEntrada;
    @FindBy(xpath = "//div[@id=\"divSubidaLocal\"]")
    private WebElementFacade validarFormulario;
    @FindBy(xpath = "//select[@id=\"provincia\"]")
    private WebElementFacade listProvincia;
    @FindBy(xpath = "//select[@id=\"municipio\"]")
    private WebElementFacade listMunicipio;
    @FindBy(xpath = "//select[@id=\"organo\"]")
    private WebElementFacade listOrganoDestino;
    @FindBy(xpath = "//select[@id=\"jurisdiccion\"]")
    private WebElementFacade listJurisdiccion;
    @FindBy(xpath = "//select[@id=\"clase\"]")
    private WebElementFacade listClase;
    @FindBy(xpath = "//input[@id=\"num\"]")
    private WebElementFacade nroProcedimiento;
    @FindBy(xpath = "//input[@id=\"anyo\"]")
    private WebElementFacade año;
    @FindBy(xpath = "//input[@id=\"nig\"]")
    private WebElementFacade Nig;
    @FindBy(xpath = "//select[@id=\"firmante\"]")
    private WebElementFacade listFirmante;
    @FindBy(xpath = "//input[@id=\"boton_datos\"]")
    private WebElementFacade btnContinuarFormulario;
    @FindBy(xpath = "//select[@id=\"tipo_subida\"]")
    private WebElementFacade tipoSubida;
    @FindBy(xpath = "//input[@id=\"boton_subir\"]")
    private WebElementFacade btnContinuarDetalle;
    @FindBy(xpath = "//input[@id=\"boton_confirmar\"]")
    private WebElementFacade btnContinuarConfirmacion;
    @FindBy(xpath = "(//div[@class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 alert alert-success\"]/p)[1]")
    private WebElementFacade alertaExitosa;




    public void AutenticarseConCertificado() throws AWTException {
        waitFor(10).second();
        Robot robot = new Robot();
        Runnable mlauncher = () -> {
            try {
                CertificadoElectronico.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        try {
            Thread thread = new Thread(mlauncher);
            thread.start();
            //Simular Enter
            waitFor(5).second();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CerrarAviso() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Cerrar')]")));
        cerraraviso.click();
    }

    public void CliclarNuevaRemision() {
        btnNuevaremision.click();
    }

    public void SeleccionarDestino(String xdestino) {
        listDestino.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xdestino + "')]"));
        clickOn(selectOptions);
    }

    public void IngresarRegistro(String xregistro) {
        regEntrada.sendKeys(xregistro);
    }

    public void ValidarFormulario() {
        String validar = validarFormulario.getAttribute("id");
        if(validar.equals("divSubidaLocal")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No carga formulario");
        }
    }

    public void AdjuntarArchivoXML() {
        // Localiza el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.id("requerimiento"));

        // Específica la ruta absoluta del archivo que deseas subir
        File file = new File("C:\\Users\\whoyosde\\Documents\\ADA\\requerimiento 1.xml");

        // Envía la ruta del archivo al elemento de entrada de archivo
        fileInput.sendKeys(file.getAbsolutePath());

    }

    public void SeleccionarProvincia(String xprovincia) {
        listProvincia.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xprovincia + "')]"));
        clickOn(selectOptions);
    }

    public void SeleccionarMunicipio(String xmunicipio) {
        listMunicipio.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("(//option[contains(text(),'" + xmunicipio + "')])[2]"));
        clickOn(selectOptions);
    }

    public void SeleccionarOrganoDestino(String xorgano) {
        listOrganoDestino.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xorgano + "')]"));
        clickOn(selectOptions);
    }

    public void SeleccionarJurisdiccion(String xjurisdiccion) {
        listJurisdiccion.waitUntilClickable();
        waitFor(1).second();
        listJurisdiccion.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xjurisdiccion + "')]"));
        clickOn(selectOptions);
    }

    public void SeleccionarClaseProc(String xclase) {
        listClase.waitUntilClickable();
        waitFor(1).second();
        listClase.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xclase + "')]"));
        clickOn(selectOptions);
    }

    public void IngresarNroProcedimiento(String xnroprocedimiento) {
        nroProcedimiento.sendKeys(xnroprocedimiento);
    }

    public void IngresarAño(String xaño) {
        año.sendKeys(xaño);
    }

    public void IngresarNIG(String xnig) {
        Nig.sendKeys(xnig);
    }

    public void SeleccionarFirmante(String xfirmante) {
        listFirmante.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xfirmante + "')]"));
        clickOn(selectOptions);
    }

    public void cliclarContinuar() {
        btnContinuarFormulario.click();
    }

    public void ValidarDetalle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Detalles de la remisión')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 400)");
        List<WebElement> detalle = getDriver().findElements(By.xpath("//div[@class=\"detallesRemision\"]"));
        List<WebElement> requerimiento = getDriver().findElements(By.xpath("//strong[contains(text(),'requerimiento.xml')]"));
        if (detalle.size() != 0 && requerimiento.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe detalle");
        }
    }

    public void SeleccionarTipoSubida(String xtipo) {
        tipoSubida.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + xtipo + "')]"));
        clickOn(selectOptions);
     
    }

    public void AdjuntarExpedienteZIP() {
        // Localiza el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.id("ruta_zip"));

        // Específica la ruta absoluta del archivo que deseas subir
        File file = new File("C:\\Users\\whoyosde\\Documents\\ADA\\ExpedienteCompleto 1.zip");

        // Envía la ruta del archivo al elemento de entrada de archivo
        fileInput.sendKeys(file.getAbsolutePath());
    }

    public void CliclarContinuarDetalleRemision() {
        btnContinuarDetalle.waitUntilClickable();
        waitFor(1).second();
        btnContinuarDetalle.click();
    }

    public void CliclarContinuarConfirmarRemision() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Confirmación de la remisión')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        btnContinuarConfirmacion.waitUntilClickable();
        btnContinuarConfirmacion.click();
    }

    public void ValidarProcesoRemision() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 alert alert-success\"]")));
        String validar = alertaExitosa.getText();
        if(validar.contains(" ha comenzado su proceso de remisión")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No exitoso");
        }

    }
}

