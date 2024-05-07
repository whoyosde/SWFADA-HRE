package org.swfada.NuevaRemision.step;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.NuevaRemision.page.HREPage;

import java.awt.*;

public class HREStep extends ScenarioSteps {
    private HREPage hrePage;

    @net.thucydides.core.annotations.Step
    public void IngresarPlataforma() {
        hrePage.open();
    }

    @net.thucydides.core.annotations.Step
    public void AutenticarseConCertificado()throws AWTException {
        hrePage.AutenticarseConCertificado();
    }

    @net.thucydides.core.annotations.Step
    public void CerrarAviso() {
        hrePage.CerrarAviso();
    }

    @net.thucydides.core.annotations.Step
    public void CliclarNuevaRemision() {
        hrePage.CliclarNuevaRemision();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarDestino(String xdestino) {
        hrePage.SeleccionarDestino(xdestino);
    }

    @net.thucydides.core.annotations.Step
    public void IngresarRegistro(String xregistro) {
        hrePage.IngresarRegistro(xregistro);
    }

    @net.thucydides.core.annotations.Step
    public void ValidarFormulario() {
        hrePage.ValidarFormulario();
    }

    @net.thucydides.core.annotations.Step
    public void AdjuntarArchivoXML() {
        hrePage.AdjuntarArchivoXML();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarProvincia(String xprovincia) {
        hrePage.SeleccionarProvincia(xprovincia);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarMunicipio(String xmunicipio) {
        hrePage.SeleccionarMunicipio(xmunicipio);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarOrganoDestino(String xorgano) {
        hrePage.SeleccionarOrganoDestino(xorgano);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarJurisdiccion(String xjurisdiccion) {
        hrePage.SeleccionarJurisdiccion(xjurisdiccion);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarClaseProc(String xclase) {
        hrePage.SeleccionarClaseProc(xclase);
    }

    @net.thucydides.core.annotations.Step
    public void IngresarNroProcedimiento(String xnroprocedimiento) {
        hrePage.IngresarNroProcedimiento(xnroprocedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void IngresarAño(String xaño) {
        hrePage.IngresarAño(xaño);
    }

    @net.thucydides.core.annotations.Step
    public void IngresarNIG(String xnig) {
        hrePage.IngresarNIG(xnig);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarFirmante(String xfirmante) {
        hrePage.SeleccionarFirmante(xfirmante);
    }

    @net.thucydides.core.annotations.Step
    public void cliclarContinuar() {
        hrePage.cliclarContinuar();
    }

    @net.thucydides.core.annotations.Step
    public void ValidarDetalle() {
        hrePage.ValidarDetalle();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionarTipoSubida(String xtipo) {
        hrePage.SeleccionarTipoSubida(xtipo);
    }

    @net.thucydides.core.annotations.Step
    public void AdjuntarExpedienteZIP() {
        hrePage.AdjuntarExpedienteZIP();
    }

    @net.thucydides.core.annotations.Step
    public void CliclarContinuarDetalleRemision() {
        hrePage.CliclarContinuarDetalleRemision();
    }

    @net.thucydides.core.annotations.Step
    public void CliclarContinuarConfirmarRemision() {
        hrePage.CliclarContinuarConfirmarRemision();
    }

    @net.thucydides.core.annotations.Step
    public void ValidarProcesoRemision() {
        hrePage.ValidarProcesoRemision();
    }
}
