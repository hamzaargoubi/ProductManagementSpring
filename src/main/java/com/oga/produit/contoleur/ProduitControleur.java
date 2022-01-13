package com.oga.produit.contoleur;

import com.oga.produit.entities.Produit;
import com.oga.produit.services.ProduitService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/produit")
public class ProduitControleur {
    private ProduitService produitService;

    ProduitControleur (ProduitService produitService1){
        this.produitService=produitService1;
    }

    @PostMapping("/addProduit/{id}")
    public Produit addProduct(@RequestBody Produit produit){
        return produitService.createProd(produit);
    }

    @PutMapping("/updateProduit/{id}")
    public Produit updateProduit(@RequestBody Produit produit, @PathVariable Long id){
        return produitService.updateProd(produit, id);
    }

    @DeleteMapping ("/deletProduit/{id}")
    public Boolean deleteProduit(@PathVariable Long id){
        return produitService.deleteProd(id);
    }
    @GetMapping("/getProduit/{id}")
    public Produit getOneProduct(@PathVariable Long id){
        return produitService.getOneProd(id);
    }

    @GetMapping("/")
    public List<Produit> getListProduct(){
        return produitService.getListProduct();
    }

    @PutMapping ("/{idProduit}/addCateoryToProduit/{idCategory}")
    public Produit addCategoryToProduit(@PathVariable Long idProduit, @PathVariable Long idCategory){
        return produitService.addCategoryToProduit(idProduit,idCategory);
    }


}
