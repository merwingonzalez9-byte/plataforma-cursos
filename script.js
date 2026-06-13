function mostrarMensaje(){

    let nombre = prompt("Ingrese su nombre");

    if(nombre != null && nombre != ""){

        alert(
            "Bienvenido " +
            nombre +
            ". Su inscripción fue realizada correctamente."
        );

    }

}