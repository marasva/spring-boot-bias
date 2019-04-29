package taller.systems.com.example.springbootbias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taller.systems.com.example.springbootbias.api.BiasService;
import taller.systems.com.example.springbootbias.domain.WikiPage;

import java.util.List;

@RestController
public class BiasControllerImpl implements BiasController{
    private BiasService biasService;

    @Autowired
    public BiasControllerImpl(BiasService biasService) {
        this.biasService = biasService;
    }

    @Override
    public String index() {
        return "Greetings from Bias Spring Boot!";
    }

    @Override
    public ResponseEntity<List<WikiPage>> getAllWikiPages() {
        return new ResponseEntity<List<WikiPage>>(biasService.getAllWikiPages(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createWikiPage(WikiPage wikiPage) {
        biasService.createWikiPage(wikiPage);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteWikiPage(String wikiPageId) {
        biasService.deleteWikiPage(wikiPageId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<WikiPage> findWikiPageById(String wikiPageId) {
        return new ResponseEntity<WikiPage>((MultiValueMap<String, String>) biasService.getAllWikiPages(), HttpStatus.OK);
    }
}
