package controllers;

import lombok.RequiredArgsConstructor;
import model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CatalogService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/search/{itemTitle}")
    private List<Catalog> getByItem(
            @PathVariable String itemTitle
    ){

        return null;
    }

    @GetMapping("/info/{itemId}")
    private List<Catalog> getBySubject(
            @PathVariable long itemId
    ){

        return null;
    }

    @PutMapping("/catalogs/{catalogId}")
    private ResponseEntity<String> updateCatalog(
            @PathVariable long catalogId
    ){

        return null;

    }

}
