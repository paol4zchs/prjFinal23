function teste(){
    const texto = document.querySelector("h1");
    const texto2 = document.querySelector("p");
    const imagem = document.querySelector("img");
    const x = document.querySelector('#x').value;

    if (x== 1){
        texto.innerHTML = "Você é o Jerry!";
        texto2.innerHTML = "Jerry é muito ligeiro.";
        imagem.setAttribute("src","img/jerry.png");
        imagem.setAttribute("width","300px");


    } else if (x== 2){
        texto.innerHTML = "Você é o Tom!";
        texto2.innerHTML = "Tom é rabujento mas tem um bom coração!";
        imagem.setAttribute("src","img/tom.png");
        imagem.setAttribute("width","500px");

    } else {
        texto.innerHTML = " Você é o Spike!";
        texto2.innerHTML = "Bulldog é confiante e traz seriedade.";
        imagem.setAttribute("src","img/spike.png");
        imagem.setAttribute("width","400px");
    }
}
 