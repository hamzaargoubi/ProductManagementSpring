package com.oga.produit.services;

import com.oga.produit.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit createProd(Produit cat);
    Produit updateProd(Produit produit, Long id);
    Boolean deleteProd(Long id);
    Produit getOneProd (Long id);
    List<Produit> getListProduct ();

    Produit addCategoryToProduit(Long idProduit, Long idCategory);
}
