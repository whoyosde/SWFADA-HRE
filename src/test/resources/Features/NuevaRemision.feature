#language: es
@NuevaRemision
Característica: Registrar una remisión de expediente
  Como usuario comun
  Quiero gestionar la remisión de expediente electronico
  Para ser remitidos al organo judicial andaluz

  Antecedentes:
    Dado que el usuario ingresa a la plataforma HRE
    Cuando se inicia sesión mediante Certificado
    Y se cierra el aviso de nueva versión HRE
    Y se hace click en el boton Nueva remisión
    Y seleccionar el destino
      | Remisión a órgano judicial andaluz |
    Y ingresar el regitro de entrada
      | 201799900013124 |
    Entonces se carga el formulario

  @CAP_IncorporarRequerimiento
  Esquema del escenario: Adjuntar requerimiento de remisión
    Y adjuntar el archivo requerimiento
    Y seleccionar provincia: "<provincia>"
    Y seleccionar municipio: "<municipio>"
    Y seleccionar organo destino: "<organo destino>"
    Y seleccionar jurisdicción: "<jurisdiccion>"
    Y seleccionar clase procedimiento: "<clase>"
    Y ingresar número procedimiento: "<nro proc>"
    Y ingresar año: "<año>"
    Y ingresar NIG: "<NIG>"
    Y seleccionar firmante: "<firmante>"
    Cuando se hace click en el botón continuar
    Entonces se muestra el detalle de la remisión


    Ejemplos:
      | provincia | municipio | organo destino                               | jurisdiccion | clase                           | nro proc | año  | NIG                 | firmante                 |
      | SEVILLA   | Sevilla   | JUZGADO DE PRIMERA INSTANCIA Nº 3 DE SEVILLA | Civil        | Ejecución de títulos judiciales | 000010   | 2017 | 4109142120170000016 | PEDRO MANUEL COBOS RAMOS |

  @CAP_IncorporarExpedienteZIP
  Esquema del escenario: Incorporar expediente ZIP
    Y adjuntar el archivo requerimiento
    Y seleccionar provincia: "<provincia>"
    Y seleccionar municipio: "<municipio>"
    Y seleccionar organo destino: "<organo destino>"
    Y seleccionar jurisdicción: "<jurisdiccion>"
    Y seleccionar clase procedimiento: "<clase>"
    Y ingresar número procedimiento: "<nro proc>"
    Y ingresar año: "<año>"
    Y ingresar NIG: "<NIG>"
    Y seleccionar firmante: "<firmante>"
    Cuando se hace click en el botón continuar
    Entonces se muestra el detalle de la remisión
    Y seleccionar el tipo de subida del expediente: "<tipo subida>"
    Y adjuntar expediente en formato zip
    Y se hace click en el botón continuar detalle de remisión
    Y se hace click en el botón continuar confirmar remisión
    Entonces se valida que la remisión a comenzado su proceso


    Ejemplos:
      | provincia | municipio | organo destino                               | jurisdiccion | clase                           | nro proc | año  | NIG                 | firmante                 |tipo subida|
      | SEVILLA   | Sevilla   | JUZGADO DE PRIMERA INSTANCIA Nº 3 DE SEVILLA | Civil        | Ejecución de títulos judiciales | 000010   | 2017 | 4109142120170000016 | PEDRO MANUEL COBOS RAMOS |Importar expediente en formato .zip desde local|

