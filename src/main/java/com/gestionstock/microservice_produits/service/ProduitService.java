package com.gestionstock.microservice_produits.service;

import com.gestionstock.microservice_produits.model.Produit;
import com.gestionstock.microservice_produits.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Optional<Produit> getProduitById(Long id) {
        return produitRepository.findById(id);
    }

    public Produit ajouterProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id);
    }
}