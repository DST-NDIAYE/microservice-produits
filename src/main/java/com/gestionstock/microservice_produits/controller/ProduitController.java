package com.gestionstock.microservice_produits.controller;


import com.gestionstock.microservice_produits.model.Produit;
import com.gestionstock.microservice_produits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public Optional<Produit> getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @PostMapping
    public Produit ajouterProduit(@RequestBody Produit produit) {
        return produitService.ajouterProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void supprimerProduit(@PathVariable Long id) {
        produitService.supprimerProduit(id);
    }

    @PutMapping("/{id}")
    public Produit mettreAJourProduit(@PathVariable Long id, @RequestBody Produit produit) {
         return produitService.mettreAJourProduit(id, produit);
    }
}