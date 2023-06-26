<%-- 
    Document   : ajoutDevisSpectacleSuivant
    Created on : Jun 20, 2023, 1:40:00 AM
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Artiste> listArtiste = (ArrayList<Artiste>) request.getAttribute("listArtiste");
    ArrayList<V_sono> listSono = (ArrayList<V_sono>) request.getAttribute("listSono");
    ArrayList<V_logistique> listLogistique = (ArrayList<V_logistique>) request.getAttribute("listLogistique");
    ArrayList<Depense> listDepense = (ArrayList<Depense>) request.getAttribute("listDepense");
    ArrayList<V_lieucategorieplace> listCategoriePlace = (ArrayList<V_lieucategorieplace>) request.getAttribute("listCategoriePlace");
    int lieu = (Integer) request.getAttribute("lieu");
     int dernierPrestation = (Integer) request.getAttribute("dernierPrestation");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutDevisSpectacleSuivant</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter un devis de spectacle</h4>
                </div>

                <form action="ajoutDevisSpectacle" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <input type="hidden" value="<%= lieu %>" name="lieu">
                        <input type="hidden" value="<%= dernierPrestation %>" name="dernierPrestation">
                        <%for (int k = 0; k < listCategoriePlace.size(); k++) {%>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="text"  id="name" class="form-control"
                                       placeholder="Nombre <%= listCategoriePlace.get(k).getCategorie()%>" required="" disabled="true">

                                <label for="floatingInput">Nombre <%= listCategoriePlace.get(k).getCategorie()%></label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="nbrReserve<%= k%>" id="name" class="form-control"
                                       placeholder="" required="">

                                <label for="floatingInput"></label>
                            </div>
                        </div>
                        <%}%>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="artiste" class="form-select" required="" id="artiste">
                                    <option value="0">Nom Artiste</option>
                                    <%for (int i = 0; i < listArtiste.size(); i++) {%>
                                    <option value="<%= listArtiste.get(i).getId()%>-<%= listArtiste.get(i).getNom()%>-<%= listArtiste.get(i).getTarif()%>"><%= listArtiste.get(i).getNom()%>-<%= listArtiste.get(i).getTarif()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="dureeArtiste" id="dureeArtiste" class="form-control"
                                       placeholder="Duree artiste" required="" value="0">

                                <label for="floatingInput">Duree artiste</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <input type="hidden" name="nombreArtiste" id="nombreArtiste" value="0">
                            <button onclick="ajoutArtiste()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                        </div>
                        <table class="table" id="tableauArtiste">
                            <thead>
                                <tr>
                                    <th>Nom artiste</th>
                                    <th>Duree</th>
                                    <th>Montant total</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>


                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="sono" class="form-select" required="" id="sono">
                                    <option value="0">Sonorisation</option>
                                    <%for (int j = 0; j < listSono.size(); j++) {%>
                                    <option value="<%= listSono.get(j).getId()%>-<%= listSono.get(j).getType()%>-<%= listSono.get(j).getTarif()%>"><%= listSono.get(j).getType()%>-<%= listSono.get(j).getTarif()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="dureeSono" id="dureeSono" class="form-control"
                                       placeholder="Duree sono" required="" value="0">

                                <label for="floatingInput">Duree sono</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <input type="hidden" name="nombreSono" id="nombreSono" value="0">
                            <button onclick="ajoutSono()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                        </div>
                        <table class="table" id="tableauSono">
                            <thead>
                                <tr>
                                    <th>Sonorisation</th>
                                    <th>Duree</th>
                                    <th>Montant total</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>


                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="logistique" class="form-select" required="" id="logistique">
                                    <option value="0">Nom logistique</option>
                                    <%for (int k = 0; k < listLogistique.size(); k++) {%>
                                    <option value="<%= listLogistique.get(k).getId()%>-<%= listLogistique.get(k).getType()%>-<%= listLogistique.get(k).getTarif()%>"><%= listLogistique.get(k).getType()%>-<%= listLogistique.get(k).getTarif()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="dureeLogistique" id="dureeLogistique" class="form-control"
                                       placeholder="Duree logistique" required="" value="0">

                                <label for="floatingInput">Duree logistique</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <input type="hidden" name="nombreLogistique" id="nombreLogistique" value="0">
                            <button onclick="ajoutLogistique()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                        </div>
                        <table class="table" id="tableauLogistique">
                            <thead>
                                <tr>
                                    <th>Nom logistique</th>
                                    <th>Duree</th>
                                    <th>Montant total</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="depense" class="form-select" required="" id="depense">
                                    <option value="0">Nom depense</option>
                                    <%for (int t = 0; t < listDepense.size(); t++) {%>
                                    <option value="<%= listDepense.get(t).getId()%>-<%= listDepense.get(t).getType()%>"><%= listDepense.get(t).getType()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="tarifDepense" id="tarifDepense" class="form-control"
                                       placeholder="Tarif depense" required="" value="0">

                                <label for="floatingInput">Tarif depense</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <input type="hidden" name="nombreDepense" id="nombreDepense" value="0">
                            <button onclick="ajoutDepense()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                        </div>
                        <table class="table" id="tableauDepense">
                            <thead>
                                <tr>
                                    <th>Nom depense</th>
                                    <th>Tarif</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>


                        <button class="btn btn-info" type="submit" id="inserer">Enregistrer</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>

