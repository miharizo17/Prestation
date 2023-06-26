/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var nbrArtiste = 0;
function ajoutArtiste()
{

    var artiste = document.querySelector('#artiste');
    var dureeArtiste = document.querySelector('#dureeArtiste');
    let artisteValue = artiste.value;
    let dureeArtisteValue = dureeArtiste.value;
    var idArtiste = artisteValue.split("-")[0];
    var nomArtiste = artisteValue.split("-")[1];
    var montantArtiste = artisteValue.split("-")[2];
    var montantTotalArtiste = dureeArtisteValue * montantArtiste;
    var tableau = document.getElementById("tableauArtiste");
//    console.log(laptopIn);
    nbrArtiste++;

    let template = `
        <tr>
            <td><input type="hidden"  value ="${idArtiste}" name="artiste${nbrArtiste}">${nomArtiste}</td>
            <td><input type="hidden"  value ="${dureeArtisteValue}" name="dureeArtiste${nbrArtiste}">${dureeArtisteValue}</td>
            <td><input type="hidden"  value ="${montantTotalArtiste}" name="montantTotalArtiste${nbrArtiste}">${montantTotalArtiste}</td>
        </tr>
    `;
    document.getElementById("nombreArtiste").value = nbrArtiste;
    tableau.getElementsByTagName('tbody')[0].innerHTML += template;
}

var nbrSono = 0;
function ajoutSono()
{

    var sono = document.querySelector('#sono');
    var dureeSono = document.querySelector('#dureeSono');
    let sonoValue = sono.value;
    let dureeSonoValue = dureeSono.value;
    var idSono = sonoValue.split("-")[0];
    var nomSono = sonoValue.split("-")[1];
    var montantSono = sonoValue.split("-")[2];
    var montantTotalSono = dureeSonoValue * montantSono;
    var tableau = document.getElementById("tableauSono");
//    console.log(laptopIn);
    nbrSono++;

    let template = `
        <tr>
            <td><input type="hidden"  value ="${idSono}" name="sono${nbrSono}">${nomSono}</td>
            <td><input type="hidden"  value ="${dureeSonoValue}" name="dureeSono${nbrSono}">${dureeSonoValue}</td>
            <td><input type="hidden"  value ="${montantTotalSono}" name="montantTotalSono${nbrSono}">${montantTotalSono}</td>
        </tr>
    `;
    document.getElementById("nombreSono").value = nbrSono;
    tableau.getElementsByTagName('tbody')[0].innerHTML += template;
}

var nbrLog = 0;
function ajoutLogistique()
{

    var logistique = document.querySelector('#logistique');
    var dureeLogistique = document.querySelector('#dureeLogistique');
    let logistiqueValue = logistique.value;
    let dureeLogistiqueValue = dureeLogistique.value;
    var idLogistique = logistiqueValue.split("-")[0];
    var nomLogistique = logistiqueValue.split("-")[1];
    var montantLogistique = logistiqueValue.split("-")[2];
    var montantTotalLogistique = dureeLogistiqueValue * montantLogistique;
    var tableau = document.getElementById("tableauLogistique");
//    console.log(laptopIn);
    nbrLog++;

    let template = `
        <tr>
            <td><input type="hidden"  value ="${idLogistique}" name="logistique${nbrLog}">${nomLogistique}</td>
            <td><input type="hidden"  value ="${dureeLogistiqueValue}" name="dureeLogistique${nbrLog}">${dureeLogistiqueValue}</td>
            <td><input type="hidden"  value ="${montantTotalLogistique}" name="montantTotalLogistique${nbrLog}">${montantTotalLogistique}</td>
        </tr>
    `;
    document.getElementById("nombreLogistique").value = nbrLog;
    tableau.getElementsByTagName('tbody')[0].innerHTML += template;
}

var nbrDepense = 0;
function ajoutDepense()
{

    var depense = document.querySelector('#depense');
    var tarifDepense = document.querySelector('#tarifDepense');
    let depenseValue = depense.value;
    let tarifDepenseValue = tarifDepense.value;
    var idDepense = depenseValue.split("-")[0];
    var nomDepense = depenseValue.split("-")[1];
    var tableau = document.getElementById("tableauDepense");
//    console.log(laptopIn);
    nbrDepense++;

    let template = `
        <tr>
            <td><input type="hidden"  value ="${idDepense}" name="depense${nbrDepense}">${nomDepense}</td>
            <td><input type="hidden"  value ="${tarifDepenseValue}" name="tarifDepense${nbrDepense}">${tarifDepenseValue}</td>
        </tr>
    `;
    document.getElementById("nombreDepense").value = nbrDepense;
    tableau.getElementsByTagName('tbody')[0].innerHTML += template;
}