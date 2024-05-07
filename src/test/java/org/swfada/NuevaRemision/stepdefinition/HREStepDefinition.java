package org.swfada.NuevaRemision.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.swfada.NuevaRemision.step.HREStep;

import java.awt.*;


public class HREStepDefinition {
    @Steps
    private HREStep hreStep;

    @Dado("^que el usuario ingresa a la plataforma HRE$")
    public void Que_el_usuario_ingresa_a_la_plataforma_HRE() {

        hreStep.IngresarPlataforma();
    }

    @Cuando("^se inicia sesión mediante Certificado$")
    public void Se_inicia_sesión_mediante_Certificado() throws AWTException {

        hreStep.AutenticarseConCertificado();
    }

    @Y("^se cierra el aviso de nueva versión HRE$")
    public void Se_cierra_el_aviso_de_nueva_versión_HRE() {
        hreStep.CerrarAviso();
    }

    @Y("^se hace click en el boton Nueva remisión$")
    public void Se_hace_click_en_el_boton_Nueva_remisión() {

        hreStep.CliclarNuevaRemision();
    }

    @Y("^seleccionar el destino$")
    public void Seleccionar_el_destino(DataTable dataTable) {
        String xdestino = dataTable.toString().split("\\|")[1].trim();
        hreStep.SeleccionarDestino(xdestino);
    }

    @Y("^ingresar el regitro de entrada$")
    public void Ingresar_el_regitro_de_entrada(DataTable dataTable) {
        String xregistro = dataTable.toString().split("\\|")[1].trim();
        hreStep.IngresarRegistro(xregistro);
    }

    @Entonces("^se carga el formulario$")
    public void Se_carga_el_formulario() {

        hreStep.ValidarFormulario();
    }

    @Y("^adjuntar el archivo requerimiento$")
    public void Adjuntar_el_archivo_requerimiento() {

        hreStep.AdjuntarArchivoXML();
    }

    @Y("^seleccionar provincia: \"([^\"]*)\"$$")
    public void Seleccionar_provincia(String Xprovincia) {

        hreStep.SeleccionarProvincia(Xprovincia);
    }

    @Y("^seleccionar municipio: \"([^\"]*)\"$$")
    public void Seleccionar_municipio(String Xmunicipio) {

        hreStep.SeleccionarMunicipio(Xmunicipio);
    }

    @Y("^seleccionar organo destino: \"([^\"]*)\"$$")
    public void Seleccionar_organo_destino(String Xorgano) {

        hreStep.SeleccionarOrganoDestino(Xorgano);
    }

    @Y("^seleccionar jurisdicción: \"([^\"]*)\"$$")
    public void Seleccionar_jurisdicción(String Xjurisdiccion) {

        hreStep.SeleccionarJurisdiccion(Xjurisdiccion);
    }

    @Y("^seleccionar clase procedimiento: \"([^\"]*)\"$$")
    public void Seleccionar_clase_procedimiento(String Xclase) {

        hreStep.SeleccionarClaseProc(Xclase);
    }

    @Y("ingresar número procedimiento: {string}")
    public void ingresar_Número_Procedimiento(String Xnroprocedimiento) {
        hreStep.IngresarNroProcedimiento(Xnroprocedimiento);
    }

    @Y("^ingresar año: \"([^\"]*)\"$$")
    public void Ingresar_año(String Xaño) {

        hreStep.IngresarAño(Xaño);
    }

    @Y("^ingresar NIG: \"([^\"]*)\"$$")
    public void Ingresar_NIG(String Xnig) {

        hreStep.IngresarNIG(Xnig);
    }

    @Y("^seleccionar firmante: \"([^\"]*)\"$$")
    public void Seleccionar_firmante(String Xfirmante) {

        hreStep.SeleccionarFirmante(Xfirmante);
    }

    @Cuando("^se hace click en el botón continuar$")
    public void Se_hace_click_en_el_botón_continuar() {

        hreStep.cliclarContinuar();
    }

    @Entonces("^se muestra el detalle de la remisión$")
    public void Se_muestra_el_detalle_de_la_remisión() {

        hreStep.ValidarDetalle();
    }

    @Y("^seleccionar el tipo de subida del expediente: \"([^\"]*)\"$$")
    public void Seleccionar_el_tipo_de_subida_del_expediente(String xtipo) {

        hreStep.SeleccionarTipoSubida(xtipo);
    }

    @Y("^adjuntar expediente en formato zip$")
    public void Adjuntar_expediente_en_formato_zip() {

        hreStep.AdjuntarExpedienteZIP();
    }

    @Y("^se hace click en el botón continuar detalle de remisión$")
    public void Se_hace_click_en_el_botón_continuar_detalle_de_remisión() {
        hreStep.CliclarContinuarDetalleRemision();
    }

    @Y("^se hace click en el botón continuar confirmar remisión$")
    public void Se_hace_click_en_el_botón_continuar_confirmar_remisión() {

        hreStep.CliclarContinuarConfirmarRemision();
    }

    @Entonces("^se valida que la remisión a comenzado su proceso$")
    public void Se_valida_que_la_remisión_a_comenzado_su_proceso() {

        hreStep.ValidarProcesoRemision();
    }


}
