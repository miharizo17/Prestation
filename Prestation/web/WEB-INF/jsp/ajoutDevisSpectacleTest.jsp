<%-- 
    Document   : ajoutDevisSpectacle
    Created on : Jun 19, 2023, 11:41:30 PM
    Author     : Kanto
--%>

<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutDevisSpectacle</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter un devis de spectacle</h4>
                </div>

                <form action="Actu/test" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="card-body" id="insert">
                            <div>
                                Artiste:<select name="laptop" class="select-spacing1" id="laptop">
                                    <option value="Marion"> Marion</option>
                                    <option value="Mahaleo">Mahaleo </option>
                                    <option value="Zay"> Zay</option>
                                </select>
                                <input type="hidden" name="nombreTable" value="0" id="nombreTab">
                                <button onclick="ajoutVente()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                                
                            </div>
                            <table class="table" id="tableau">
                                <thead>
                                    <tr>
                                        <th>Laptop</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                        <div class="card-body" id="sonso1">
                            <div>
                                Sonso:<select name="laptop" class="select-spacing1" id="sonso">
                                    <option value="Premium"> Premium</option>
                                    <option value="Standart">Standart </option>
                                </select>
                                <input type="hidden" name="nombreTable1" value="0" id="nombreTab1">
                                <button onclick="ajoutSonso()" class="btn btn-success" type="button" id="ajouter">Ajouter</button>
                                
                            </div>
                            <table class="table" id="tableau1">
                                <thead>
                                    <tr>
                                        <th>Nom</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                        <button class="btn btn-info" type="submit" id="inserer">Enregistrer</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>

